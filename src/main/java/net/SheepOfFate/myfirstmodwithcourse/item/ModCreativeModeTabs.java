package net.SheepOfFate.myfirstmodwithcourse.item;

import net.SheepOfFate.myfirstmodwithcourse.MCCourseMod;
import net.SheepOfFate.myfirstmodwithcourse.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCCourseMod.MODID);

    public static final Supplier<CreativeModeTab> BLACK_OPAL_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("black_opal_items_creative_mode_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.myfirstmodwithcourse.black_opal_items_creative_mode_tab"))
            .icon(() -> new ItemStack(ModItems.RAW_BLACK_OPAL.get()))
            .displayItems(((parameters, output) -> {
                output.accept(ModItems.RAW_BLACK_OPAL);
                output.accept(ModItems.BLACK_OPAL);
                output.accept(ModItems.CHAINSAW);
            }))

            .build());

    public static final Supplier<CreativeModeTab> BLACK_OPAL_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("black_opal_blocks_creative_mode_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.myfirstmodwithcourse.black_opal_blocks_creative_mode_tab"))
            .icon(() -> new ItemStack(ModBlocks.BLACK_OPAL_BLOCK.get()))
            .displayItems(((parameters, output) -> {
                output.accept(ModBlocks.BLACK_OPAL_BLOCK);
                output.accept(ModBlocks.RAW_BLACK_OPAL_BLOCK);
                output.accept(ModBlocks.BLACK_OPAL_END_ORE);
            }))

            .build());

    public static void register (IEventBus iEventBus){
        CREATIVE_MODE_TABS.register(iEventBus);
    }

}
