package LLD.CreationalPatterns.AbstractFactoryPattern.Attack;

public class DraugrLightAttack implements LightAttack {

    int damage ; 
    public DraugrLightAttack(int d ){
        this.damage = BASE_DAMAGE + d  ;
    }


    @Override
    public void lightAttack() {
        System.out.println("Draugr performs a light attack dealing " + damage + " damage.");
    }
    
}
