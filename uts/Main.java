public class Main {
    public static void main(String[] args) {
        // Membuat objek pelanggan
        Pelanggan p1 = new Pelanggan("P01", "Andini");
        p1.setNoHp("081339567088");

        System.out.println("========= Data Pelanggan =========");
        System.out.println("ID Pelanggan : " + p1.getIdPelanggan());
        System.out.println("Nama         : " + p1.getNama());
        System.out.println("No. HP       : " + p1.getNoHp());
        System.out.println();

        // polimorfisme
        Kendaraan k1 = new Motor("MT01", "Yamaha", 2021, "Mio", "Hitam");
        Kendaraan k2 = new Mobil("MB01", "Honda", 2023, "Merah", 4);
        Kendaraan k3 = new Motor("MT02", "Yamaha", 2020, "Sport", "Biru");
        Kendaraan k4 = new Mobil("MB02", "Suzuki", 2023, "Putih", 2);

        // Demo komposisi
        Garasi g1 = new Garasi("Garasi Beta");
        g1.tambahKendaraan(k1);
        g1.tambahKendaraan(k2);
        g1.tambahKendaraan(k3);
        g1.tambahKendaraan(k4);
        g1.tampilkanKendaraan();
        System.out.println();

        // Demo agregasi
        KontrakSewa ktrk1 = new KontrakSewa("K01", p1, k2, "2025-06-01", "2025-06-10", 5, 50000);
        ktrk1.infoPeminjaman();
        System.out.println("Biaya total (tanpa denda): Rp " + ktrk1.hitungBiayaTotal());
        System.out.println("Biaya total (terlambat 2 hari): Rp " + ktrk1.hitungBiayaTotal(2));
        System.out.println();

        // Demo overloading
        System.out.println("========= Mencari Kendaraan =========");
        Kendaraan hasil1 = g1.cariKendaraan("Honda");
        System.out.println("Hasil cari: " + (hasil1 != null ? hasil1.getInfo() : "Tidak ada"));

        Kendaraan hasil2 = g1.cariKendaraan("Yamaha", 2021);
        System.out.println("Hasil cari: " + (hasil2 != null ? hasil2.getInfo() : "Tidak ada"));
    }
}
