package com.samcream.realworld.realworld.blocks;

import com.sun.javafx.geom.Vec3d;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;

public class Lathe_CNC extends Block {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    public Lathe_CNC() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(10,6).sound(SoundType.STONE).notSolid());
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
        Vector3d offset = state.getOffset(world, pos);
        switch ((Direction) state.get(FACING)) {
            case UP :
            case DOWN :
            case SOUTH :
            default :
                return VoxelShapes.create(1D, 0D, 1D, -1D, 2D, 0D).withOffset(offset.x, offset.y, offset.z);
            case NORTH :
                return VoxelShapes.create(0D, 0D, 0D, 2D, 2D, 1D).withOffset(offset.x, offset.y, offset.z);
            case WEST :
                return VoxelShapes.create(0D, 0D, 1D, 2D, 2D, -1D).withOffset(offset.x, offset.y, offset.z);
            case EAST :
                return VoxelShapes.create(1D, 0D, 0D, 0D, 2D, 2D).withOffset(offset.x, offset.y, offset.z);
        }
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }



}
