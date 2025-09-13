import java.util.Scanner;
public class DemoPersegiPanjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //mendeklarasi dan inisialisasi scanner
        //coba membuat objek ke 1
        PersegiPanjang pp1 = new PersegiPanjang(); //deklarasi objek pp1
        System.out.println("Input nilai panjang dan lebar dari persegi panjang");
        System.out.print("Masukkan panjang : ");
        pp1.panjang = sc.nextInt(); //menginisialisasikan nilai panjang
        
        System.out.print("Masukkan lebar   : ");
        pp1.lebar = sc.nextInt(); //menginisialisasikan nilai lebar

        pp1.displayInfo(); //memanggil method hasil
        pp1.displayHasil(); //memanggil method hasil

        //coba membuat objek ke 2 tanpa input
        System.out.println();
        PersegiPanjang pp2 = new PersegiPanjang(2, 3); //deklarasi objek pp2

        pp2.displayInfo();
        pp2.displayHasil();

        sc.close();
    }
}