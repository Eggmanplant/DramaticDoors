package com.fizzware.dramaticdoors.blockentities;

import javax.annotation.Nullable;

import com.fizzware.dramaticdoors.DDTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;

// Not used in 1.18.2.
public class TallNetheriteDoorBlockEntity extends BlockEntity
{
	
	public String password = null;
	
	public TallNetheriteDoorBlockEntity(BlockPos pos, BlockState state) {
		super(DDBlockEntities.TALL_NETHERITE_DOOR, pos, state);
	}

	@Override
	public void writeNbt(NbtCompound tag) {
		super.writeNbt(tag);
        if (this.password != null) {
            tag.putString("Password", this.password);
        }
	}
	
	@Override
	public void readNbt(NbtCompound tag) {
		super.readNbt(tag);
        if (tag.contains("Password")) {
            this.password = tag.getString("Password");
        }
	}
	
    public void setPassword(String password) {
        this.password = password;
    }

    public void setPassword(ItemStack stack) {
        this.setPassword(stack.getName().getString());
    }
    
    @Nullable
    public String getPassword() {
        return this.password;
    }

    public void clearOwner() {
        this.password = null;
    }

    public static boolean isCorrectKey(ItemStack key, String password) {
        return key.getName().getString().equals(password);
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
        Inventory inventory = player.getInventory();
        for (int idx = 0; idx < inventory.size(); idx++) {
            ItemStack stack = inventory.getStack(idx);
            if (stack.isIn(DDTags.KEY)) {
                found = KeyStatus.INCORRECT_KEY;
                if (isCorrectKey(stack, key)) return KeyStatus.CORRECT_KEY;
            }
        }
        return found;
    }

    public static boolean doesPlayerHaveKeyToOpen(PlayerEntity player, String lockPassword, boolean feedbackMessage, @Nullable String translName) {
        KeyStatus key = hasKeyInInventory(player, lockPassword);
        if (key == KeyStatus.INCORRECT_KEY) {
            if (feedbackMessage) {
                player.sendMessage(new TranslatableText("message.supplementaries.safe.incorrect_key"), true);
            }
            return false;
        } 
        else if (key == KeyStatus.CORRECT_KEY) {
        	return true;
        }
        if (feedbackMessage) {
            player.sendMessage(new TranslatableText("message.supplementaries." + translName + ".locked"), true);
        }
        return false;
    }


    //returns true if door has to open
    public boolean handleAction(PlayerEntity player, Hand handIn, String translName) {
        if (player.isSpectator()) return false;

        ItemStack stack = player.getStackInHand(handIn);

        boolean isKey = stack.isIn(DDTags.KEY);
        //clear ownership
        if (player.isSneaking() && isKey && (player.isCreative() || this.isCorrectKey(stack))) {
        	this.clearOwner();
            player.sendMessage(new TranslatableText("message.supplementaries.safe.cleared"), true);
            this.world.playSound(null, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundCategory.BLOCKS, 0.5F, 1.5F);
            return false;
        }
        //set key
        else if (this.password == null) {
            if (isKey) {
            	this.setPassword(stack);
                player.sendMessage(new TranslatableText("message.supplementaries.safe.assigned_key", this.password), true);
                this.world.playSound(null, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundCategory.BLOCKS, 0.5F, 1.5F);
                return false;
            }
            return true;
        }
        //open
        else return player.isCreative() || doesPlayerHaveKeyToOpen(player, this.password, true, translName);
    }

    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }
    
	@Override
	public NbtCompound toInitialChunkDataNbt() {
		return createNbt();
	}
}
