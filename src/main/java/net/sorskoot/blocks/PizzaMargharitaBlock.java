package net.sorskoot.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class PizzaMargharitaBlock extends net.minecraft.block.Block {

    public PizzaMargharitaBlock(Settings settings) {
        super(settings.nonOpaque());        
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos,
            ShapeContext context) {
    
        return VoxelShapes.cuboid(0.0625f, 0f, 0.0625f, 1.0f-0.0625f, 0.125f, 1.0f-0.0625f);
    
    }
    
}
