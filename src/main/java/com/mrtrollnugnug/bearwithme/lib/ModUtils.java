package com.mrtrollnugnug.bearwithme.lib;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModUtils {

    /**
     * A list of all items from BearWithMe.
     */
    public static final List<Item> ITEMS = new ArrayList<>();

    /**
     * A list of all blocks from BearWithMe.
     */
    public static final List<Block> BLOCKS = new ArrayList<>();

    /**
     * Provides the same functionality as older forge tile registration.
     *
     * @param block The block to register.
     * @param ID The ID to register the block with.
     */
    public static Block registerBlock (Block block, String ID) {

        block.setRegistryName(ID);
        block.setUnlocalizedName(Constants.MOD_ID + "." + ID.toLowerCase().replace("_", "."));
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        BLOCKS.add(block);
        return block;
    }

    /**
     * Provides the same functionality as older forge item registration.
     *
     * @param item The item to register.
     * @param ID The ID to register the item with.
     */
    public static Item registerItem (Item item, String ID) {

        if (item.getRegistryName() == null) {
            item.setRegistryName(ID);
        }

        item.setUnlocalizedName(Constants.MOD_ID + "." + ID.toLowerCase().replace("_", "."));
        GameRegistry.register(item);
        ITEMS.add(item);
        return item;
    }

    /**
     * Registers inventory models for a block that uses meta data.
     *
     * @param block The block to register models for.
     * @param variants The names of the models to use in order of meta data.
     */
    @SideOnly(Side.CLIENT)
    public static void registerBlockInvModel (Block block, String[] variants) {

        registerItemInvModel(Item.getItemFromBlock(block), variants);
    }

    /**
     * Registers inventory models for a block that uses meta data.
     *
     * @param block The block to register models for.
     * @param prefix A prefix for the model names.
     * @param variants The names of the models to use in order of meta data.
     */
    @SideOnly(Side.CLIENT)
    public static void registerBlockInvModel (Block block, String prefix, String[] variants) {

        registerItemInvModel(Item.getItemFromBlock(block), prefix, variants);
    }

    /**
     * Registers inventory models for a block.
     *
     * @param block The block to register models for.
     */
    @SideOnly(Side.CLIENT)
    public static void registerBlockInvModel (Block block) {

        registerItemInvModel(Item.getItemFromBlock(block), 0);
    }

    /**
     * Registers inventory models for a block.
     *
     * @param block The block to register models for.
     * @param meta The meta data to register the model for.
     */
    @SideOnly(Side.CLIENT)
    public static void registerBlockInvModel (Block block, int meta) {

        registerItemInvModel(Item.getItemFromBlock(block), meta);
    }

    /**
     * Registers inventory models for an item.
     *
     * @param item The item to register a model for.
     * @param meta The meta data to register the model for.
     * @param model The name of the model to register.
     */
    @SideOnly(Side.CLIENT)
    public static void registerItemInvModel (Item item, int meta, String model) {

        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(model, "inventory"));
    }

    /**
     * Registers inventory models for an item that uses meta data.
     *
     * @param item The item to register a model for.
     * @param prefix A prefix to use on the variant names.
     * @param variants The names of the models to use, in order of meta data.
     */
    @SideOnly(Side.CLIENT)
    public static void registerItemInvModel (Item item, String prefix, String[] variants) {

        for (int meta = 0; meta < variants.length; meta++) {
            ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName().getResourceDomain() + ":" + prefix + "_" + variants[meta], "inventory"));
        }
    }

    /**
     * Registers inventory models for an item that uses meta data.
     *
     * @param item The item to register a model for.
     * @param variants The names of the models to use, in order of meta data.
     */
    @SideOnly(Side.CLIENT)
    public static void registerItemInvModel (Item item, String[] variants) {

        for (int meta = 0; meta < variants.length; meta++) {
            ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName().getResourceDomain() + ":" + variants[meta], "inventory"));
        }
    }

    /**
     * Registers inventory models for an item.
     *
     * @param item The item to registers a model for.
     */
    @SideOnly(Side.CLIENT)
    public static void registerItemInvModel (Item item) {

        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
    }

    /**
     * Registers inventory models for an item.
     *
     * @param item The item to registers a model for.
     * @param meta The meta data to register the model for.
     */
    @SideOnly(Side.CLIENT)
    public static void registerItemInvModel (Item item, int meta) {

        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
    }
}