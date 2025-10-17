import java.util.ArrayList;

public class Garasi {
    private String namaGarasi;
    private ArrayList<Kendaraan> daftarKendaraan; // composition: tiap garasi memiliki kendaraan

    // konstruktor
    public Garasi(String namaGarasi) {
        this.namaGarasi = namaGarasi;
        this.daftarKendaraan = new ArrayList<>();
    }

    // tambah kendaraan ke dalam garasi
    public void tambahKendaraan(Kendaraan kendaraan) {
        daftarKendaraan.add(kendaraan);
    }

    // tampilkan semua kendaraan
    public void tampilkanKendaraan() {
        System.out.println("========= Daftar Kendaraan di Garasi " + namaGarasi + " =========");
        for (Kendaraan k : daftarKendaraan) {
            System.out.println(k.getInfo());
        }
    }

    // overloading
    public Kendaraan cariKendaraan(String merk) {
        for (Kendaraan k : daftarKendaraan) {
            if (k.getMerk().equalsIgnoreCase(merk)) {
                return k;
            }
        }
        return null;
    }

    // overloading: cari kendaraan berdasarkan merk dan tahun
    public Kendaraan cariKendaraan(String merk, int tahunProduksi) {
        for (Kendaraan k : daftarKendaraan) {
            if (k.getMerk().equalsIgnoreCase(merk) && k.getTahunProduksi() == tahunProduksi) {
                return k;
            }
        }
        return null;
    }
}
