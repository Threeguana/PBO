public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String noHp;

    // kontruktor berparameter
    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
    }

    // getter
    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHp() {
        return noHp;
    }

    // setter
    public void setNoHp(String no) {
        this.noHp = no;
    }
}
