public class Mobil extends Kendaraan {
    private String warna;
    private int jumlahKursi;

    public Mobil(String idKendaraan, String merk, int tahunProduksi, String warna, int jumlahKursi) {
        super(idKendaraan, merk, tahunProduksi, jumlahKursi);
        this.warna = warna;
        this.jumlahKursi = jumlahKursi;
    }

    // getter
    public String getWarna() {
        return warna;
    }
    public int getJumlahKursi() {
        return jumlahKursi;
    }

    // method yg akan dioverride
    @Override
    public String getInfo() {
        return "Mobil [" + getMerk() + ", " + warna + ", " + jumlahKursi + " Kursi, " + getTahunProduksi() + "]";
    }
}
