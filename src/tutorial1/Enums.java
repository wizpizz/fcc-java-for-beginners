package tutorial1;

public class Enums {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Level lvl = Level.LOW;
        String en = lvl.toString(); // Convert enum to string

        Level[] arr = Level.values(); // Convert enum values to array

        for (Level e:arr) {
            System.out.println(e);
        }

        System.out.println(lvl.getLvl());
        System.out.print(Level.valueOf("LOW") + "\n");

        lvl.setLvl(5);
        System.out.println(lvl.getLvl());
    }
}
