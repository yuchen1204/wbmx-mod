package games.wbms.ttrmod.item;

import games.wbms.ttrmod.ttrmod;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class modItemGroups {
    public static final RegistryKey<ItemGroup> ttr_Group = register("ttr_Group");


    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(ttrmod.MOD_ID,id));
    }

}
