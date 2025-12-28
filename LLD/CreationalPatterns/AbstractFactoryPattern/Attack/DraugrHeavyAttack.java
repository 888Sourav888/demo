package LLD.CreationalPatterns.AbstractFactoryPattern.Attack;

public class DraugrHeavyAttack implements HeavyAttack {
    int damage ; 
    public DraugrHeavyAttack(int d ){
        this.damage = BASE_DAMAGE + d  ;
    }
    @Override
    public void heavyAttack() {
        System.out.println("Draugr Heavy Attack with damage: " + damage);
    }
    
}
