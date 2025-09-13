import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double hasil = 0;
        double angka1, angka2;
        angka1 = 0;
        angka2 = 0;
        String operator = " ";

        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilih Operasi: ");
        int pilih = sc.nextInt();

        System.out.print("Tentukan angka pertama: ");
        angka1 = sc.nextDouble();

        System.out.print("Tentukan angka kedua: ");
        angka2 = sc.nextDouble();

        switch (pilih) {
            case 1:
                hasil = angka1 + angka2;
                operator = "+";
                break;
            case 2:
                hasil = angka1 - angka2;
                operator = "-";
                break;
            case 3:
                hasil = angka1 * angka2;
                operator = "*";
                break;
            case 4:
                hasil = angka1 / angka2;
                operator = "/";
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

        System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " adalah " + hasil);
        sc.close();
    }
}