package LLD.BehaviouralPatterns.StatePattern.State;

import LLD.BehaviouralPatterns.StatePattern.Enemy;

public interface EnemyState {
    void idleAction(Enemy enemy, int playerDistance) ; 
    void hostileAction(Enemy enemy, int playerDistance);
}
