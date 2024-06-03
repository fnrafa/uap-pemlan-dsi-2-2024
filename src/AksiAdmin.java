public class AksiAdmin extends Aksi {
    @Override
    public void tampilanAksi() {
        System.out.println("Aksi Admin:");
        System.out.println("1. Lihat Detail Profile");
        System.out.println("2. Lihat List Buku");
        System.out.println("3. Tambah Buku");
        System.out.println("4. Logout");
        System.out.println("5. Tutup Aplikasi");
    }

    @Override
    public void lihatListBuku() {
        // Implementasi melihat list film
    }

    public void tambahBuku() {
        // Implementasi menambahkan film
    }
}
