import java.util.Scanner;

public class Main {
    static AksiAdmin aksiAdmin = new AksiAdmin();
    static AksiUser aksiUser = new AksiUser();
    static Scanner scanner = new Scanner(System.in);
    static boolean run = true;
    static boolean isLogin = false;

    public static void main(String[] args) {
        User.addUser("user", "123", false, 10);
        User.addUser("admin", "123", true, 0);

        while (run) {
            Aksi.welcome();
            int Aksi = scanner.nextInt();

            if (Aksi == 1) {
                while (!isLogin) {
                    System.out.println("Silakan login >_<");
                    System.out.print("Username: ");
                    String username = scanner.next();
                    System.out.print("Password: ");
                    String password = scanner.next();

                    User user = authenticate(username, password);

                    if (user != null) {
                        isLogin = true;
                        Akun.login(user);
                        System.out.println("Selamat datang " + Akun.getCurrentUser().getUsername());
                        if (Akun.getCurrentUser().isAdmin()) {
                            handleAksiAdmin();
                        } else {
                            handleAksiUser();
                        }
                    } else {
                        System.out.println("Username atau password salah. Silakan coba lagi.");
                    }
                }
                isLogin = false;
            } else {
                run = false;
            }
        }
    }

    private static User authenticate(String username, String password) {
        User user = User.getUsers().get(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    private static void handleAksiUser() {
        while (true) {
            aksiUser.tampilanAksi();
            switch (scanner.nextInt()) {
                case 1 -> aksiUser.lihatDetailProfile();
                case 2 -> aksiUser.lihatListBuku();
                case 3 -> aksiUser.lihatListPeminjaman();
                case 4 -> aksiUser.pinjamBuku();
                case 5 -> aksiUser.kembalikanBuku();
                case 6 -> {
                    aksiUser.keluar();
                    return;
                }
                case 7 -> aksiUser.tutupAplikasi();
                default -> System.out.println("Pilihan tidak valid");
            }
        }
    }

    private static void handleAksiAdmin() {
        while (true) {
            aksiAdmin.tampilanAksi();
            switch (scanner.nextInt()) {
                case 1 -> aksiAdmin.lihatDetailProfile();
                case 2 -> aksiAdmin.lihatListBuku();
                case 3 -> aksiAdmin.tambahBuku();
                case 4 -> {
                    aksiAdmin.keluar();
                    return;
                }
                case 5 -> aksiAdmin.tutupAplikasi();
                default -> System.out.println("Pilihan tidak valid");
            }
        }
    }
}
