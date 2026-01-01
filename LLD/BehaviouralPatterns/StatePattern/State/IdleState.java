package LLD.BehaviouralPatterns.StatePattern.State;

import LLD.BehaviouralPatterns.StatePattern.Enemy;

public class IdleState implements EnemyState {

    @Override
    public void idleAction(Enemy enemy, int playerDistance) {
        
        if(playerDistance < 5) {

            enemy.setState(new HostileState());
        }
        else{
            System.out.println("Enemy is idling...");
            enemy.setState(new IdleState());
        }
    }

    @Override
    public void hostileAction(Enemy enemy, int playerDistance) {
        
        if(playerDistance <= 5) {
            System.out.println("Enemy is switching to hostile mode!");
            enemy.setState(new HostileState());
        }
        else{
            enemy.setState(new IdleState());
        }
    }
    
}
