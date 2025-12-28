package LLD.CreationalPatterns.PrototypePattern.Prototype;

public class Enemy implements EnemyPrototype {
    public int damage; 
    public int health ; 
    public String type ; 
    public Enemy(int damage, int health, String type) {
        this.damage = damage; 
        this.health = health ; 
        this.type = type ; 
    }

    @Override
    public Enemy clone() {
        return new Enemy(this.damage, this.health, this.type) ; 
    }

    public void attack() {
        System.out.println(this.type + " attacks with damage: " + this.damage) ; 
    }

    public void displayHealth(){
        System.out.println(this.type + " has health: " + this.health) ;
    }

}
