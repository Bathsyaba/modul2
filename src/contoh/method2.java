/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contoh;

/**
 *
 * @author ASUS Ryzen 5
 */
import java.util.Scanner;
public class method2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        double r, h, a, b, c;

        System.out.println("Pilih jenis bangun ruang yang ingin Anda hitung volume:");
        System.out.println("1. Tabung");
        System.out.println("2. Kerucut");
        System.out.println("3. Bola");
        System.out.print("Masukkan pilihan Anda: ");
        pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan jari-jari tabung: ");
                r = scanner.nextDouble();
                System.out.println("Volume tabung: " + hitungVolumeTabung(r));
                break;
            case 2:
                System.out.print("Masukkan jari-jari kerucut: ");
                r = scanner.nextDouble();
                System.out.print("Masukkan tinggi kerucut: ");
                h = scanner.nextDouble();
                System.out.println("Volume kerucut: " + hitungVolumeKerucut(r, h));
                break;
            case 3:
                System.out.print("Masukkan jari-jari bola: ");
                r = scanner.nextDouble();
                System.out.println("Volume bola: " + hitungVolumeBola(r));
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }

    public static double hitungVolumeTabung(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    public static double hitungVolumeKerucut(double r, double h) {
        return (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * h;
    }

    public static double hitungVolumeBola(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }
}  

