public class DemoPerpustakaan {
    public static void main(String[] args) {
        Mahasiswa2 mhs1 = new Mahasiswa2("244107060140", "Andini Tribuana");
        Buku buku1 = new Buku("Matematika", "Andi", "2020");
        Buku buku2 = new Buku("BIO", "Andi", "2022");
        Buku buku3 = new Buku("Kimia", "Andi", "2010");

        Peminjaman peminjaman = new Peminjaman(mhs1);
        peminjaman.pinjamBuku(buku1);
        peminjaman.pinjamBuku(buku3);
        peminjaman.pinjamBuku(buku2);

        peminjaman.kembalikanBuku(buku1);
        peminjaman.tampilPeminjaman();
    }
}
