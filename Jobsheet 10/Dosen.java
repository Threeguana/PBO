public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(String string, String string2, int i, String string3) {}

    public Dosen(String nip, String nama, String nidn) {
        super(nip, nama);
        this.nidn = nidn;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIDN: " + nidn);
    }

    public void mengajar() {
        System.out.println("Membuat rencana pembelajaran");
        System.out.println("Menyusun materi");
        System.out.println("Melaksanakan PBM");
        System.out.println("Melakukan evaluasi");
    }
}
