package LLD.CreationalPatterns.AbstractFactoryPattern;

import LLD.CreationalPatterns.AbstractFactoryPattern.Attack.HeavyAttack;
import LLD.CreationalPatterns.AbstractFactoryPattern.Attack.LightAttack;

public class Draugr extends Enemy{
    public Draugr(LightAttack la , HeavyAttack ha){
        this.lightAttack = la ; 
        this.heavyAttack = ha ; 
    }
}
