import java.util.Scanner;
public class SiakadFor24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int mahasiswaLulus = 0; //M
        int mahasiswaTidakLulus = 0; //M
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;   
            }
            if (nilai >= 60 ) { //M
                mahasiswaLulus++; //M
            }else{ //M
                mahasiswaTidakLulus++; //M
            } //M
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + mahasiswaLulus); //M
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + mahasiswaTidakLulus);//M
        sc.close();
    }
}