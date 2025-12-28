package LLD.CreationalPatterns.AbstractFactoryPattern.Factory;

import LLD.CreationalPatterns.AbstractFactoryPattern.Attack.HeavyAttack;
import LLD.CreationalPatterns.AbstractFactoryPattern.Attack.LightAttack;

public interface EnemyFactory {

    HeavyAttack createHeavyAttack(int damage);
    LightAttack createLightAttack(int damage);
    
} 