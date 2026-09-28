package implementor;


public class LegacyPhysicsEngineAdapter implements EffectEngine {

    private final LegacyPhysicsEngine Lengine;

    public LegacyPhysicsEngineAdapter(LegacyPhysicsEngine Lengine) {
        this.Lengine = Lengine;
    }

    @Override
    public void renderEffect(String effectName, int intensity) {
        double convertedPower = intensity/ 10.0;

        int errorCode = Lengine.ApplyVector(effectName,convertedPower);

        if(errorCode == -1){
            throw new EffectRenderException("Legacy physics engine failed:" + effectName);
        }
    }
}
