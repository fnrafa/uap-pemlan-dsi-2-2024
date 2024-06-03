public class AksiUser extends Aksi {
    @Override
    public void tampilanAksi() {
        System.out.println("Aksi User:");
        System.out.println("1. Lihat Detail Profile");
        System.out.println("2. Lihat List Buku");
        System.out.println("3. Lihat List Peminjaman");
        System.out.println("4. Pinjam Buku");
        System.out.println("5. Kembalikan Buku");
        System.out.println("6. Logout");
        System.out.println("7. Tutup Aplikasi");
    }

    @Override
    public void lihatListBuku() {
        // Implementasi melihat list buku
    }

    public void lihatListPeminjaman() {
        // Implementasi melihat list peminjaman
    }

    public void pinjamBuku() {
        // Implementasi pinjam buku
    }

    public void kembalikanBuku() {
        // Implementasi kembalikan buku
    }
}
