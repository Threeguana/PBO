public class KursiPbo {
    public String jenis, warna;
    public int harga;

    public KursiPbo(String j, String w, int h){
        jenis = j;
        warna = w;
        harga = h;
    }
    
    public void info(){
        System.out.println("Jenis: " + jenis);
        System.out.println("Warna: " + warna);
        System.out.println("Harga: " + harga);
    }

    public int tambahHarga(int increment){
        harga += increment;
        return harga;
    }

     public int kurangHarga(int decrement){
        harga -= decrement;
        return harga;
    }
    public static void main(String[] args) {
        KursiPbo kursi = new KursiPbo("Kursi Makan", "Hitam", 150000);
        kursi.tambahHarga(10000);
        kursi.info();
        
        System.out.println();
        
        KursiPbo kursi2 = new KursiPbo("KursiPbo Lipat", "Merah", 100000);
        kursi2.kurangHarga(30000);
        kursi2.info();
    }
}