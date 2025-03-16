public class Main {
    public static void main(String[] args) {
        // Object pertama dengan constructor default
        PengirimanBarang paket1 = new PengirimanBarang();
        
        // Object kedua dengan constructor parameterized
        PengirimanBarang paket2 = new PengirimanBarang("Dian", "Surabaya", 2.5, 50000);

        // Menampilkan info perusahaan
        PengirimanBarang.displayInfoLogistik();

        System.out.println("\n===== Uji Constructor Default =====");
        System.out.println("Ongkir paket1 setelah diskon 10%: Rp " + paket1.hitungOngkir(10));
        System.out.println("Ongkir paket1 setelah diskon 10% + biaya tambahan Rp 5000: Rp " + paket1.hitungOngkir(10, 5000));
        System.out.println("Ongkir paket1 untuk jarak 60 km: Rp " + paket1.hitungOngkir(60));
        System.out.println("Ongkir paket1 untuk jarak 40 km: Rp " + paket1.hitungOngkir(40));

        System.out.println("\n===== Uji Constructor Parameterized =====");
        System.out.println("Ongkir paket2 setelah diskon 10%: Rp " + paket2.hitungOngkir(10));
        System.out.println("Ongkir paket2 setelah diskon 10% + biaya tambahan Rp 5000: Rp " + paket2.hitungOngkir(10, 5000));
        System.out.println("Ongkir paket2 untuk jarak 60 km: Rp " + paket2.hitungOngkir(60));
        System.out.println("Ongkir paket2 untuk jarak 40 km: Rp " + paket2.hitungOngkir(40));
    }
}