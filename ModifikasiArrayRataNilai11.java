import java.util.Scanner;
public class ModifikasiArrayRataNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double rata2, total = 0;
        int jmlLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " lulus!");
                jmlLulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + " tidak lulus.");
            }
        }
        System.out.println("Banyak mahasiswa yang lulus sebanyak: " + jmlLulus);
        sc.close();
    }
}