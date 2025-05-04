package net.charlietgg.plentyofminerals.item;

import net.charlietgg.plentyofminerals.PlentyOfMinerals;
import net.charlietgg.plentyofminerals.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PlentyOfMinerals.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PLENTY_OF_MINERALS_TAB =
            CREATIVE_MODE_TABS.register("plenty_of_minerals_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BISMUTH_ORE.get()))
                            .title(Component.translatable("creativetab.plentyofminerals.plenty_of_minerals_tab"))
                            .displayItems(((pParameters, pOutput) -> {

                                pOutput.accept(ModItems.RUBY.get());
                                pOutput.accept(ModItems.BISMUTH.get());

                                pOutput.accept(ModBlocks.RUBY_BLOCK.get());

                                pOutput.accept(ModBlocks.RUBY_ORE.get());
                                pOutput.accept(ModBlocks.BISMUTH_ORE.get());

                            })).build());

    public static final RegistryObject<CreativeModeTab> MINERALS_TAB =
            CREATIVE_MODE_TABS.register("ores_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blocks.DIAMOND_ORE))
                            .title(Component.translatable("creativetab.plentyofminerals.ores_tab"))
                            .displayItems(((pParameters, pOutput) -> {

                                pOutput.accept(Items.COAL_ORE);
                                pOutput.accept(Items.COPPER_ORE);
                                pOutput.accept(Items.DIAMOND_ORE);
                                pOutput.accept(Items.DEEPSLATE_COAL_ORE);
                                pOutput.accept(Items.DEEPSLATE_COPPER_ORE);
                                pOutput.accept(Items.DEEPSLATE_DIAMOND_ORE);
                                pOutput.accept(Items.DEEPSLATE_EMERALD_ORE);
                                pOutput.accept(Items.DEEPSLATE_GOLD_ORE);
                                pOutput.accept(Items.DEEPSLATE_IRON_ORE);
                                pOutput.accept(Items.DEEPSLATE_LAPIS_ORE);
                                pOutput.accept(Items.DEEPSLATE_REDSTONE_ORE);
                                pOutput.accept(Items.EMERALD_ORE);
                                pOutput.accept(Items.GOLD_ORE);
                                pOutput.accept(Items.IRON_ORE);
                                pOutput.accept(Items.LAPIS_ORE);
                                pOutput.accept(Items.NETHER_GOLD_ORE);
                                pOutput.accept(Items.NETHER_QUARTZ_ORE);
                                pOutput.accept(Items.REDSTONE_ORE);

                                pOutput.accept(ModBlocks.RUBY_ORE.get());
                                pOutput.accept(ModBlocks.BISMUTH_ORE.get());

                            })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
