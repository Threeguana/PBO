public class Kursi {

    public static void main(String[] args) {
        String jenis, jenis2, jenis3, jenis4, jenis5, jenis6, jenis7, jenis8, jenis9, jenis10, 
               warna, warna2, warna3, warna4, warna5, warna6, warna7, warna8, warna9, warna10;
        int harga, harga2, harga3, harga4, harga5, harga6, harga7, harga8, harga9, harga10;

        //kursi pertama
        jenis = "Kursi Makan";
        warna = "Hitam";
        harga = 100000;
        
        harga = tambahHarga(harga, 20000);
        System.out.println("Jenis: " + jenis);
        System.out.println("Warna: " + warna);
        System.out.println("Harga: " + harga);
        
        //kursi kedua
        jenis2 = "Kursi Lipat";
        warna2 = "Merah";
        harga2 = 100000;
        
        harga2 = kurangHarga(harga2, 20000);
        System.out.println("\nJenis: " + jenis2);
        System.out.println("Warna: " + warna2);
        System.out.println("Harga: " + harga2);

        //kursi ketiga
        jenis3 = "Kursi Bar";
        warna3 = "Merah";
        harga3 = 100000;
        
        harga3 = tambahHarga(harga3, 200000);
        System.out.println("\nJenis: " + jenis3);
        System.out.println("Warna: " + warna3);
        System.out.println("Harga: " + harga3);
        
        //kursi keempat
        jenis4 = "Kursi Lipat";
        warna4 = "Merah";
        harga4 = 100000;
        
        harga4 = kurangHarga(harga4, 50000);
        System.out.println("\nJenis: " + jenis4);
        System.out.println("Warna: " + warna4);
        System.out.println("Harga: " + harga4);

        //kursi kelima
        jenis5 = "\nKursi Belajar";
        warna5 = "Coklat";
        harga5 = 100000;

        harga5 = tambahHarga(harga5, 20000);
        System.out.println("\nJenis: " + jenis5);
        System.out.println("Warna: " + warna5);
        System.out.println("Harga: " + harga5);

        //kursi keenam
        jenis6 = "Sofa";
        warna6 = "Ungu";
        harga6 = 10000000;
        
        harga6 = kurangHarga(harga6, 400000);
        System.out.println("\nJenis: " + jenis6);
        System.out.println("Warna: " + warna6);
        System.out.println("Harga: " + harga6);

        //kursi ketujuh
        jenis7 = "Beanbag";
        warna7 = "Biru";
        harga7 = 3000000;
        
        harga7 = kurangHarga(harga7, 40000);
        System.out.println("\nJenis: " + jenis7);
        System.out.println("Warna: " + warna7);
        System.out.println("Harga: " + harga7);

        //kursi kedelapan
        jenis8 = "Kursi Restoran";
        warna8 = "Putih";
        harga8 = 500000;
        
        harga8 = tambahHarga(harga8, 20000);
        System.out.println("\nJenis: " + jenis8);
        System.out.println("Warna: " + warna8);
        System.out.println("Harga: " + harga8);

        //kursi kesembilan
        jenis9 = "Kursi Kerja";
        warna9 = "Putih";
        harga9 = 1000000;
        
        harga9 = kurangHarga(harga9, 2000);
        System.out.println("\nJenis: " + jenis9);
        System.out.println("Warna: " + warna9);
        System.out.println("Harga: " + harga9);

        //kursi kesepuluh
        jenis10 = "Kursi Santai";
        warna10 = "Hijau";
        harga10 = 40000;
        
        harga10 = tambahHarga(harga10, 20000);
        System.out.println("\nJenis: " + jenis10);
        System.out.println("Warna: " + warna10);
        System.out.println("Harga: " + harga10);

    }

    public static int tambahHarga(int harga, int increment){
        harga += increment;
        return harga;
    }

    public static int kurangHarga(int harga, int decrement){
        harga -= decrement;
        return harga;
    }
}