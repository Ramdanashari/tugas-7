import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collections {
    static Collection<String> names = new ArrayList<>();

    static void addCollection(){
        System.out.println("addCollection");

        names.add("eko");
        names.add("kurniawan");
        names.addAll(Arrays.asList("jamal", "malik"));

        for(String name : names){
            System.out.println(name);
        }
        System.out.println();
    }

    static void removeCollection(){
        System.out.println("Remove Collection");

        names.add("eko");
        names.add("kurniawan");
        names.addAll(Arrays.asList("jamal", "malik"));

        System.out.println(names.contains("eko"));
        System.out.println(names.containsAll(Arrays.asList("jamal", "malik")));

        System.out.println();
    }

    static void checkCollection(){
        System.out.println("check Collection");

        names.add("Eko");
        names.add("kurniawan");
        names.addAll(Arrays.asList("jamal" , "malik"));

        names.remove("Eko");
        names.removeAll(Arrays.asList("jamal", "malik"));

        System.out.println(names.contains("Eko"));
        System.out.println(names.containsAll(Arrays.asList("jamal", "malik")));

        System.out.println();
    }
}
