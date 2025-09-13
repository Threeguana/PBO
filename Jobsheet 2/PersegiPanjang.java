public class PersegiPanjang {
    public int panjang = 0; //mendeklarasikan atribut panjang dan lebar
    public int lebar = 0;
    
    //implemaentasi konstruktor
    public PersegiPanjang(int p, int l){
        this.panjang = p;
        this.lebar = l;
    }

    public PersegiPanjang(){
        //konstruktor default
    }

    //method untuk menampilkan info panjang dan lebar persegi
    public void displayInfo(){
        System.out.println("=========== INFO ===========");
        System.out.println("Panjang Persegi : " + panjang);
        System.out.println("Lebar Persegi   : " + lebar);
    }

    //method untuk menghitung luas
    public int getLuas(){
        return panjang * lebar;
    }
    
    //method untuk menghitung luas
    public int getKeliling(){
        return 2 * (panjang + lebar);
    }

    //method untuk menampilkan hasil
    public void displayHasil(){
        System.out.println("=========== Hasil ===========");
        System.out.println("Panjang Persegi : " + getLuas());
        System.out.println("Lebar Persegi   : " + getKeliling());
    }
}