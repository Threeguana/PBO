public class TV extends AlatElektronik implements Audible{
    private String jenisLayar;
    private int volume;

    public TV(String jl, int v, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jenisLayar = jl;
        this.volume = v;
    }

    public String getJenisLayar(){
        return jenisLayar;
    }

    public void setJenisLayar(String jenisLayar){
        this.jenisLayar = jenisLayar;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    @Override
    public void naikkanVolume(int increment){
        volume += increment;
    }

    @Override
    public void turunkanVolume(int decrement){
        volume -= decrement;
    }
}
