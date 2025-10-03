public class MataKuliah {
    private int kodeMk;
    private int sks;
    private String namaMk;

    public MataKuliah(int kodeMk, String namaMk, int sks) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
    }

    public int getKodeMk() {
        return kodeMk;
    }

    public String getNamaMk() {
        return namaMk;
    }

    public int getSks() {
        return sks;
    }

    public void setKodeMk(int kodeMk) {
        this.kodeMk = kodeMk;
    }

    public void setNamaMk(String namaMk) {
        this.namaMk = namaMk;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
