package games.wbms.ttrmod.item;

import games.wbms.ttrmod.ttrmod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ICE_ETHER = registerItems( "ice_ether" , new Item(new Item.Settings()));
    private static Item registerItems(String id,Item item){
        // return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(ttrmod.MOD_ID, id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(ttrmod.MOD_ID, id), item);

    }
    private static void addItemToItemGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ICE_ETHER);
    }
    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToItemGroup);
        ttrmod.LOGGER.info("Registering Item");
    }
}
