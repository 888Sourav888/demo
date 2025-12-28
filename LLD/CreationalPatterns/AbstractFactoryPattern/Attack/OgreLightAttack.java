package LLD.CreationalPatterns.AbstractFactoryPattern.Attack;

public class OgreLightAttack implements LightAttack {
    int damage ; 
    public OgreLightAttack(int d ){
        this.damage = BASE_DAMAGE + d  ;
    }
    @Override
    public void lightAttack() {
        System.out.println("Ogre Light Attack with damage: " + damage);
    }
    
}
