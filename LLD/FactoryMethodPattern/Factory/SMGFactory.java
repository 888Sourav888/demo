package LLD.FactoryMethodPattern.Factory;
import LLD.FactoryMethodPattern.Weapon.Weapon;
import LLD.FactoryMethodPattern.Weapon.SMG;
public class SMGFactory implements weaponFactory {
    @Override
    public Weapon createWeapon(){
        Weapon smg = new SMG(10) ; 
        return smg ; 
    }
}
