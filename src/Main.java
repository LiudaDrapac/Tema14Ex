import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> animale = new ArrayList<>();
        animale.add("Elefant");
        animale.add("Leu");
        animale.add("Lup");
        animale.add("Jaguar");
        animale.add("Zebra");

        List<String> animale2 = new ArrayList<>();
        animale2.add("Capra");
        animale2.add("Cal");

        animale.addAll(animale2);
        System.out.println(animale);

        animale.remove(1);
        System.out.println(animale);
        System.out.println(animale.contains("Lup"));
        System.out.println(animale.contains("Iepure"));
        System.out.println(animale.equals(animale2));
        System.out.println(animale.size());
        System.out.println(animale.get(4));
        System.out.println(animale.set(0, "Elefant"));






    }
}