package com.bricks.items;

import com.bricks.Bricks;

import net.minecraft.item.Item;

public class Mortar extends Item{

	public Mortar(){
		super();
		
		this.setUnlocalizedName("Mortar");
		this.setTextureName("bricks:mortar");
		this.setCreativeTab(Bricks.bricksTab);
		
	}
	
}
