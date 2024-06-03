import java.util.HashMap;
import java.util.Map;

public class User {
    private static final Map<String, User> users = new HashMap<>();
    private final String username;
    private final String password;
    private final boolean isAdmin;
    private int limit;
    private static final Map<String, Peminjaman> peminjamans = new HashMap<>();

    public User(String username, String password, boolean isAdmin, int limit) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.limit = limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public static void addUser(String username, String password, boolean isAdmin, int limit) {
        if (!users.containsKey(username)) {
            User newUser = new User(username, password, isAdmin, limit);
            users.put(username, newUser);
        }
    }

    public static Map<String, User> getUsers() {
        return users;
    }

    public void addPeminjaman(Buku buku, int kuantitas) {
        Peminjaman newPeminjaman = new Peminjaman(buku, kuantitas);
        peminjamans.put(buku.getName(), newPeminjaman);
    }

    public static Map<String, Peminjaman> getPeminjaman() {
        return peminjamans;
    }
}

