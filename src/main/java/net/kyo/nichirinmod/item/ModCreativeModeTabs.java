package net.kyo.nichirinmod.item;

import net.kyo.nichirinmod.NichirinMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NichirinMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> NICHIRIN_TAB = CREATIVE_MODE_TABS.register("nichirin_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NICHIRIN.get()))
                    .title(Component.translatable("creativetab.nichirin_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_NICHIRIN.get());
                        output.accept(ModItems.NICHIRIN.get());
                        output.accept(ModItems.NICHIRIN_SHARD.get());
                        output.accept(ModItems.DEMON_SOUL.get());
                        output.accept(ModItems.NICHIRIN_SWORD.get());
                        output.accept(ModItems.FLAME_NICHIRIN_SWORD.get());
                        output.accept(ModItems.ICE_NICHIRIN_SWORD.get());
                        output.accept(ModItems.THUNDER_NICHIRIN_SWORD.get());
//                        output.accept(ModItems.INSECT_NICHIRIN_SWORD.get());
//                        output.accept(ModItems.SUN_NICHIRIN_SWORD.get());
                    })
                    .build());
}
