package abstraction;

import implementor.EffectEngine;

public class PaladinHolyShieldSpell extends spell{

    public PaladinHolyShieldSpell(EffectEngine eEngine){
        super(eEngine);
    }

    @Override
    public void cast(String target){
        System.out.println("Summoning Holy Shield for:"+ target);
        eEngine.renderEffect("GoldenAura    ", 100);
    }

}
