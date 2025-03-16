public class PengirimanBarang {
    private String namaPengirim;
    private String alamatTujuan;
    private double berat;
    private double biayaDasar;

    // Constructor Default
    public PengirimanBarang() {
        this.namaPengirim = "";
        this.alamatTujuan = "";
        this.berat = 0;
        this.biayaDasar = 0;
    }

    // Constructor Overloading
    public PengirimanBarang(String pengirim, String tujuan, double beratBarang, double biaya) {
        this.namaPengirim = pengirim;
        this.alamatTujuan = tujuan;
        this.berat = beratBarang;
        this.biayaDasar = biaya;
    }

    // Perhitungan ongkos kirim dengan diskon persen
    public double hitungOngkir(double diskonPersen) {
        return biayaDasar - (biayaDasar * (diskonPersen / 100));
    }

    // Perhitungan ongkos kirim dengan diskon persen + biaya tambahan
    public double hitungOngkir(double diskonPersen, double biayaTambahan) {
        double hargaSetelahDiskon = biayaDasar - (biayaDasar * (diskonPersen / 100));
        return hargaSetelahDiskon + biayaTambahan;
    }

    // Perhitungan ongkos kirim berdasarkan jarak
    public double hitungOngkir(int jarak) {
        if (jarak > 50) {
            return biayaDasar + (biayaDasar * 0.1); // Tambah 10%
        } else {
            return biayaDasar - (biayaDasar * 0.05); // Kurangin 5%
        }
    }

    // Menampilkan info perusahaan logistik
    public static void displayInfoLogistik() {
        System.out.println("Perusahaan Logistik: Jasa Kirim Cepat");
        System.out.println("Melayani pengiriman dalam dan luar kota dengan aman dan cepat.");
    }
}