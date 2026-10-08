import java.util.Scanner;

public class StudiKasus204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nameMahasiswa, jenisKeg;
        int jumlahDok, peringkatJua, statusDana, kurangDok;

        System.out.print("Masukkan nama mahasiswa : ");
        nameMahasiswa = sc.nextLine();

        System.out.print("Masukkan jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKeg = sc.nextLine();

        if (jenisKeg.equalsIgnoreCase("BELMAWA") || jenisKeg.equalsIgnoreCase("BAKORMA") || jenisKeg.equalsIgnoreCase("MANDIRI")) {
            System.out.print("jumlah dokumen : ");
            jumlahDok = sc.nextInt();

            System.out.print("peringkat juara : ");
            peringkatJua = sc.nextInt();

            if (jumlahDok < 4) {
                kurangDok = 4 - jumlahDok;

                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurangDok + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (peringkatJua >= 1 && peringkatJua <= 3) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Peringkat juara tidak memenuhi syarat. Dana penghargaan tidak diberikan.");
                }
            }
        } else if (jenisKeg.equalsIgnoreCase("PKM")) {
            System.out.print("jumlah dokumen : ");
            jumlahDok = sc.nextInt();

            System.out.print("lolos pendanaan? (true/false): ");
            boolean lolosPendanaan = sc.nextBoolean();

            if (jumlahDok < 4) {
                kurangDok = 4 - jumlahDok;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurangDok + " dokumen). Dana penghargaan tidak diberikan.");

            } else {
                if (lolosPendanaan) {
                    System.out.println("Status : Lolos pendanaan PKM. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Tidak lolos pendanaan PKM. Dana penghargaan tidak diberikan.");
                }
            }
        } else {
            System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }
    }
}