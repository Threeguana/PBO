public class Motor {
    private String platNomor; //private - hanya dpt diakses di dlm kelas yg sama
    private boolean isMesinOn; 
    private int kecepatan;

    public void displayStatus(){
        System.out.println("Plat Nomor: " + this.platNomor);
        if (isMesinOn) {
            System.out.println("Mesin ON");
        } else {
            System.out.println("Mesin OFF");
        }

        System.out.println("Kecepatan : " + this.kecepatan);
        System.out.println("===========================");
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String p){
        this.platNomor = p;
    }

    public boolean getMesinOn() {
        return isMesinOn;
    }

    public void setMesinOn(boolean m){
        this.isMesinOn = m;
    }
    
    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int k){
        if (!this.isMesinOn && k > 0) { 
            System.out.println("\nKecepatan tidak bisa bertambah karena mesin off");
        } else if(k < 0) {
            System.out.println("\nKecepatan tidak boleh negatif");
        } else if (k > 100) {
            System.out.println("\nKecepatan maksimalnya adalah 100");
        } else {
            this.kecepatan = k;
        }
    }
}