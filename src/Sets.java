import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void hashSet(){
        System.out.println("Hash Set");

        java.util.Set<String> names = new HashSet<>();
        names.add("Eko");
        names.add("kurniawan");
        names.add("Dedy");

        for (String name : names ){
            System.out.println(name);
        }

        System.out.println();
    }

    public static void LinkedHasSet(){
        System.out.println("Linked Has Set");

        Set<String> names = new java.util.LinkedHashSet<>();
        names.add("Eko");
        names.add("Ekkurniawan");
        names.add("Dedy");

        for (String name : names ){
            System.out.println(name);
        }

        System.out.println();

    }
}
