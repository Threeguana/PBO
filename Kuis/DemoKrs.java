import java.util.ArrayList;

public class DemoKrs {

    public static void main(String[] args) {
        ArrayList<MataKuliah> krs1 = new ArrayList<>();
        Mahasiswa mhs1 = new Mahasiswa("244107060140", "Andini Tribuana", "Batu", "01-06-2006");

        MataKuliah mk1 = new MataKuliah(101, "PBO", 4);
        MataKuliah mk2 = new MataKuliah(102, "Basdat", 3);
        MataKuliah mk3 = new MataKuliah(201, "Jarkom", 3);

        krs1.add(mk1);
        krs1.add(mk2);
        krs1.add(mk3);
        tampilKrs(mhs1, krs1);
    }

    public static void tampilKrs(Mahasiswa mahasiswa, ArrayList<MataKuliah> krs) {
        System.out.println("NIM           : " + mahasiswa.getNim());
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());

        for (MataKuliah mk : krs) {
            System.out.println("kode mk: " + mk.getKodeMk());
            System.out.println("nama mk: " + mk.getNamaMk());
            System.out.println("sks: " + mk.getSks());
        }
    }
}
