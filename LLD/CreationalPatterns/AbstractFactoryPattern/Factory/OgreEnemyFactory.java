package LLD.CreationalPatterns.AbstractFactoryPattern.Factory;

import LLD.CreationalPatterns.AbstractFactoryPattern.Attack.HeavyAttack;
import LLD.CreationalPatterns.AbstractFactoryPattern.Attack.LightAttack;
import LLD.CreationalPatterns.AbstractFactoryPattern.Attack.OgreHeavyAttack;
import LLD.CreationalPatterns.AbstractFactoryPattern.Attack.OgreLightAttack;

public class OgreEnemyFactory implements EnemyFactory {
    @Override
    public HeavyAttack createHeavyAttack(int damage) {
        return new OgreHeavyAttack(damage);
    }

    @Override
    public LightAttack createLightAttack(int damage) {
        return new OgreLightAttack(damage);
    }
    
}
