package net.charlietgg.plentyofminerals.item;

import net.charlietgg.plentyofminerals.PlentyOfMinerals;
import net.charlietgg.plentyofminerals.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PlentyOfMinerals.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PLENTY_OF_MINERALS_TAB =
            CREATIVE_MODE_TABS.register("plenty_of_minerals_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                            .title(Component.translatable("creativetab.plentyofminerals.plenty_of_minerals_tab"))
                            .displayItems(((pParameters, pOutput) -> {

                                pOutput.accept(ModItems.RUBY.get());
                                pOutput.accept(ModItems.BISMUTH.get());

                                pOutput.accept(ModBlocks.RUBY_BLOCK.get());

                            })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
