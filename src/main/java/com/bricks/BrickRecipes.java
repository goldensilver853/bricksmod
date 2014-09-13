package com.bricks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class BrickRecipes {

	public static void registerRecipes(){
		
        GameRegistry.addRecipe(new ShapedOreRecipe(BrickReg.Black, true, new Object[]{
                "FBX", "CXX", "XXX", Character.valueOf('B'), ("dyeBlack"), Character.valueOf('F'), (Blocks.brick_block)
                }));
        
        GameRegistry.addRecipe(new ShapedOreRecipe(BrickReg.Blue, true, new Object[]{
                "FBX", "CXX", "XXX", Character.valueOf('B'), ("dyeBlue"), Character.valueOf('F'), (Blocks.brick_block)
                }));
        
        GameRegistry.addRecipe(new ShapedOreRecipe(BrickReg.Brown, true, new Object[]{
                "FBX", "CXX", "XXX", Character.valueOf('B'), ("dyeBrown"), Character.valueOf('F'), (Blocks.brick_block)
                }));
        
        GameRegistry.addRecipe(new ShapedOreRecipe(BrickReg.Cyan, true, new Object[]{
                "FBX", "CXX", "XXX", Character.valueOf('B'), ("dyeCyan"), Character.valueOf('F'), (Blocks.brick_block)
                }));
        
        GameRegistry.addRecipe(new ShapedOreRecipe(BrickReg.Gray, true, new Object[]{
                "FBX", "CXX", "XXX", Character.valueOf('B'), ("dyeGray"), Character.valueOf('F'), (Blocks.brick_block)
                }));
        
        GameRegistry.addRecipe(new ShapedOreRecipe(BrickReg.Green, true, new Object[]{
                "FBX", "CXX", "XXX", Character.valueOf('B'), ("dyeGreen"), Character.valueOf('F'), (Blocks.brick_block)
                }));
        
        GameRegistry.addRecipe(new ShapedOreRecipe(BrickReg.Lblue, true, new Object[]{
                "FBX", "CXX", "XXX", Character.valueOf('B'), ("dyeLightBlue"), Character.valueOf('F'), (Blocks.brick_block)
                }));
        
        GameRegistry.addRecipe(new ShapedOreRecipe(BrickReg.Lgray, true, new Object[]{
                "FBX", "CXX", "XXX", Character.valueOf('B'), ("dyeLightGray"), Character.valueOf('F'), (Blocks.brick_block)
                }));
        
        GameRegistry.addRecipe(new ShapedOreRecipe(BrickReg.Lime, true, new Object[]{
                "FBX", "CXX", "XXX", Character.valueOf('B'), ("dyeLime"), Character.valueOf('F'), (Blocks.brick_block)
                }));
        
        GameRegistry.addRecipe(new ShapedOreRecipe(BrickReg.Magenta, true, new Object[]{
                "FBX", "CXX", "XXX", Character.valueOf('B'), ("dyeMagenta"), Character.valueOf('F'), (Blocks.brick_block)
                }));
        
        GameRegistry.addRecipe(new ShapedOreRecipe(BrickReg.Orange, true, new Object[]{
                "FBX", "CXX", "XXX", Character.valueOf('B'), ("dyeOrange"), Character.valueOf('F'), (Blocks.brick_block)
                }));
        
        GameRegistry.addRecipe(new ShapedOreRecipe(BrickReg.Pink, true, new Object[]{
                "FBX", "CXX", "XXX", Character.valueOf('B'), ("dyePink"), Character.valueOf('F'), (Blocks.brick_block)
                }));
        
        GameRegistry.addRecipe(new ShapedOreRecipe(BrickReg.Purple, true, new Object[]{
                "FBX", "CXX", "XXX", Character.valueOf('B'), ("dyePurple"), Character.valueOf('F'), (Blocks.brick_block)
                }));
        
        GameRegistry.addRecipe(new ShapedOreRecipe(BrickReg.Red, true, new Object[]{
                "FBX", "CXX", "XXX", Character.valueOf('B'), ("dyeRed"), Character.valueOf('F'), (Blocks.brick_block)
                }));
        
        GameRegistry.addRecipe(new ShapedOreRecipe(BrickReg.White, true, new Object[]{
                "FBX", "CXX", "XXX", Character.valueOf('B'), ("dyeWhite"), Character.valueOf('F'), (Blocks.brick_block)
                }));
        
        GameRegistry.addRecipe(new ShapedOreRecipe(BrickReg.Yellow, true, new Object[]{
                "FBX", "CXX", "XXX", Character.valueOf('B'), ("dyeYellow"), Character.valueOf('F'), (Blocks.brick_block)
                }));
        
		
	}
	
}
