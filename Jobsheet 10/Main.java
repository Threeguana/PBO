// import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
        TenagaKependidikan tendik1 =
                new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");

        // heterogenous collection
        // ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
        // daftarPegawai.add(dosen1); // Upcasting
        // daftarPegawai.add(tendik1);

        train(dosen1);
        train(tendik1);
        System.out.println();
    }

    public static void train(Pegawai pegawai) { // polimorfis dinamic
        pegawai.displayInfo(); // dinamic binding
        System.out.println("Mengenalkan lingkungan kampus");
        System.out.println("Menginfokan SOP/Juknis");

        if (pegawai instanceof Dosen) { // tipe checking
            System.out.println("Memberikan pelatihan pedagogik");
        }
    }
}
