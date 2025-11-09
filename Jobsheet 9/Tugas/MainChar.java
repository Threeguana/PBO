package Tugas;
public class MainChar extends Tokoh implements IKarakter{
    private String kekuatan;

    public MainChar(String nama, String gender, String k){
        super(nama, gender);
        this.kekuatan = k;
    }

    public void setKekuatan(String k){
        this.kekuatan = k;
    }

    public String getKekuatan(){
        return kekuatan;
    }

    @Override
    public void tampilInfo(){
        super.tampilInfo();
        System.out.println("Kekuatan: " + getKekuatan());
        berbicara();
    }

    public void berbicara(){
        System.out.println("Berkata: Aku akan menyelamatkan dunia!");
    }
}
