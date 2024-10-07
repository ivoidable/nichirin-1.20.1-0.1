package net.kyo.nichirinmod.item.custom.swords;

import net.kyo.nichirinmod.item.custom.NichirinSword;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class IceNichirinSwordItem extends SwordItem implements NichirinSword {
    public IceNichirinSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public void firstAbility(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {

    }

    @Override
    public void secondAbility() {

    }

    @Override
    public void passiveAbility() {

    }
}
