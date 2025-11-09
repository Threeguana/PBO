package Tugas;

public class Demo {
    public static void main(String[] args) {
        MainChar mc = new MainChar("Petra", "Laki-laki","Unknown");
        mc.setKekuatan("Chrono Rift");
        mc.tampilInfo();

        System.out.println();

        Antagonis e1 = new Antagonis("Anya", "Unknown","Unknown");
        e1.setGender("Perempuan");
        e1.setFaksi("Ecplise Order");
        e1.tampilInfo();
    }
}
