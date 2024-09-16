package net.SheepOfFate.myfirstmodwithcourse.item;

import net.SheepOfFate.myfirstmodwithcourse.MCCourseMod;
import net.SheepOfFate.myfirstmodwithcourse.item.custom.ChaisawItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MCCourseMod.MODID);

    public static final DeferredItem<Item> BLACK_OPAL = ITEMS.registerSimpleItem("black_opal");
    public static final DeferredItem<Item> RAW_BLACK_OPAL = ITEMS.registerSimpleItem("raw_black_opal");

    public static final DeferredItem<Item> CHAINSAW = ITEMS.registerItem("chainsaw",
            ChaisawItem::new, new Item.Properties().durability(16));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
