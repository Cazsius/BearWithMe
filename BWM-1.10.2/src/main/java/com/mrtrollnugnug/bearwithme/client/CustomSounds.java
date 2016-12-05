package com.mrtrollnugnug.bearwithme.client;

import net.minecraft.init.Bootstrap;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class CustomSounds extends SoundEvents
{
	//GrizzlyBear Sounds
	public static final SoundEvent GrizzlyBearIdle1;
	public static final SoundEvent GrizzlyBearIdle2;
	public static final SoundEvent GrizzlyBearIdle3;
	
	//BlackBear Sounds
	public static final SoundEvent BlackBearIdle1;
	public static final SoundEvent BlackBearIdle2;
	public static final SoundEvent BlackBearIdle3;
	
	
	   private static SoundEvent getRegisteredSoundEvent(String id)
	    {
	        SoundEvent soundevent = (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation(id));

	        if (soundevent == null)
	        {
	            throw new IllegalStateException("Invalid Sound requested: " + id);
	        }
	        else
	        {
	            return soundevent;
	        }
	    }

	    static
	    {
	        if (!Bootstrap.isRegistered())
	        {
	            throw new RuntimeException("Accessed Sounds before Bootstrap!");
	        }
	        else
	        {
	GrizzlyBearIdle1 = getRegisteredSoundEvent("ambient.cave");
	GrizzlyBearIdle2 = getRegisteredSoundEvent("ambient.cave");
	GrizzlyBearIdle3 = getRegisteredSoundEvent("ambient.cave");
	
	BlackBearIdle1 = getRegisteredSoundEvent("ambient.cave");
	BlackBearIdle2 = getRegisteredSoundEvent("ambient.cave");
	BlackBearIdle3 = getRegisteredSoundEvent("ambient.cave");
	        }
	    }
}
