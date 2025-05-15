package tugas6;

import java.util.ArrayList; // Import semua utilitas Java
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

// Kelas pengelola produk
public class ProductManager {
    private List<Product<?>> products; // Daftar semua produk
    private Set<String> categories; // Set kategori unik
    private Queue<Product<?>> processedQueue; // Antrian produk yang sudah diproses

    // Konstruktor
    public ProductManager() {
        products = new ArrayList<>(); // Gunakan ArrayList untuk menyimpan produk
        categories = new HashSet<>(); // Gunakan HashSet untuk kategori unik
        processedQueue = new LinkedList<>(); // Gunakan LinkedList sebagai Queue
    }

    // Tambah produk ke daftar
    public void addProduct(Product<?> product) {
        products.add(product); // Tambahkan produk ke list
        categories.add(product.getCategory().toString()); // Tambahkan kategori ke set
    }

    // Hapus produk berdasarkan ID
    public void removeProductById(int id) {
        products.removeIf(p -> p.getId() == id); // Hapus produk jika ID cocok
    }

    // Cari produk berdasarkan nama dan kategori
    public void searchProduct(String name, String category) {
        for (Product<?> p : products) { // Iterasi semua produk
            if (p.getName().equalsIgnoreCase(name) && 
                p.getCategory().toString().equalsIgnoreCase(category)) {
                System.out.println(p); // Tampilkan jika cocok
            }
        }
    }

    // Tampilkan semua produk yang sudah diurutkan berdasarkan kategori
    public void displaySortedProducts() {
        List<Product<?>> sorted = new ArrayList<>(products); // Salin list produk
        Collections.sort(sorted, Comparator.comparing(p -> p.getCategory().toString())); // Urutkan berdasarkan kategori
        for (Product<?> p : sorted) {
            System.out.println(p); // Tampilkan setiap produk
        }
    }

    // Tampilkan semua kategori unik
    public void displayCategories() {
        System.out.println("Kategori Unik:");
        for (String c : categories) {
            System.out.println("- " + c); // Tampilkan setiap kategori
        }
    }

    // Tambahkan produk ke antrian yang telah diproses
    public void processProduct(Product<?> product) {
        processedQueue.offer(product); // Tambahkan ke queue
    }

    // Tampilkan produk dalam antrian yang telah diproses
    public void displayProcessedQueue() {
        System.out.println("Antrian Produk yang Telah Diproses:");
        for (Product<?> p : processedQueue) {
            System.out.println(p); // Tampilkan setiap produk
        }
    }
}
