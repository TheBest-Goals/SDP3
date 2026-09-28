package implementor;

public class ParticleEffectEngine implements EffectEngine {
    @Override
    public void renderEffect(String effectName, int intensity) {
        System.out.println("[Particle Engine] Rendering modern particles for: " + effectName + " with intensity: " + intensity);
    }
}