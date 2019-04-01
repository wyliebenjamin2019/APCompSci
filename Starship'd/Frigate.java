import java.util.Random;

public class Frigate extends Starship implements IsDefense{


    public Frigate(String Name){

        Random rand = new Random();
        name = Name;

        hull = 1500 + (rand.nextInt(500)+1);
        shield = 2000 + (rand.nextInt(500)+1);
        beam = 2500 + (rand.nextInt(1000)+1);
        torpedo = 20 + (rand.nextInt(10)+1);

        System.out.printf("%s:      Hull: %d    Shields: %d    Beam Weapons: %d    Torpedoes: %d",Name,hull,shield,beam,torpedo);
        System.out.println();
    }
}
