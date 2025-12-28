package LLD.CreationalPatterns.AbstractFactoryPattern;

import LLD.CreationalPatterns.AbstractFactoryPattern.Attack.HeavyAttack;
import LLD.CreationalPatterns.AbstractFactoryPattern.Attack.LightAttack;

public class Ogre  extends Enemy{
    public Ogre(LightAttack la , HeavyAttack ha){
        this.lightAttack = la ; 
        this.heavyAttack = ha ; 
    }
    
}
