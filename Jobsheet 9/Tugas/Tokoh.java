package Tugas;
public class Tokoh{
    private String nama;
    private String gender;

    public Tokoh(String n, String g){
        this.nama = n;
        this.gender = g;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void tampilInfo(){
        System.out.println("Nama   : " + getNama());
        System.out.println("Gender : " + getGender());
    }
}
