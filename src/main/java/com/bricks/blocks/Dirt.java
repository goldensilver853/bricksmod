package com.bricks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;

import com.bricks.Bricks;

public class Dirt extends Block{
	
	public Dirt(Material ground){
		super(ground);
		
		this.setStepSound(soundTypeGravel);
		this.setBlockTextureName("bricks:dirt");
		this.setBlockName("Dirt Bricks");
		this.setCreativeTab(Bricks.bricksTab);
		}

}
