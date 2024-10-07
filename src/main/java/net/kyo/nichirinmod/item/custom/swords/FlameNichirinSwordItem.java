package net.kyo.nichirinmod.item.custom.swords;

import net.kyo.nichirinmod.item.custom.NichirinSword;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;

public class FlameNichirinSwordItem extends SwordItem implements NichirinSword  {
    public FlameNichirinSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        firstAbility(pLevel, pPlayer, pUsedHand);
        return super.use(pLevel, pPlayer, pUsedHand);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        entity.setSecondsOnFire(5);
        return super.onLeftClickEntity(stack, player, entity);
    }

    @Override
    public void firstAbility(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if (pPlayer.onGround()) {
            for (BlockPos pos : BlockPos.betweenClosed(pPlayer.blockPosition().offset(-1, 0, -1), pPlayer.blockPosition().offset(1, 0, 1))) {
                if (pLevel.isEmptyBlock(pos)) {
                    pLevel.setBlock(pos, Blocks.FIRE.defaultBlockState(), 11);
                }
            }
        }

    }

    @Override
    public void secondAbility() {

    }

    @Override
    public void passiveAbility() {

    }
}
