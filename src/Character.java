import attackStrategy.AttackStrategy;
import defenseStrategy.DefenseStrategy;

import java.util.List;

public class Character {
    private String type;
    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategy;

    public Character(String type, AttackStrategy attackStrategy, List<DefenseStrategy> defenseStrategy) {
        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defense() {
        for (DefenseStrategy strategy : defenseStrategy) {
            strategy.defense();
        }
    }
}
