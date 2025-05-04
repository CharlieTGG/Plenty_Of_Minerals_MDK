package net.charlietgg.plentyofminerals.block;

import net.charlietgg.plentyofminerals.PlentyOfMinerals;
import net.charlietgg.plentyofminerals.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PlentyOfMinerals.MOD_ID);

    // Blocks:

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK).setId(BLOCKS.key("ruby_block"))
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BISMUTH_ORE = registerBlock("bismuth_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(BLOCKS.key("bismuth_ore"))
                    .requiresCorrectToolForDrops()));

    // End of blocks.

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath(PlentyOfMinerals.MOD_ID, name)))));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
