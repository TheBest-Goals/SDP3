package main;

import abstraction.NecromancerCurseSpell;
import abstraction.spell;
import implementor.EffectEngine;
import implementor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("===RPG spell&effect engine demo===");

        EffectEngine engine1 = EffectEngineSelector.selectEngine("modern", 80);
        spell fireball = new NecromancerCurseSpell(engine1);
        fireball.cast("Dragon Boss");

        EffectEngine engine2 = EffectEngineSelector.selectEngine("physicalHit", 90);
        spell curse = new NecromancerCurseSpell(engine2);
        curse.cast("Castle Gates");

        System.out.println("\n === Finished===");
    }
}