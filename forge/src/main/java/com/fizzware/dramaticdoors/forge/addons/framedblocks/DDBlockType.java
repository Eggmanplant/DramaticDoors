package com.fizzware.dramaticdoors.forge.addons.framedblocks;

import java.util.Locale;

import com.google.common.collect.ImmutableList;

import net.minecraft.world.level.block.state.BlockState;
import xfacthd.framedblocks.api.predicate.contex.ConTexMode;
import xfacthd.framedblocks.api.predicate.contex.ConnectionPredicate;
import xfacthd.framedblocks.api.predicate.cull.SideSkipPredicate;
import xfacthd.framedblocks.api.predicate.fullface.FullFacePredicate;
import xfacthd.framedblocks.api.shapes.ShapeGenerator;
import xfacthd.framedblocks.api.shapes.ShapeProvider;
import xfacthd.framedblocks.api.type.IBlockType;
import xfacthd.framedblocks.common.data.BlockType;
import xfacthd.framedblocks.common.data.skippreds.SideSkipPredicates;

public enum DDBlockType implements IBlockType
{	
	FRAMED_TALL_DOOR( true, false, false, false,  true, false, true, false, ConTexMode.FULL_FACE),
	FRAMED_TALL_IRON_DOOR( true, false, false, false,  true, false, true, false, ConTexMode.FULL_FACE);
	
    private final String name = toString().toLowerCase(Locale.ROOT);
    private final boolean canOcclude;
    private final boolean specialHitbox;
    private final boolean specialTile;
    private final boolean waterloggable;
    private final boolean blockItem;
    private final boolean allowIntangible;
    private final boolean doubleBlock;
    private final boolean lockable;
    private final boolean supportsCT;
    private final ConTexMode minCTMode;
    private final ShapeGenerator shapeGen;
	
    public static void addEnums() {

    }
    
    DDBlockType(boolean canOcclude, boolean specialHitbox, boolean specialTile, boolean waterloggable, boolean blockItem, boolean allowIntangible, boolean doubleBlock, boolean lockable, ConTexMode contextMode)
    {
        this(canOcclude, specialHitbox, specialTile, waterloggable, blockItem, allowIntangible, doubleBlock, lockable, contextMode, ShapeGenerator.EMPTY);
    }
    
    DDBlockType(boolean canOcclude, boolean specialHitbox, boolean specialTile, boolean waterloggable, boolean blockItem, boolean allowIntangible, boolean doubleBlock, boolean lockable, ConTexMode contextMode, ShapeGenerator shapeGen)
    {
        this.canOcclude = canOcclude;
        this.specialHitbox = specialHitbox;
        this.specialTile = specialTile;
        this.waterloggable = waterloggable;
        this.blockItem = blockItem;
        this.allowIntangible = allowIntangible;
        this.doubleBlock = doubleBlock;
        this.lockable = lockable;
        this.supportsCT = contextMode != null;
        this.minCTMode = contextMode;
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
	public ShapeProvider generateShapes(ImmutableList<BlockState> states) {
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
	public boolean supportsConnectedTextures() { return this.supportsCT; }
	
	@Override
	public ConTexMode getMinimumConTexMode() { return this.minCTMode; }
	
	@Override
	public FullFacePredicate getFullFacePredicate() {
		return TallDoorFullFacePredicate.INSTANCE;
	}
	
	@Override
	public SideSkipPredicate getSideSkipPredicate() { 
		return SideSkipPredicates.PREDICATES.get(BlockType.FRAMED_CUBE); 
	}

	@Override
	public ConnectionPredicate getConnectionPredicate() { 
		return TallDoorConnectionPredicate.INSTANCE; 
	}
}
