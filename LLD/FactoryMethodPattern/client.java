package LLD.FactoryMethodPattern;

import LLD.FactoryMethodPattern.Factory.weaponFactory;
import LLD.FactoryMethodPattern.Weapon.Weapon;

public class client {
    public static void main(String[] args){
        weaponFactory smgFactory = new LLD.FactoryMethodPattern.Factory.SMGFactory() ;
        Weapon SMG = smgFactory.createWeapon() ;

        SMG.doDamage() ;
        
    }
}
