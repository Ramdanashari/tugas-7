import java.util.ArrayList;

public class Lists {
    public static void list(){
        System.out.println("list");

        java.util.List<String> names = new ArrayList<>();
        names.add("eko");
        names.add("kurniawan");
        names.add("dedi");

        names.set(0, "ujang");

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        System.out.println();
    }
}