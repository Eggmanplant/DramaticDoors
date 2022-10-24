package com.fizzware.dramaticdoors.blockentities;

import java.util.concurrent.atomic.AtomicReference;

import javax.annotation.Nullable;

import com.fizzware.dramaticdoors.DDTags;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class TallNetheriteDoorBlockEntity extends TileEntity
{
	
	public String password = null;
	
	public TallNetheriteDoorBlockEntity() {
		super(DDBlockEntities.TALL_NETHERITE_DOOR.get());
	}

	@Override
	public CompoundNBT save(CompoundNBT tag) {
		super.save(tag);
        if (this.password != null) {
            tag.putString("Password", this.password);
        }
        return tag;
	}
	
	@Override
	public void load(BlockState state, CompoundNBT tag) {
		super.load(state, tag);
        if (tag.contains("Password")) {
            this.password = tag.getString("Password");
        }
	}
	
    public void setPassword(String password) {
        this.password = password;
    }

    public void setPassword(ItemStack stack) {
        this.setPassword(stack.getHoverName().getString());
    }
    
    @Nullable
    public String getPassword() {
        return this.password;
    }

    public void clearOwner() {
        this.password = null;
    }

    public static boolean isCorrectKey(ItemStack key, String password) {
        return key.getHoverName().getString().equals(password);
    }

    public boolean isCorrectKey(ItemStack key) {
        return isCorrectKey(key, this.password);
    }

    public enum KeyStatus {
        CORRECT_KEY,
        INCORRECT_KEY,
        NO_KEY
    }

    public static KeyStatus hasKeyInInventory(PlayerEntity player, String key) {
        if (key == null) return KeyStatus.CORRECT_KEY;
        KeyStatus found = KeyStatus.INCORRECT_KEY;

        AtomicReference<IItemHandler> itemHandler = new AtomicReference<>();
        player.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(itemHandler::set);
        if (itemHandler.get() != null) {
            for (int _idx = 0; _idx < itemHandler.get().getSlots(); _idx++) {
                ItemStack stack = itemHandler.get().getStackInSlot(_idx);
                if (stack.getItem().is(DDTags.KEY)) {
                    found = KeyStatus.INCORRECT_KEY;
                    if (isCorrectKey(stack, key)) return KeyStatus.CORRECT_KEY;
                }
            }
        }
        return found;
    }

    public static boolean doesPlayerHaveKeyToOpen(PlayerEntity player, String lockPassword, boolean feedbackMessage, @Nullable String translName) {
        KeyStatus key = hasKeyInInventory(player, lockPassword);
        if (key == KeyStatus.INCORRECT_KEY) {
            if (feedbackMessage) {
                player.displayClientMessage(new TranslationTextComponent("message.supplementaries.safe.incorrect_key"), true);
            }
            return false;
        } 
        else if (key == KeyStatus.CORRECT_KEY) {
        	return true;
        }
        if (feedbackMessage) {
            player.displayClientMessage(new TranslationTextComponent("message.supplementaries." + translName + ".locked"), true);
        }
        return false;
    }


    //returns true if door has to open
    public boolean handleAction(PlayerEntity player, Hand handIn, String translName) {
        if (player.isSpectator()) return false;

        ItemStack stack = player.getItemInHand(handIn);

        boolean isKey = stack.getItem().is(DDTags.KEY);
        //clear ownership
        if (player.isCrouching() && isKey && (player.isCreative() || this.isCorrectKey(stack))) {
        	this.clearOwner();
            player.displayClientMessage(new TranslationTextComponent("message.supplementaries.safe.cleared"), true);
            this.level.playSound(null, worldPosition.getX() + 0.5, worldPosition.getY() + 0.5, worldPosition.getZ() + 0.5, SoundEvents.IRON_TRAPDOOR_OPEN, SoundCategory.BLOCKS, 0.5F, 1.5F);
            return false;
        }
        //set key
        else if (this.password == null) {
            if (isKey) {
            	this.setPassword(stack);
                player.displayClientMessage(new TranslationTextComponent("message.supplementaries.safe.assigned_key", this.password), true);
                this.level.playSound(null, worldPosition.getX() + 0.5, worldPosition.getY() + 0.5, worldPosition.getZ() + 0.5, SoundEvents.IRON_TRAPDOOR_OPEN, SoundCategory.BLOCKS, 0.5F, 1.5F);
                return false;
            }
            return true;
        }
        //open
        else return player.isCreative() || doesPlayerHaveKeyToOpen(player, this.password, true, translName);
    }

    /*@Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }*/
}
