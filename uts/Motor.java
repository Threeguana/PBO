public class Motor extends Kendaraan { //child kendaraan
    private String tipe;
    private String warna;

    // kontruktor berparameter
    public Motor(String idKendaraan, String merk, int tahunProduksi, String tipe, String warna) {
        super(idKendaraan, merk, tahunProduksi, tahunProduksi);
        this.tipe = tipe;
        this.warna = warna;
    }

    // gettter
    public String getTipe() {
        return tipe;
    }
    public String getWarna() {
        return warna;
    }

    // method overiding
    @Override
    public String getInfo() {
        return "Motor [" + getMerk() + ", " + tipe + ", " + warna + ", " + getTahunProduksi() + "]";
    }
}
