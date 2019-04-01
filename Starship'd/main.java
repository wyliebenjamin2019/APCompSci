import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Overall available fleet:");
        ArrayList<Starship> fleet = new ArrayList<Starship>();
        ArrayList<Starship> offense = new ArrayList<Starship>();
        ArrayList<Starship> deffense = new ArrayList<Starship>();

        String a[] =  new String[]{"Reliant","Enterprise","Yorktown","Saratoga","Voyager","Discovery","Constitution","Constellation","Grissom","Defiant","Intrepid","Britaan","Stargazer","Yamato","Iowa","Galaxy","Ambassador","Nimitz","Equinox","Relativity"};

        for(int i=0;i<5;i++) {
            fleet.add(new Escort(a[i]));
        }
        for(int i=5;i<10;i++) {
            fleet.add(new Frigate(a[i]));
        }
        for(int i=10;i<15;i++) {
            fleet.add(new Cruiser(a[i]));
        }
        for(int i=15;i<20;i++) {
            fleet.add(new Battleship(a[i]));
        }

        System.out.printf("\nNumber of Ships: %d",fleet.size());
    }
}
