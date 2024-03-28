public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa<String, Double>mhs = new Mahasiswa<String,Double>("Rahul", "Korea", 20220040265.0);
        

        mhs.print();

        Libmath<Integer, Double>math = new Libmath<Integer,Double>(10, 20.0);
        System.out.println("Hasil Penjumlahan :" + math.add());

        Libmath<Double, Double>math2 = new Libmath<Double,Double>(10.0, 20.0);
        System.out.println("Hasil Pengurangan :" + math2.sub());

        Iteration.iterable();
        Iteration.iterator();
        Collections.addCollection();
        Collections.removeCollection();
        Collections.checkCollection();
        Lists.list();
        Sets.LinkedHasSet();
        Sets.hashSet();
    }
}
