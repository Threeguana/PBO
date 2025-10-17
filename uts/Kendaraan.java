public abstract class Kendaraan { //parent class
    private String idKendaraan;
    private String merk;
    private int tahunProduksi;
    private double tarifHarian;

    // kontruktor berparameter
    public Kendaraan(String id, String m, int tahun, double tarifHarian) {
        this.idKendaraan = id;
        this.merk = m;
        this.tahunProduksi = tahun;
        this.tarifHarian = tarifHarian;
    }



    // getter
    public String getIdKendaraan() {
        return idKendaraan;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public double getTarifHarian() {
        return tarifHarian;
    }

    // method yg akan dioverride
    public abstract String getInfo();
}
