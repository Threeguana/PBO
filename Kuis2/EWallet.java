package Kuis2;

public class EWallet extends Pembayaran implements IAutentikasi, ICetakStruk{
    private String nama;
    private double saldo;
    private boolean verif;

    public EWallet(double nominal, String status, String nama, double saldo){
        super(nominal, status); //memanggil kontruktor parent
        this.nama = nama;
        this.saldo = saldo;
        this.verif = false;
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("\n--- Informasi Akun E-Wallet ---");
        System.out.println("Nama Akun : " + nama);
        System.out.println("Saldo     : Rp " + saldo);
        super.tampilkanInfo();
        System.out.println("-------------------------------");
    }

    @Override
    public void verifikasiIdentitas(){
        System.out.println("Verifikasi untuk akun " + nama);
        if (!getStatus().equalsIgnoreCase("Aktif")) {
            verif = false;
            System.out.println("Verifikasi gagal: Akun tidak aktif!");
            return;
        }

        int pin = (int)(getNominal() % 10); //ambil digit terakhir nominal
        if (pin % 2 == 0) {
            verif = true;
            System.out.println("Verifikasi akun berhasil");
        } else {
            verif = false;
            System.out.println("verifikasi gagal!");
        }
    }

    @Override
    public void prosesTransaksi(){
        System.out.println("Memproses transaksi E-Wallet");
        if (!verif) {
            setStatus("gagal");
            System.out.println("Transaksi dibatalkan karena verifikasi gagal");
            return;
        }

        if(saldo >= getNominal()){
            saldo -= getNominal();
            setStatus("Berhasil");
            System.out.println("Transaksi berhasil.");
        } else {
            setStatus("Gagal");
            System.out.println("Transaksi gagal: saldo tidak mencukupi!");
        }
        cetakStruk();
    }

    @Override
    public void cetakStruk(){
        System.out.println("\n----- Struk E-Wallet -----");
        System.out.println("Nama       : " + nama);
        System.out.println("Nominal    : Rp." + getNominal());
        System.out.println("Sisa Saldo : Rp." + saldo);
        System.out.println("--------------------------\n");
    }
}
