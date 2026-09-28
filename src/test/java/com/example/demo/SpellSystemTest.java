package com.example.demo;

import abstraction.*;
import implementor.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class SpellSystemTest {

    @Test
    void testNormalDelegation() {
        EffectEngine mockEngine = Mockito.mock(EffectEngine.class);

        spell fireball = new MageFireballSpell(mockEngine);
        // Без всяких "target:" — просто передаем строку
        fireball.cast("TargetDummy");

        Mockito.verify(mockEngine, Mockito.times(1)).renderEffect("FireballExplosion", 85);
    }

    @Test
    void testAdapterSuccess() {
        LegacyPhysicsEngine legacyEngine = new LegacyPhysicsEngine();
        EffectEngine adapter = new LegacyPhysicsEngineAdapter(legacyEngine);

        spell curse = new NecromancerCurseSpell(adapter);

        // Убрали "target:"
        assertDoesNotThrow(() -> curse.cast("Wall"));
    }

    @Test
    void testAdapterFailureTranslation() {
        LegacyPhysicsEngine mockLegacy = Mockito.mock(LegacyPhysicsEngine.class);
        Mockito.when(mockLegacy.ApplyVector(Mockito.anyString(), Mockito.anyDouble())).thenReturn(-1);

        EffectEngine adapter = new LegacyPhysicsEngineAdapter(mockLegacy);
        spell shield = new PaladinHolyShieldSpell(adapter);

        Exception exception = assertThrows(EffectRenderException.class, () -> {
            shield.cast("BrokenGate");
        });

        assertTrue(exception.getMessage().contains("Legacy physics engine failed"));
    }
}