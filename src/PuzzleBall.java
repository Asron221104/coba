import java.util.Scanner;

public class CoinSortingMachineProgram {
    public static void main(String[] args) {
        // Buat objek MesinSortir, TampilanLayar, dan CoinSlot
        MesinSortir sortingMachine = new MesinSortir();
        TampilanLayar displayScreen = new TampilanLayar();
        CoinSlot coinSlot = new CoinSlot();

        // Tampilkan pesan selamat datang dan instruksi kepada pengguna di layar
        displayScreen.showMessage("Selamat datang di Mesin Penyortiran Koin!");
        displayScreen.showMessage("Silakan masukkan koin ke dalam slot.");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Pengguna memasukkan koin ke dalam slot
            coinSlot.detectCoin();

            // Mesin mengukur koin yang dimasukkan dan menyortirnya
            sortingMachine.measureCoin();
            sortingMachine.sortCoins();

            // Mesin menghitung jumlah koin yang disortir
            int jumlahKoin = sortingMachine.countCoins();

            // Mesin mencetak tanda terima transaksi menggunakan objek Nota
            Nota receipt = new Nota();
            receipt.generateReceiptNumber();
            receipt.printReceiptInfo(jumlahKoin);

            // Tampilan layar menampilkan informasi transaksi dan tanda terima kepada pengguna
            displayScreen.showMessage("Terima kasih telah menggunakan Mesin Penyortiran Koin!");
            displayScreen.showMessage("Nomor Transaksi: " + receipt.getReceiptNumber());
            displayScreen.showMessage("Total Koin: " + jumlahKoin);

            // Mesin memperbarui status dan pemakaian mesin
            sortingMachine.updateUsage();
            sortingMachine.scheduleMaintenance();

            // Tampilkan pesan untuk menanyakan apakah pengguna ingin melanjutkan
            displayScreen.showMessage("Apakah Anda ingin melanjutkan operasi? (Y/N)");
            String continueOption = scanner.nextLine();
            if (!continueOption.equalsIgnoreCase("Y")) {
                break;
            }
        }
        scanner.close();
    }
}

class Koin {
    private int nilaiNominal;
    private String ukuran;
    private int tahunPenerbitan;
    private String kondisi;
    private String material;
    private String negaraAsal;
    private double berat;

    public void measureSize() {
        System.out.println("Mengukur ukuran koin...");
    }

    public void determineValue() {
        System.out.println("Menentukan nilai koin...");
    }

    public void checkAuthenticity() {
        System.out.println("Memeriksa keaslian koin...");
    }

    public String getDescription() {
        return "Deskripsi koin: Nilai Nominal: " + nilaiNominal + ", Ukuran: " + ukuran + ", Tahun Penerbitan: " + tahunPenerbitan + ", Kondisi: " + kondisi + ", Material: " + material + ", Negara Asal: " + negaraAsal + ", Berat: " + berat;
    }
}

class MesinSortir {
    private String jenisPenyortiran;
    private int kapasitas;
    private String status;
    private String modeOperasi;
    private String pemeliharaanTerakhir;
    private int pemakaian;

    public void measureCoin() {
        System.out.println("Mengukur koin yang dimasukkan ke dalam mesin...");
    }

    public void sortCoins() {
        System.out.println("Menyortir koin...");
    }

    public int countCoins() {
        // Implementasi penghitungan jumlah koin yang disortir
        return 10; // Contoh: koin disortir sebanyak 10
    }

    public void updateUsage() {
        System.out.println("Memperbarui jumlah pemakaian mesin...");
    }

    public void scheduleMaintenance() {
        System.out.println("Menjadwalkan pemeliharaan mesin...");
    }
}

class Nota {
    private String tanggalWaktu;
    private String rincianTransaksi;
    private double totalUang;
    private String nomorTransaksi;
    private String informasiPembayaran;
    private String namaPengguna;

    public void generateReceiptNumber() {
        System.out.println("Membuat nomor transaksi unik...");
    }

    public void printReceiptInfo(int jumlahKoin) {
        System.out.println("Tanggal & Waktu: " + tanggalWaktu);
        System.out.println("Nomor Transaksi: " + nomorTransaksi);
        System.out.println("Rincian Transaksi: " + rincianTransaksi);
        System.out.println("Total Uang: " + totalUang);
        System.out.println("Informasi Pembayaran: " + informasiPembayaran);
        System.out.println("Nama Pengguna: " + namaPengguna);
        System.out.println("Jumlah Koin: " + jumlahKoin);
    }
}

class CoinSlot {
    private String jenisKoinDiterima;
    private String status;
    private String lokasi;

    public void detectCoin() {
        System.out.println("Mendeteksi koin yang dimasukkan...");
    }

    public void openSlot() {
        System.out.println("Membuka slot...");
    }
}

class TampilanLayar {
    private String teks;
    private String resolusi;
    private String warna;

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void clearScreen() {
        System.out.println("Membersihkan layar...");
    }
}

class CoinContainer {
    private int kapasitas;
    private String jenisKoin;
    private int jumlahKoin;

    public void addCoin() {
        System.out.println("Menambahkan koin ke dalam wadah...");
    }

    public void removeCoin() {
        System.out.println("Menghapus koin dari wadah...");
    }

    public void checkCapacity() {
        System.out.println("Memeriksa kapasitas wadah...");
    }
}

