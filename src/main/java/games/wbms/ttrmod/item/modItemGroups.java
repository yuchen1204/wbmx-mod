package games.wbms.ttrmod.item;

import games.wbms.ttrmod.ttrmod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class modItemGroups {
    public static final ItemGroup TTRMOD = Registry.register(Registries.ITEM_GROUP,Identifier.of(ttrmod.MOD_ID,"ttrmod"),
            ItemGroup.create(null,-1).displayName(Text.translatable("itemGroup.ttrmod"))
                    .icon(() -> new ItemStack(ModItems.ICE_ETHER))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ICE_ETHER);
                    }).build());

    public static void registerModItemGroups() {
        ttrmod.LOGGER.info("Registering Mod Item Groups");
    }
    }
