import java.util.Scanner;

public class operasiBoleean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        {System.out.print("absen : ");
            var absen = scanner.nextLine();

            System.out.print("nilai =");
            var nilai = scanner.nextLine();}

        var absen = 80 ;
        var nilai = 80 ;


        boolean  lulusAbsen = absen >= 80;
        boolean lulusNilai = nilai >= 80;

        var lulus = lulusAbsen && lulusNilai ;
        System.out.println(lulus);



    }
}
