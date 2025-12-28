package LLD.CreationalPatterns.FactoryMethodPattern.Factory;
import LLD.CreationalPatterns.FactoryMethodPattern.Weapon.Weapon;
import LLD.CreationalPatterns.FactoryMethodPattern.Weapon.SMG;
public class SMGFactory implements weaponFactory {
    @Override
    public Weapon createWeapon(){
        Weapon smg = new SMG(10) ; 
        return smg ; 
    }
}
