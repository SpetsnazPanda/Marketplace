package tugas6;

// Kelas generik Product dengan tipe T yang membatasi harus bisa dibandingkan (Comparable)
public class Product<T extends Comparable<T>> implements Comparable<Product<T>> {
    private int id; // ID produk
    private String name; // Nama produk
    private T category; // Kategori produk bertipe generik
    private double price; // Harga produk

    // Konstruktor untuk inisialisasi
    public Product(int id, String name, T category, double price) {
        this.id = id; // Set ID
        this.name = name; // Set nama
        this.category = category; // Set kategori
        this.price = price; // Set harga
    }

    // Getter ID
    public int getId() {
        return id;
    }

    // Getter Nama
    public String getName() {
        return name;
    }

    // Getter Kategori
    public T getCategory() {
        return category;
    }

    // Getter Harga
    public double getPrice() {
        return price;
    }

    // Method compareTo untuk mengurutkan berdasarkan kategori
    @Override
    public int compareTo(Product<T> other) {
        return this.category.compareTo(other.category); // Bandingkan kategori
    }

    // Representasi string dari produk
    @Override
    public String toString() {
        return String.format("ID: %d | Nama: %s | Kategori: %s | Harga: %.2f", 
                             id, name, category.toString(), price); // Format string ringkas
    }
}
