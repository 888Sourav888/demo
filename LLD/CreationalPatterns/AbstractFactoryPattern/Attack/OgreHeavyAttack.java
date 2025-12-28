package LLD.CreationalPatterns.AbstractFactoryPattern.Attack;

public class OgreHeavyAttack implements HeavyAttack {
    int damage ; 
    public OgreHeavyAttack(int d ){
        this.damage = BASE_DAMAGE + d  ;
    }
    @Override
    public void heavyAttack() {
        System.out.println("Ogre Heavy Attack with damage: " + damage);
    }
    
}
