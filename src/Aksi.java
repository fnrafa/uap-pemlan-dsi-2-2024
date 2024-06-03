public abstract class Aksi implements TampilanInterface {

    public abstract void lihatListBuku();

    public static void welcome() {
        System.out.println("||" + "=".repeat(40) + "||");
        System.out.println("||" + " ".repeat(12) + "Perpustakaan DSI" + " ".repeat(12) + "||");
        System.out.println("||" + "=".repeat(40) + "||");
        System.out.println("Selamat Datang >_<");
        System.out.println("1. Login");
        System.out.println("2. Tutup Aplikasi");
    }

    public void lihatDetailProfile() {
        System.out.println("Halo " + Akun.getCurrentUser().getUsername());
        String role = (Akun.getCurrentUser().isAdmin()) ? "Admin" : "User";
        System.out.println("Kamu adalah seorang " + role);
        System.out.println("Limit peminjaman kamu " + Akun.getCurrentUser().getLimit());
    }

    public void keluar() {
        Akun.logout();
        System.out.println("Anda telah logout.");
    }

    public void tutupAplikasi() {
        System.out.println("Aplikasi ditutup.");
        System.exit(0);
    }
}
