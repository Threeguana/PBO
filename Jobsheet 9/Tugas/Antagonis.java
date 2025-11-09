package Tugas;
public class Antagonis extends Tokoh implements IKarakter{
    private String faksi;

    public Antagonis(String nama, String gender, String f){
        super(nama, gender);
        this.faksi = f;
    }

    public void setFaksi(String f){
        this.faksi = f;
    }

    public String getFaksi(){
        return faksi;
    }

    @Override
    public void tampilInfo(){
        super.tampilInfo();
        System.out.println("Faksi: " + getFaksi());
        berbicara();
    }

    public void berbicara(){
        System.out.println("Berkata: Dunia ini milikku!");
    }
}
