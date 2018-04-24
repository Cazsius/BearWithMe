package com.mrtrollnugnug.bearwithme.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

    private static Configuration config = null;
    
	private static int spawnRateGrizzly;
	private static int spawnRateBlack;
	private static int spawnRatePanda;
	private static int spawnRatePolar;
	 
	    public static void initConfig(File file) {
	        setConfig(new Configuration(file));
	        syncConfig();
	    }
	 
	 public static void syncConfig() { 
		 setSpawnRateGrizzly(getConfig().getInt("spawnRateGrizzly", Configuration.CATEGORY_GENERAL, 10, 0, 100, "Set Spawn Rate for Grizzly Bears"));
		 setSpawnRateBlack(getConfig().getInt("spawnRateBlack", Configuration.CATEGORY_GENERAL, 10, 0, 100, "Set Spawn Rate for Black Bears"));
		 setSpawnRatePanda(getConfig().getInt("spawnRatePanda", Configuration.CATEGORY_GENERAL, 10, 0, 100, "Set Spawn Rate for Panda Bears"));
		 setSpawnRatePolar(getConfig().getInt("spawnRatePolar", Configuration.CATEGORY_GENERAL, 10, 0, 100, "Set Spawn Rate for Polar Bears"));
		
		 if (getConfig().hasChanged())
			 getConfig().save();
	 }

	public static Configuration getConfig() {
	        return config;
	}

	public static void setConfig(Configuration config) {
	        ConfigurationHandler.config = config;
	}
	    
	private static void setSpawnRateGrizzly(int spawnRateGrizzly) {
			ConfigurationHandler.spawnRateGrizzly =	spawnRateGrizzly;
	}
	
	private static void setSpawnRateBlack(int spawnRateBlack) {
		ConfigurationHandler.spawnRateBlack = spawnRateBlack;
	}
	
	private static void setSpawnRatePanda(int spawnRatePanda) {
		ConfigurationHandler.spawnRatePanda = spawnRatePanda;
	}
	
	private static void setSpawnRatePolar(int spawnRatePolar) {
		ConfigurationHandler.spawnRatePolar = spawnRatePolar;
	}

	public static int getSpawnRateGrizzly() {
		return spawnRateGrizzly;
	}

	public static int getSpawnRateBlack() {
		return spawnRateBlack;
	}

	public static int getSpawnRatePanda() {
		return spawnRatePanda;
	}
	
	public static int getSpawnRatePolar() {
		return spawnRatePolar;
	}

}
