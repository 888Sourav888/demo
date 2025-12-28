package LLD.CreationalPatterns.FactoryMethodPattern.Weapon;

public class SMG implements Weapon {

    private static final int DEFAULT_DAMAGE = 50;
    private static final int DEFAULT_BULLET_RATE = 100;
    private int ammo;
    private int damage;
    private int bulletRate;

    public SMG(int ammo) {
        this.ammo = ammo;
        this.damage = DEFAULT_DAMAGE;
        this.bulletRate = DEFAULT_BULLET_RATE;
    }

    @Override
    public void doDamage() {
        // implementation here
        System.out.println("SMG dealing " + this.damage + " damage with " + this.bulletRate + " bullet rate. Ammo left: " + this.ammo);
    }

    @Override
    public void setAmmo(int ammo){
        this.ammo = ammo ; 
    }
    @Override
    public int getAmmo(){
        return this.ammo ; 
    } 


    @Override
    public void setDamage(int damage){
        this.damage = damage ; 
    }
    @Override
    public int getDamage(){
        return this.damage ; 
    } 


    @Override
    public void setBulletRate(int bulletRate){
        this.bulletRate = bulletRate ; 
    }
    @Override
    public int getBulletRate(){
        return this.bulletRate ; 
    } 



}