/*     */ package com.linlongyx.sanguo.webgame.common.fight.select.affect;
/*     */ 
/*     */ import com.linlongyx.sanguo.webgame.common.fight.IFight;
/*     */ import com.linlongyx.sanguo.webgame.common.fight.fighter.IFighter;
/*     */ import com.linlongyx.sanguo.webgame.common.fight.skill.Effect;
/*     */ import com.linlongyx.sanguo.webgame.common.structure.Pair;
/*     */ import com.linlongyx.sanguo.webgame.common.util.RandUtil;
/*     */ import com.linlongyx.sanguo.webgame.config.bean.EffectBean;
/*     */ import com.linlongyx.sanguo.webgame.proto.binary.struct.ResultPlayData;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ enum null
/*     */ {
/*     */   public int affect(IFight fight, Pair<Integer, Long> hurtValue, Effect effect, IFighter attacker, IFighter target, ResultPlayData resultPlayData, EffectBean.AffectParaBean affectParaBean) {
/* 119 */     boolean isAffect = RandUtil.isRandTrue(affectParaBean.getPer());
/* 120 */     if (!isAffect) {
/* 121 */       return 0;
/*     */     }
/* 123 */     int fury = affectParaBean.getValue();
/* 124 */     int decFury = Math.min(fury, target.getFury().byteValue());
/* 125 */     target.decFury((byte)decFury);
/* 126 */     resultPlayData.atomData.add(Integer.valueOf(7));
/* 127 */     resultPlayData.atomData.add(Integer.valueOf(target.getGuid()));
/* 128 */     resultPlayData.atomData.add(Integer.valueOf(-decFury));
/*     */     
/* 130 */     return getType();
/*     */   }
/*     */ }


/* Location:              D:\xxsg_52gmsy\game\target\classes\!\com\linlongyx\sanguo\webgame\common\fight\select\affect\AffectFunc$6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */