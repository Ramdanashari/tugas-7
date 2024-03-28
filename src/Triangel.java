public class Triangel {

    public static <T> void calculateLuas(T alas, T tinggi){
        double luas = 0.5 * Double.parseDouble(alas.toString()) * Double.parseDouble(tinggi.toString());
        System.out.println("Luas Segitiga : " + luas);
    }
}