package net.cfodd.woodcuttermod.util;

import net.cfodd.woodcuttermod.WoodCutterMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks{

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(WoodCutterMod.MOD_ID));
        }
    }

    public static class Items{
        public static final TagKey<Item> WOOD_SCRAP= tag("wood_scraps");
        public static final TagKey<Item> SIX_SIDED_LOGS= tag("six_sided_logs");

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(WoodCutterMod.MOD_ID));
        }
    }
}
