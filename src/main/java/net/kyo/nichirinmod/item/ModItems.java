package net.kyo.nichirinmod.item;

import net.kyo.nichirinmod.NichirinMod;
import net.kyo.nichirinmod.item.custom.swords.FlameNichirinSwordItem;
import net.kyo.nichirinmod.item.custom.swords.IceNichirinSwordItem;
import net.kyo.nichirinmod.item.custom.swords.ThunderNichirinSwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    // Configuring Register
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NichirinMod.MOD_ID);
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    // Finished config

    // Items
    public static final RegistryObject<Item> NICHIRIN = ITEMS.register("nichirin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_NICHIRIN = ITEMS.register("raw_nichirin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NICHIRIN_SHARD = ITEMS.register("nichirin_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DEMON_SOUL = ITEMS.register("demon_soul",
            () -> new Item(new Item.Properties()));


    //  Swords
    public static final RegistryObject<Item> NICHIRIN_SWORD = ITEMS.register("nichirin_sword",
            () -> new SwordItem(Tiers.NETHERITE, 8, 3f, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> FLAME_NICHIRIN_SWORD = ITEMS.register("flame_nichirin_sword",
            () -> new FlameNichirinSwordItem(Tiers.NETHERITE, 8, 3f, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> ICE_NICHIRIN_SWORD = ITEMS.register("ice_nichirin_sword",
            () -> new IceNichirinSwordItem(Tiers.NETHERITE, 8, 3f, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> THUNDER_NICHIRIN_SWORD = ITEMS.register("thunder_nichirin_sword",
            () -> new ThunderNichirinSwordItem(Tiers.NETHERITE, 8, 3f, new Item.Properties().fireResistant()));

//    public static final RegistryObject<Item> INSECT_NICHIRIN_SWORD = ITEMS.register("insect_nichirin_sword",
//            () -> new NichirinSwordItem(Tiers.NETHERITE, 8, 3f, new Item.Properties().fireResistant()));
//
//    public static final RegistryObject<Item> SUN_NICHIRIN_SWORD = ITEMS.register("sun_nichirin_sword",
//            () -> new NichirinSwordItem(Tiers.NETHERITE, 8, 3f, new Item.Properties().fireResistant()));
}
