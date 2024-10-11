public class Perusahaan {
    private String namaPerusahaan;
    private String alamat;

    // Constructor
    public Perusahaan(String namaPerusahaan, String alamat) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamat = alamat;
    }

    // Getter dan Setter
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Menampilkan info perusahaan
    public String infoPerusahaan() {
        return "Perusahaan: " + namaPerusahaan + ", Alamat: " + alamat;
    }
}
