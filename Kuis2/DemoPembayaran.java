package Kuis2;
public class DemoPembayaran {
    public static void main(String[] args) {
        //jenis pembayaran e-wallet
        // berhasil
        EWallet e1 = new EWallet(100000, "Aktif", "Andini", 300000);
        e1.verifikasiIdentitas();
        e1.tampilkanInfo();
        e1.prosesTransaksi();

        //gagal
        // EWallet e2 = new EWallet(2223, "Nonaktif", "Tribuana", 40000);
        // e2.verifikasiIdentitas();
        // e2.tampilkanInfo();
        // e2.prosesTransaksi();

        // System.out.println();
        // //jenis pembayaran kartu kredit
        // //berhasil
        // KartuKredit k1 = new KartuKredit(20000, "Aktif", "Budi Tabudi", 100000);
        // k1.verifikasiIdentitas();
        // k1.tampilkanInfo();
        // k1.prosesTransaksi();

        // //gagal
        // KartuKredit k2 = new KartuKredit(2000000, "Aktif", "Caca", 100000);
        // k2.verifikasiIdentitas();
        // k2.tampilkanInfo();
        // k2.prosesTransaksi();
    }
}
