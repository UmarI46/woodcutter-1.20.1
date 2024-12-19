package net.cfodd.woodcuttermod.item;

import net.cfodd.woodcuttermod.WoodCutterMod;
import net.cfodd.woodcuttermod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS=
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WoodCutterMod.MOD_ID);

    //Creates a new tab in the creative menu
    public static final RegistryObject<CreativeModeTab> WOODCUTTER_TAB= CREATIVE_MODE_TABS.register("woodcutter_tab", ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.WOOD_SCRAP.get()))
            //gets the title from the en_us.json using the key passed in
            .title(Component.translatable("creativetab.woodcutter_tab"))
            //Adds items to the newly made tab
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.WOOD_SCRAP.get());
                output.accept(ModBlocks.WOODCUTTER.get());
            })
            .build());

    //Does black magic, I think it speaks back to the main (WoodCutterMod) file
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
