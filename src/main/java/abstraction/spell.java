package abstraction;

import implementor.EffectEngine;

public abstract class spell  {
    protected EffectEngine eEngine;

    public spell(EffectEngine eEngine) {
        this.eEngine = eEngine;
    }

    public abstract void cast(String target);

    public void setEngine(EffectEngine eEngine) {
        this.eEngine = eEngine;
    }
}
