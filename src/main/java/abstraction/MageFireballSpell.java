package abstraction;

import implementor.EffectEngine;

public class MageFireballSpell  extends spell{

    public MageFireballSpell(EffectEngine eEngine) {
        super(eEngine);
    }

    @Override
    public void cast(String target){
        System.out.println("MageFireballSpell cast" + target);

        eEngine.renderEffect("FireballExplosion",85);
    }
}
