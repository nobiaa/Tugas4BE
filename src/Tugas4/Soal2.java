package Tugas4;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Soal2 {
    public static void main(String[] args) {
        // Buat list nama makanan
        List<String> namaMakanan = new ArrayList<>();
        namaMakanan.add("Nasi Orak Arik");
        namaMakanan.add("Magelangan");
        namaMakanan.add("Mie Ayam");
        namaMakanan.add("Soto Ayam");
        namaMakanan.add("Bakso");
        namaMakanan.add("Ayam Penyet");
        namaMakanan.add("Lontong Sayur");
        namaMakanan.add("Lotek");
        namaMakanan.add("Mie Goreng");
        namaMakanan.add("Rendang Ayam");

        // Buat list tahun piala dunia
        List<Integer> tahunPialaDunia = new ArrayList<>();
        tahunPialaDunia.add(2018);
        tahunPialaDunia.add(2014);
        tahunPialaDunia.add(2010);

        List<String> namaprovinsi = new ArrayList<>();
        namaprovinsi.add("Aceh");
        namaprovinsi.add("Bali");
        namaprovinsi.add("Bengkulu");
        namaprovinsi.add("Banten");
        namaprovinsi.add("Kalimantan Tengah");
        namaprovinsi.add("Kalimantan Selatan");
        namaprovinsi.add("Jawa Barat");
        namaprovinsi.add("Sumatera Utara");
        namaprovinsi.add("DKI Jakarta");
        namaprovinsi.add("Jambi");
        Collections.sort(namaprovinsi, Collections.reverseOrder());

        // Implement penghapusan data pada list bahasa pemrograman
        List<String> bahasaPemrograman = new ArrayList<>();
        bahasaPemrograman.add("Java");
        bahasaPemrograman.add("Python");
        bahasaPemrograman.add("JavaScript");
        bahasaPemrograman.add("C++");
        bahasaPemrograman.add("PHP");
        bahasaPemrograman.add("Ruby");
        bahasaPemrograman.add("Go");
        bahasaPemrograman.add("Swift");
        bahasaPemrograman.add("Kotlin");
        bahasaPemrograman.add("R");
        bahasaPemrograman.add("Matlab");
        bahasaPemrograman.add("Scala");

        // Hapus 5 data dari list bahasa pemrograman
        bahasaPemrograman.remove("Go");
        bahasaPemrograman.remove("Ruby");
        bahasaPemrograman.remove("Swift");
        bahasaPemrograman.remove("R");
        bahasaPemrograman.remove("Matlab");

        // Cetak list nama makanan yang sudah diurutkan secara descending
        System.out.println("List Nama Makanan: " + namaMakanan);

        // Cetak list tahun piala dunia
        System.out.println("List Tahun Piala Dunia: " + tahunPialaDunia);

        // Cetak list bahasa pemrograman setelah data dihapus
        System.out.println("List Bahasa Pemrograman: " + bahasaPemrograman);

        System.out.println("List 10 nama Provinsi secara descending: " + namaprovinsi);
        System.out.println();
    }
}
