package LLD.CreationalPatterns.FactoryMethodPattern;

import LLD.CreationalPatterns.FactoryMethodPattern.Factory.weaponFactory;
import LLD.CreationalPatterns.FactoryMethodPattern.Weapon.Weapon;

public class client {
    public static void main(String[] args){
        weaponFactory smgFactory = new LLD.CreationalPatterns.FactoryMethodPattern.Factory.SMGFactory() ;
        Weapon SMG = smgFactory.createWeapon() ;

        SMG.doDamage() ;
        
    }
}
