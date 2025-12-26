package LLD.FactoryMethodPattern.Weapon;

public interface Weapon {
    void setAmmo(int ammo); 
    void setDamage(int damage) ;
    void setBulletRate(int bulletRate) ; 

    int getAmmo() ;
    int getDamage() ;
    int getBulletRate() ; 

    void doDamage() ; 
}
