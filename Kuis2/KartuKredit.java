package Kuis2;

public class KartuKredit extends Pembayaran implements IAutentikasi{
    private String namaPemilik;
    private double limit;
    private boolean verif;

    public KartuKredit(double nominal, String status, String np, double l){
        super(nominal, status);
        this.namaPemilik = np;
        this.limit = l;
        this.verif = false;
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("\n--- Informasi Kartu Kredit ---");
        System.out.println("Nama      : " + namaPemilik);
        System.out.println("Limit     : Rp " + limit);
        super.tampilkanInfo();
        System.out.println("------------------------------");
    }

    @Override
    public void verifikasiIdentitas(){
        System.out.println("Verifikasi Kartu Kredit atas nama " + namaPemilik);
        if (!getStatus().equalsIgnoreCase("Aktif")) {
            verif = false;
            System.out.println("Verifikasi gagal kartu tidak aktif!");
            return;
        } else {
            verif = true;
            System.out.println("Verifikasi berhasil");
        }
    }

    @Override
    public void prosesTransaksi(){
        System.out.println("\nMemproses transaksi Kartu Kredit");
        if (!verif) {
            setStatus("gagal");
            System.out.println("Transaksi dibatalkan karena verifikasi gagal");
            return;
        }

        if (getNominal() <= limit) {
            limit -= getNominal();
            setStatus("Berhasil");
            System.out.println("Transaksi Kartu Kredit berhasil. \nSisa limit: Rp " + limit);
        } else {
            setStatus("Gagal");
            System.out.println("Transaksi gagal: limit kartu tidak mencukupi!");
        }
        System.out.println("------------------------------");
    }
}
