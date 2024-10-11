public class Pakaian extends Barang {
    private String ukuran;

    // Constructor dengan Overloading
    public Pakaian() {
        super();
        this.ukuran = "Unknown";
    }

    public Pakaian(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    // Overriding metode info (Polymorphism)
    @Override
    public String info() {
        return "Kategori: Pakaian\n" +
               "Nama Barang: " + getNama() + "\n" +
               "Ukuran: " + ukuran + "\n" +
               "Harga: Rp " + getHarga() + "\n";
    }

    // Getter dan Setter untuk atribut ukuran
    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
}
