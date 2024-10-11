public class Main {
    public static void main(String[] args) {
        // Polymorphism: Menggunakan referensi kelas induk untuk memegang objek kelas anak
        Barang[] barangArray = new Barang[3];

        // Membuat objek dari kelas Elektronik
        barangArray[0] = new Elektronik("Laptop", 15000000, "Dell");
        // Membuat objek dari kelas Pakaian
        barangArray[1] = new Pakaian("Kemeja", 250000, "L");
        // Membuat objek dari kelas Makanan
        barangArray[2] = new Makanan("Susu", 15000, "12-12-2024");

        // Menampilkan informasi barang menggunakan Polymorphism
        for (Barang barang : barangArray) {
            System.out.println(barang.info());
        }

        // Membuat objek perusahaan
        Perusahaan perusahaan = new Perusahaan("PT. Maju Jaya", "Jl. Sudirman No. 10");
        System.out.println(perusahaan.infoPerusahaan());

        // Testing overloading method (diskon)
        barangArray[0].diskon(10);  // Memberikan diskon 10%
        barangArray[1].diskon(15, 5000);  // Memberikan diskon 15% dengan tambahan diskon Rp 5000
        System.out.println("\nSetelah diskon:");
        System.out.println(barangArray[0].info());
        System.out.println(barangArray[1].info());
    }
}
