package com.bricks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.bricks.blocks.Black;
import com.bricks.blocks.Blue;
import com.bricks.blocks.Brown;
import com.bricks.blocks.Cyan;
import com.bricks.blocks.Gray;
import com.bricks.blocks.Green;
import com.bricks.blocks.Lblue;
import com.bricks.blocks.Lgray;
import com.bricks.blocks.Lime;
import com.bricks.blocks.Magenta;
import com.bricks.blocks.Orange;
import com.bricks.blocks.Pink;
import com.bricks.blocks.Purple;
import com.bricks.blocks.Red;
import com.bricks.blocks.White;
import com.bricks.blocks.Yellow;

import cpw.mods.fml.common.registry.GameRegistry;

public class BrickReg {

	public static Block Black;
	public static Block Blue;
	public static Block Brown;
	public static Block Cyan;
	public static Block Gray;
	public static Block Green;
	public static Block Lblue;
	public static Block Lgray;
	public static Block Lime;
	public static Block Magenta;
	public static Block Orange;
	public static Block Pink;
	public static Block Purple;
	public static Block Red;
	public static Block White;
	public static Block Yellow;
	
	public static void registerBlocks(){
		
		Black = new Black(Material.rock);
		Blue = new Blue(Material.rock);
		Brown = new Brown(Material.rock);
		Cyan = new Cyan(Material.rock);
		Gray = new Gray(Material.rock);
		Green = new Green(Material.rock);
		Lblue = new Lblue(Material.rock);
		Lgray = new Lgray(Material.rock);
		Lime = new Lime(Material.rock);
		Magenta = new Magenta(Material.rock);
		Orange = new Orange(Material.rock);
		Pink = new Pink(Material.rock);
		Purple = new Purple(Material.rock);
		Red = new Red(Material.rock);
		White = new White(Material.rock);
		Yellow = new Yellow(Material.rock);
		
		GameRegistry.registerBlock(Black, "Black Bricks");		
		GameRegistry.registerBlock(Blue, "Blue Bricks");
		GameRegistry.registerBlock(Brown, "Brown Bricks");
		GameRegistry.registerBlock(Cyan, "Cyan Bricks");
		GameRegistry.registerBlock(Gray, "Gray Bricks");
		GameRegistry.registerBlock(Green, "Green Bricks");
		GameRegistry.registerBlock(Lblue, "Lblue Bricks");
		GameRegistry.registerBlock(Lgray, "Lgray Bricks");
		GameRegistry.registerBlock(Lime, "Lime Bricks");
		GameRegistry.registerBlock(Magenta, "Magenta Bricks");
		GameRegistry.registerBlock(Orange, "Orange Bricks");
		GameRegistry.registerBlock(Pink, "Pink Bricks");
		GameRegistry.registerBlock(Purple, "Purple Bricks");
		GameRegistry.registerBlock(Red, "Red Bricks");
		GameRegistry.registerBlock(White, "White Bricks");
		GameRegistry.registerBlock(Yellow, "Yellow Bricks");
		
	}
	
}
