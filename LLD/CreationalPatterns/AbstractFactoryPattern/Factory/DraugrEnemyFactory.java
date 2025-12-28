package LLD.CreationalPatterns.AbstractFactoryPattern.Factory;

import LLD.CreationalPatterns.AbstractFactoryPattern.Attack.DraugrHeavyAttack;
import LLD.CreationalPatterns.AbstractFactoryPattern.Attack.DraugrLightAttack;
import LLD.CreationalPatterns.AbstractFactoryPattern.Attack.HeavyAttack;
import LLD.CreationalPatterns.AbstractFactoryPattern.Attack.LightAttack;

public class DraugrEnemyFactory implements EnemyFactory {
    @Override
    public HeavyAttack createHeavyAttack(int damage) {
        return new DraugrHeavyAttack(damage);
    }

    @Override
    public LightAttack createLightAttack(int damage) {
        return new DraugrLightAttack(damage);
    }
    
}
