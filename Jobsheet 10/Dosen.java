public class Dosen extends Pegawai { // subclass
    public String nidn;

    // static
    public Dosen(String string, String string2, int i, String string3) {}

    public Dosen(String nip, String nama, String nidn) {
        super(nip, nama);
        this.nidn = nidn;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // method dari parent
        System.out.println("NIDN: " + nidn); //nambah perilaku
    }

    public void mengajar() {
        System.out.println("Membuat rencana pembelajaran");
        System.out.println("Menyusun materi");
        System.out.println("Melaksanakan PBM");
        System.out.println("Melakukan evaluasi");
    }
}
