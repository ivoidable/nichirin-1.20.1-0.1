package net.kyo.nichirinmod.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public interface NichirinSword {

    public void firstAbility(Level pLevel, Player pPlayer, InteractionHand pUsedHand);

    public void secondAbility();

    public void passiveAbility();
}
