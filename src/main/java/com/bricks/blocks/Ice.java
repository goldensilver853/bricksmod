package com.bricks.blocks;

import java.util.Random;

import com.bricks.Bricks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Ice extends Block{
	
	public Ice(Material ice){
		super(ice);
		
		this.setStepSound(soundTypeGlass);
		this.setCreativeTab(Bricks.bricksTab);
		this.setBlockName("Ice Bricks");
		this.setBlockTextureName("bricks:ice");
		this.setHardness(0.3F);
		this.setResistance(0.6F);
	}
	
    public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }
	

}
