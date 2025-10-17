public class KontrakSewa {
    private Pelanggan pelanggan;
    private Kendaraan kendaraan;
    private String idKontrak;
    private String tanggalMulai;
    private String tanggalSelesai;
    private int lamaSewa;         // dalam hari
    private double dendaPerHari;

    // Konstruktor berparameter
    public KontrakSewa(String idKontrak, Pelanggan pelanggan, Kendaraan kendaraan, String tanggalMulai, String tanggalSelesai, int lamaSewa, double dendaPerHari) {
        this.idKontrak = idKontrak;
        this.pelanggan = pelanggan;
        this.kendaraan = kendaraan;
        this.tanggalMulai = tanggalMulai;
        this.tanggalSelesai = tanggalSelesai;
        this.lamaSewa = lamaSewa;
        this.dendaPerHari = dendaPerHari;
    }

    public String getIdKontrak() {
        return idKontrak;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public String getTanggalMulai() {
        return tanggalMulai;
    }

    public String getTanggalSelesai() {
        return tanggalSelesai;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public double getDendaPerHari() {
        return dendaPerHari;
    }

    // Hitung total biaya normal
    public double hitungBiayaTotal() {
        return kendaraan.getTarifHarian() * lamaSewa;
    }

    // Overloading
    public double hitungBiayaTotal(long hariTerlambat) {
        return hitungBiayaTotal() + (hariTerlambat * dendaPerHari);
    }

    public void infoPeminjaman() {
        System.out.println("========= Detail Kontrak Sewa =========");
        System.out.println(pelanggan.getNama() + " menyewa " + kendaraan.getInfo());
        System.out.println("ID Kontrak      : " + idKontrak);
        System.out.println("Tanggal Mulai   : " + tanggalMulai);
        System.out.println("Tanggal Selesai : " + tanggalSelesai);
        System.out.println("Durasi Sewa     : " + lamaSewa + " hari");
        System.out.println("Harga Total     : Rp " + hitungBiayaTotal());
        System.out.println("Denda per Hari  : Rp " + dendaPerHari);
        System.out.println("=======================================");
    }
}
