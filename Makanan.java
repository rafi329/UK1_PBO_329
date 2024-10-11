public class Makanan extends Barang {
    private String kadaluarsa;

    // Constructor dengan Overloading
    public Makanan() {
        super();
        this.kadaluarsa = "Unknown";
    }

    public Makanan(String nama, double harga, String kadaluarsa) {
        super(nama, harga);
        this.kadaluarsa = kadaluarsa;
    }

    // Overriding metode info (Polymorphism)
    @Override
    public String info() {
        return "Kategori: Makanan\n" +
               "Nama Barang: " + getNama() + "\n" +
               "Harga: Rp " + getHarga() + "\n" +
               "Kadaluarsa: " + kadaluarsa + "\n";
    }

    // Getter dan Setter untuk atribut kadaluarsa
    public String getKadaluarsa() {
        return kadaluarsa;
    }

    public void setKadaluarsa(String kadaluarsa) {
        this.kadaluarsa = kadaluarsa;
    }
}
