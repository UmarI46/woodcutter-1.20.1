package net.cfodd.woodcuttermod.block;

import net.cfodd.woodcuttermod.WoodCutterMod;
import net.cfodd.woodcuttermod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, WoodCutterMod.MOD_ID);

    //Creating your own block, use .of instead of .copy if you want something unique
    public static final RegistryObject<Block> WOODCUTTER= registryBlock("woodcutter", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONECUTTER).sound(SoundType.WOOD).mapColor(MapColor.WOOD)));


    //Creates the block we want
    private static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn= BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    //Creates an item of the block we want
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    //Does black magic, I think it speaks back to the main (WoodCutterMod) file
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
