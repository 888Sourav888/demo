package LLD.BehaviouralPatterns.StatePattern.State;

import LLD.BehaviouralPatterns.StatePattern.Enemy;

public class HostileState implements EnemyState {

    @Override
    public void idleAction(Enemy enemy, int playerDistance) {
        System.out.println("Enemy is switching to idle mode!");
        if(playerDistance >= 5) {
            enemy.setState(new IdleState());
        }
        else{
            enemy.setState(new HostileState());
        }
    }

    @Override
    public void hostileAction(Enemy enemy, int playerDistance) {
        System.out.println("Enemy is attacking the player!");
        
        if(playerDistance >= 5) {
            System.out.println("deb");
            enemy.setState(new IdleState());
        }
        else{
            enemy.setState(new HostileState());
        }
    }
    
}
