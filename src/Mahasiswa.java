public class Mahasiswa<A, B> {
    A name;
    A alamat;
    B nim;

    public Mahasiswa(A name, A alamat, B nim){
        this.name = name;
        this.alamat= alamat;
        this.nim = nim;
    }

    public void print(){
        System.out.println("name :"+ name);
        System.out.println("alamat :"+ alamat);
        System.out.println("nim :"+ nim);
    }
}
