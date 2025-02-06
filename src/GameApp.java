import java.util.Arrays;
import attackStrategy.CastSpell;
import attackStrategy.SwingSword;
import attackStrategy.ShootArrow;
import defenseStrategy.Dodge;
import defenseStrategy.CreateMagic;
import defenseStrategy.Shield;

public class GameApp {
    public static void main(String[] args) {

        Character knight = new Character("Knight", new SwingSword(),
                Arrays.asList(new Shield(), new Dodge(), new CreateMagic()));

        Character wizard = new Character("Wizard", new CastSpell(), Arrays.asList(new CreateMagic()));

        Character archer = new Character("Archer", new ShootArrow(), Arrays.asList(new Dodge()));


        System.out.println("Knight: ");
        knight.attack();
        knight.defense();

        System.out.println("\nWizard: ");
        wizard.attack();
        wizard.defense();

        System.out.println("\nArcher: ");
        archer.attack();
        archer.defense();

    }
}
