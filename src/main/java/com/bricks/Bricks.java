//Copyright 2014 goldensilver853.
//If you downloaded this mod without this signature, remove it now and get a copy from the author!

package com.bricks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bricks.proxy.CommonProxy;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Bricks.modid, version = Bricks.version)
public class Bricks {
	
	public static final String modid = "Bricks";
	public static final String version = "1.0.1";
	public static final Logger logger = LogManager.getLogger(modid);
	
    public Bricks()
    {
        if (Loader.isModLoaded("Monoblocks"))
        {
            logger.info("[Bricks]: Monoblocks is present!");
            LogManager.getLogger("Monoblocks").info("[Monoblocks]: Time to build!");
        }

    }
	
		
	public static CreativeTabs bricksTab = new CreativeTabs("BricksTab") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
                return Item.getItemFromBlock(BrickReg.Blue);
        }
    };

	
	@Instance(modid)
	public static Bricks instance;
	
	@SidedProxy(clientSide = "com.bricks.proxy.ClientProxy", serverSide = "com.bricks.proxy.CommonProxy")
	public static CommonProxy proxy;
	

	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
		
		proxy.registerRenderThings();
		BrickReg.registerBlocks();
		BrickRecipes.registerRecipes();
        
	}

	@EventHandler
	public void Init(FMLInitializationEvent event){
		
    }
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		System.out.println("[Bricks]: Bricks has successfully loaded!");
	}
	
	
}
