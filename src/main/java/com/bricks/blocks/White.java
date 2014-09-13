package com.bricks.blocks;

import net.minecraft.block.material.Material;

public class White extends Black {

	public White(Material rock) {
		super(rock);
		this.setBlockTextureName("bricks:white");
		this.setBlockName("White Bricks");
	}

}