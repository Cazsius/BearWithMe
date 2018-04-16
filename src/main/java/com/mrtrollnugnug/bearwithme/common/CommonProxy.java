package com.mrtrollnugnug.bearwithme.common;

import com.mrtrollnugnug.bearwithme.handler.ContentHandler;

public class CommonProxy {

    public void preInit() {

    	ContentHandler.initEntities();
		ContentHandler.initEntitySpawns();
		ContentHandler.initBlocks();
		ContentHandler.initItems();
		ContentHandler.initRecipes();
		
    }	

    public void init() {

    }

    public void postInit() {

    }

}
