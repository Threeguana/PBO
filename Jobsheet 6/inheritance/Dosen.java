package inheritance;
import testpackage.Pegawai;
public class Dosen extends Pegawai {
    public String nidn;
    public Dosen() {
        System.out.println("Objek dari class Dosen dibuat");
    }

    public Dosen (String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        this.nidn = nidn;
        // super.nip = nip;
        // super.nama = nama;
        // super.gaji = gaji;
        // System.out.print ("Objek dari class Dosen dibuat dengan constructor berparameter");
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();
        // info += "NIP    : " + super.nip + "\n";
        // info += "Nama   : " + super.nama + "\n";
        // info += "Gaji   : " + super.gaji + "\n";
        // info += "NIDN   : " + this.nidn + "\n";
        return info;
    }

    public String getInfo(){
        return "NIDN    : " + this.nidn + "\n";
    }
}
