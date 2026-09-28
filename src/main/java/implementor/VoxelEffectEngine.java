package implementor;

public class VoxelEffectEngine implements EffectEngine {
    @Override
    public void renderEffect(String effectName, int intensity) {
        System.out.println("[Voxel Engine] Rendering retro blocky effect for: " + effectName + " with intensity: " + intensity);
    }
}