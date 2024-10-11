public class Elektronik extends Barang {
    private String merk;

    // Constructor dengan Overloading
    public Elektronik() {
        super();  // Memanggil constructor kosong dari kelas induk
        this.merk = "Unknown";
    }

    public Elektronik(String nama, double harga, String merk) {
        super(nama, harga);  // Memanggil constructor kelas induk
        this.merk = merk;
    }

    // Overriding metode info (Polymorphism)
    @Override
    public String info() {
        return "Kategori: Elektronik\n" +
               "Nama Barang: " + getNama() + "\n" +
               "Merk: " + merk + "\n" +
               "Harga: Rp " + getHarga() + "\n";
    }

    // Getter dan Setter untuk atribut merk
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
}
