package net.charlietgg.plentyofminerals.item;

import net.charlietgg.plentyofminerals.PlentyOfMinerals;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PlentyOfMinerals.MOD_ID);

    // Items:

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().setId(ITEMS.key("ruby"))));

    public static final RegistryObject<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties().setId(ITEMS.key("bismuth"))));

    public static final RegistryObject<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties().setId(ITEMS.key("raw_bismuth"))));

    // End of items.

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
