package LLD.BehaviouralPatterns.StatePattern;

public class client {
    public static void main(String[] args) {
        Enemy draugr = new Enemy();  
        draugr.hostileAction(5);
        draugr.hostileAction(3);
        draugr.hostileAction(10);
    }
}
