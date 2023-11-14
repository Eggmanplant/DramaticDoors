package com.fizzware.dramaticdoors.forge.addons.framedblocks;

import java.util.Locale;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;
import xfacthd.framedblocks.api.type.IBlockType;
import xfacthd.framedblocks.api.util.CtmPredicate;
import xfacthd.framedblocks.api.util.SideSkipPredicate;
import xfacthd.framedblocks.api.util.VoxelShapeGenerator;
import xfacthd.framedblocks.common.block.door.FramedDoorBlock;

public enum DDBlockType implements IBlockType
{
	FRAMED_TALL_DOOR( true, false, false, false,  true, false, true, false, FramedDoorBlock.CTM_PREDICATE, new TallDoorSkipPredicate()),
	FRAMED_TALL_IRON_DOOR( true, false, false, false,  true, false, true, false, FramedDoorBlock.CTM_PREDICATE, new TallDoorSkipPredicate());
	
    private final String name = toString().toLowerCase(Locale.ROOT);
    private final boolean canOcclude;
    private final boolean specialHitbox;
    private final boolean specialTile;
    private final boolean waterloggable;
    private final boolean blockItem;
    private final boolean allowIntangible;
    private final boolean doubleBlock;
    private final boolean lockable;
    private final CtmPredicate ctmPredicate;
    private final SideSkipPredicate skipPredicate;
    private final VoxelShapeGenerator shapeGen;
	
    DDBlockType(boolean canOcclude, boolean specialHitbox, boolean specialTile, boolean waterloggable, boolean blockItem, boolean allowIntangible, boolean doubleBlock, boolean lockable, CtmPredicate ctmPredicate, SideSkipPredicate skipPredicate)
    {
        this(canOcclude, specialHitbox, specialTile, waterloggable, blockItem, allowIntangible, doubleBlock, lockable, ctmPredicate, skipPredicate, VoxelShapeGenerator.EMTPTY);
    }
    
    DDBlockType(boolean canOcclude, boolean specialHitbox, boolean specialTile, boolean waterloggable, boolean blockItem, boolean allowIntangible, boolean doubleBlock, boolean lockable, CtmPredicate ctmPredicate, SideSkipPredicate skipPredicate, VoxelShapeGenerator shapeGen)
    {
        this.canOcclude = canOcclude;
        this.specialHitbox = specialHitbox;
        this.specialTile = specialTile;
        this.waterloggable = waterloggable;
        this.blockItem = blockItem;
        this.allowIntangible = allowIntangible;
        this.doubleBlock = doubleBlock;
        this.lockable = lockable;
        this.ctmPredicate = ctmPredicate;
        this.skipPredicate = skipPredicate;
        this.shapeGen = shapeGen;
    }
		
	@Override
	public int compareTo(IBlockType other) {
		if (!(other instanceof DDBlockType type))
        {
            return 1;
        }
        return compareTo(type);
	}

	@Override
	public ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
        return shapeGen.generate(states);
	}

	@Override
	public String getName() { return name; }

    @Override
    public boolean canOccludeWithSolidCamo() { return canOcclude; }

	@Override
	public boolean hasBlockItem() { return blockItem; }

	@Override
	public boolean hasSpecialHitbox() { return specialHitbox; }

	@Override
	public boolean hasSpecialTile() { return specialTile; }

    @Override
    public boolean allowMakingIntangible() { return allowIntangible; }

    @Override
    public boolean isDoubleBlock() { return doubleBlock; }

    @Override
    public boolean canLockState() { return lockable; }
	
	@Override
	public boolean supportsWaterLogging() { return waterloggable; }
    
	@Override
	public CtmPredicate getCtmPredicate() { return ctmPredicate; }

	@Override
	public SideSkipPredicate getSideSkipPredicate() { return skipPredicate; }

}
