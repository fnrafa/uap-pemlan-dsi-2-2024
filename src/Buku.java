import java.util.HashMap;
import java.util.Map;

public class Buku {
    private static final Map<String, Buku> bukus = new HashMap<>();
    private final String name;
    private final String description;
    private final String penulis;
    private int stock;

    public Buku(String name, String description, String penulis, int stock) {
        this.name = name;
        this.description = description;
        this.penulis = penulis;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public String getPenulis() {
        return penulis;
    }

    public static void addBuku(String name, String description, String penulis, int stock) {
        if (!bukus.containsKey(name)) {
            Buku newFilm = new Buku(name, description, penulis, stock);
            bukus.put(name, newFilm);
            System.out.println("Buku " + name + " berhasil ditambahkan.");
        } else {
            System.out.println("Buku " + name + " sudah ada.");
        }
    }

    public static Map<String, Buku> getBuku() {
        return bukus;
    }
}
