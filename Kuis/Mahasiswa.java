public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private String tanggalLahir;
    private MataKuliah mataKuliah;

    public Mahasiswa(String nim, String nama, String alamat, String tanggalLahir) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.mataKuliah = null;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public MataKuliah getMataKuliah() {
        return this.mataKuliah;
    }

    public String getNim() {
        return this.nim;
    }

    public String setNim(String nim) {
        this.nim = nim;
        return nim;
    }

    public String setNama(String nama) {
        this.nama = nama;
        return nama;
    }

    public String getNama() {
        return this.nama;
    }
}
