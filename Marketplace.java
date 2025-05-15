package tugas6;

public class Marketplace {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager(); // Buat objek pengelola

        // Tambahkan beberapa produk contoh
        manager.addProduct(new Product<Integer>(1, "Laptop", 2, 12000000)); // ID 1, kategori angka
        manager.addProduct(new Product<String>(2, "Sepatu", "Fashion", 350000)); // ID 2, kategori string
        manager.addProduct(new Product<String>(3, "Kamera", "Elektronik", 8000000)); // ID 3
        manager.addProduct(new Product<Integer>(4, "Handphone", 1, 4000000)); // ID 4

        System.out.println("\n=== Semua Produk (Terurut Berdasarkan Kategori) ===");
        manager.displaySortedProducts(); // Tampilkan produk yang diurutkan

        System.out.println("\n=== Semua Kategori Unik ===");
        manager.displayCategories(); // Tampilkan kategori

        System.out.println("\n=== Cari Produk 'Kamera' di Kategori 'Elektronik' ===");
        manager.searchProduct("Kamera", "Elektronik"); // Cari produk

        System.out.println("\n=== Proses Produk ===");
        manager.processProduct(new Product<String>(5, "Jam Tangan", "Aksesoris", 150000)); // Proses produk baru

        System.out.println("\n=== Tampilkan Antrian Produk yang Telah Diproses ===");
        manager.displayProcessedQueue(); // Tampilkan antrian

        System.out.println("\n=== Hapus Produk dengan ID 2 ===");
        manager.removeProductById(2); // Hapus produk ID 2

        System.out.println("\n=== Produk Setelah Dihapus ===");
        manager.displaySortedProducts(); // Tampilkan ulang
    }
}
