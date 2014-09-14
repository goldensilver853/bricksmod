package com.bricks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.bricks.Bricks;

public class Black extends Block {

	public Black (Material rock) {
		super(rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(3.0f);
		this.setResistance(5.5f);
		this.setBlockName("Black Bricks");
		this.setBlockTextureName("bricks:black");
		this.setCreativeTab(Bricks.bricksTab);
	}


}