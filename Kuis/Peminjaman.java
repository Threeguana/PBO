public class Peminjaman {
    private Mahasiswa2 mahasiswa;
    private Buku bukuDipinjam;

    public Peminjaman(Mahasiswa2 mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void pinjamBuku(Buku b) {
        this.bukuDipinjam = b;
        System.out.println(mahasiswa.getNama() + " meminjam buku: " + b.getJudul());
    }

    public void kembalikanBuku(Buku b) {
        if (bukuDipinjam != null && bukuDipinjam == b) {
            System.out.println(mahasiswa.getNama() + " mengembalikan buku: " + b.getJudul());
            bukuDipinjam = null;
        }
    }

    public void tampilPeminjaman() {
        if (bukuDipinjam != null) {
            System.out.println("Mahasiswa " + mahasiswa.getNama() + " mengembalikan buku " + bukuDipinjam.getJudul());
        } else {
            System.out.println("Tidak ada buku yang sedang dipinjam.");
        }
    }
}
