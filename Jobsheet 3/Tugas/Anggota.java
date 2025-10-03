package Tugas;
public class Anggota {
    private String noKtp; //deklarasi atribut private
    private String nama;  //hanya bisa diakses di dalam class
    private int limitPinjam;
    private int jmlPinjam;
    
    // konstrutor 
    public Anggota(String k, String n, int l){
        this.noKtp = k; //inisiasi atribut noktp dgn parameter k
        this.nama = n;
        this.limitPinjam = l; 
        this.jmlPinjam = 0; // saat pertama kali dibuat, peminjaman = 0
    }

    // getter
    public String noKtp(){
        return noKtp;
    }

    public String getNama(){
        return nama;
    }

    public int getLimitPinjaman(){
        return limitPinjam;
    }

    public int getJumlahPinjaman(){
        return jmlPinjam;
    }

    //minjam
    public void pinjam(int jumlah){
        // cek apakah pinjaman akan melebihi limit
        if (jmlPinjam + jumlah > limitPinjam) {
            System.out.println("Maaf jumlah pinjaman melebihi limit");
        } else {
            jmlPinjam += jumlah;
        }
    }

    //angsur
    public void angsur(int jumlah){
        // min angsuran 10% dri pinjaman
        int minAngsur = jmlPinjam / 10; //deklrasasi dan inisisaisi

        //soal 1
        /* if (jumlah > jmlPinjam) { //cek kodisin
         *     jmlPinjam = 0;
         *  } else {
         *     jmlPinjam -= jumlah;
         * }
         */

        //modif no 2
        if (jumlah < minAngsur) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else if (jumlah > jmlPinjam) {
            System.out.println("Angsuran ditolak karena melebihi jumlah pinjam");
        } else {
            jmlPinjam -= jumlah;
        }
    }
}