public class Barang {
    // Atribut private (Encapsulation)
    private String nama;
    private double harga;

    // Constructor dengan Overloading
    public Barang() {
        this.nama = "Unknown";
        this.harga = 0.0;
    }

    public Barang(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method info - Polymorphism (Akan di-override di kelas anak)
    public String info() {
        return "Ini adalah barang.";
    }

    // Method yang akan dioverload (contoh Overloading method)
    public void diskon(double persentase) {
        this.harga = harga - (harga * persentase / 100);
    }

    // Overloading method diskon dengan parameter tambahan
    public void diskon(double persentase, double tambahanDiskon) {
        this.harga = harga - (harga * persentase / 100) - tambahanDiskon;
    }
}
