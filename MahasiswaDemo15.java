import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        Mahasiswa15[] arrayOfMahasiswa15 = new Mahasiswa15[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa15[i] = new Mahasiswa15();
            System.out.println("masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM     :");
            arrayOfMahasiswa15[i].nim = sc.nextLine();
            System.out.print("Nama    :");
            arrayOfMahasiswa15[i].nama = sc.nextLine();
            System.out.print("Kelas   :");
            arrayOfMahasiswa15[i].kelas = sc.nextLine();
            System.out.print("IPK     :");
            dummy = sc.nextLine();
            arrayOfMahasiswa15[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------");

        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM     :"+ arrayOfMahasiswa15[i].nim);
            System.out.println("Nama    :"+ arrayOfMahasiswa15[i].nama);
            System.out.println("Kelas   :"+ arrayOfMahasiswa15[i].kelas);
            System.out.println("IPK     :"+ arrayOfMahasiswa15[i].ipk);
            System.out.println("-------------------------------------");
        }
    }
}