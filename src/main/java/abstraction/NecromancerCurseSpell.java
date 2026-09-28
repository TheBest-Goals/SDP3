package abstraction;

import implementor.EffectEngine;

public class NecromancerCurseSpell extends spell{

    public NecromancerCurseSpell(EffectEngine eEngine){
        super(eEngine);
    }

    @Override
    public void cast (String target){
        System.out.println("Applyiing dark  curse on:"+ target);
        eEngine.renderEffect("DarkMiasma", 60);
    }
}
