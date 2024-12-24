package net.cfodd.woodcuttermod.item;

import net.cfodd.woodcuttermod.WoodCutterMod;
import net.cfodd.woodcuttermod.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WoodCutterMod.MOD_ID);

    //How to create a new item
    public static final RegistryObject<Item> OAK_WOOD_SCRAP = ITEMS.register("oak_wood_scrap", () -> new FuelItem(new Item.Properties(),200));


    //Does black magic, I think it speaks back to the main (WoodCutterMod) file
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
