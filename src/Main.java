import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nama: ");
        String nama = scanner.nextLine();


        System.out.print("Jenis Kelamin (L/P): ");
        String jenisKelaminInput = scanner.nextLine();

        String jenisKelamin = jenisKelaminInput.equalsIgnoreCase("L") ? "Laki-laki" : "Perempuan";


        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tanggalLahirStr = scanner.nextLine();

        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);


        LocalDate now = LocalDate.now();

        long tahun = ChronoUnit.YEARS.between(tanggalLahir, now);
        long bulan = ChronoUnit.MONTHS.between(tanggalLahir.plusYears(tahun), now);


        System.out.println("\n\nOutput:");

        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur Anda: " + tahun + " tahun " + bulan + " bulan");
    }
}