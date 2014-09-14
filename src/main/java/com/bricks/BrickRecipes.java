package com.bricks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class BrickRecipes {

	public static void registerRecipes(){
		
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.White, 1),
        		new ItemStack(Blocks.brick_block), new ItemStack(Items.dye, 1, 0));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Blue, 1),
        		new ItemStack(Blocks.brick_block), new ItemStack(Items.dye, 1, 4));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Brown, 1),
        		new ItemStack(Blocks.brick_block), new ItemStack(Items.dye, 1, 3));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Cyan, 1),
        		new ItemStack(Blocks.brick_block), new ItemStack(Items.dye, 1, 6));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Gray, 1),
        		new ItemStack(Blocks.brick_block), new ItemStack(Items.dye, 1, 8));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Green, 1),
        		new ItemStack(Blocks.brick_block), new ItemStack(Items.dye, 1, 2));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Lblue, 1),
        		new ItemStack(Blocks.brick_block), new ItemStack(Items.dye, 1, 12));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Lgray, 1),
        		new ItemStack(Blocks.brick_block), new ItemStack(Items.dye, 1, 7));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Lime, 1),
        		new ItemStack(Blocks.brick_block), new ItemStack(Items.dye, 1, 10));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Magenta, 1),
        		new ItemStack(Blocks.brick_block), new ItemStack(Items.dye, 1, 13));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Orange, 1),
        		new ItemStack(Blocks.brick_block), new ItemStack(Items.dye, 1, 14));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Pink, 1),
        		new ItemStack(Blocks.brick_block), new ItemStack(Items.dye, 1, 9));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Purple, 1),
        		new ItemStack(Blocks.brick_block), new ItemStack(Items.dye, 1, 5));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Red, 1),
        		new ItemStack(Blocks.brick_block), new ItemStack(Items.dye, 1, 1));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.White, 1),
        		new ItemStack(Blocks.brick_block), new ItemStack(Items.dye, 1, 15));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Yellow, 1),
        		new ItemStack(Blocks.brick_block), new ItemStack(Items.dye, 1, 11));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Mortar, 16),
        		new ItemStack(Blocks.gravel), new ItemStack(Items.water_bucket));
		
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Iron, 1),
        		new ItemStack(Blocks.iron_block), new ItemStack(BrickReg.Mortar));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Lapis, 1),
        		new ItemStack(Blocks.lapis_block), new ItemStack(BrickReg.Mortar));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Dirt, 1),
        		new ItemStack(Blocks.dirt), new ItemStack(BrickReg.Mortar));
        
        GameRegistry.addShapelessRecipe(new ItemStack(BrickReg.Ice, 1),
        		new ItemStack(Blocks.ice), new ItemStack(BrickReg.Mortar));
	}
	
}
