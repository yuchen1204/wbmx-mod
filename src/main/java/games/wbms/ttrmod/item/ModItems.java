package games.wbms.ttrmod.item;

import games.wbms.ttrmod.Ttrmod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ICE_ETHER = registerItems( "ice_ether" , new Item(new Item.Settings()));
    private static Item registerItems(String id,Item item){
        // return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(Ttrmod.MOD_ID, id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(Ttrmod.MOD_ID, id), item);

    }
    public static void registerModItems() {
        Ttrmod.LOGGER.info("Registering Item");
    }
}
