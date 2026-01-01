package LLD.BehaviouralPatterns.StatePattern;

import LLD.BehaviouralPatterns.StatePattern.State.EnemyState;
import LLD.BehaviouralPatterns.StatePattern.State.IdleState;

public class Enemy {
    private EnemyState state;

    public Enemy() {
        this.state = new IdleState();
    }

    public void setState(EnemyState state) {
        this.state = state;
    }

    public void idleAction(int playerDistance) {
        state.idleAction(this, playerDistance);
    }

    public void hostileAction(int playerDistance) {
        state.hostileAction(this, playerDistance);
    }
}