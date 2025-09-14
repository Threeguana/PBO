package Tugas;
public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPinjam;
    private int jmlPinjam;
    
    // konstrutor
    public Anggota(String k, String n, int l){
        this.noKtp = k;
        this.nama = n;
        this.limitPinjam = l;
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
        int minAngsur = jmlPinjam / 10;

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