public class Peminjaman {
    private final Buku buku;
    private final int kuantitas;

    public Peminjaman(Buku buku, int kuantitas) {
        this.buku = buku;
        this.kuantitas = kuantitas;
    }

    public Buku getBuku() {
        return buku;
    }

    public int getKuantitas() {
        return kuantitas;
    }
}
