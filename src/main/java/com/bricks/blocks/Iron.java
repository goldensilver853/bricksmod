package com.bricks.blocks;

import com.bricks.Bricks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Iron extends Block{

	public Iron(Material iron) {
		super(iron);
		
		this.setStepSound(soundTypeMetal);
		this.setHardness(5.0F);
		this.setResistance(10.0F);
		this.setBlockName("Iron Bricks");
		this.setBlockTextureName("bricks:iron");
		this.setCreativeTab(Bricks.bricksTab);
	}

}
