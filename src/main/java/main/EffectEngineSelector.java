package main;

import implementor.*;

public class EffectEngineSelector {

    public static EffectEngine selectEngine(String environmentType, int powerLevel){
        System.out.println("Analyzing environment type:"+ environmentType + "power level:"+powerLevel);

        if (environmentType.equalsIgnoreCase("retro")) {
            return new VoxelEffectEngine();
        } else if (environmentType.equalsIgnoreCase("physics_heavy") && powerLevel > 50) {
            return new LegacyPhysicsEngineAdapter(new LegacyPhysicsEngine());
        } else {
            return new ParticleEffectEngine();
        }
    }
}
