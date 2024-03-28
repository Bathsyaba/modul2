/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contoh;

/**
 *
 * @author ASUS Ryzen 5
 */
public class methodx {
    public double luas_lingkaran(int diameter) {
        int jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, jari2);
        return luas;
        
    }
    public static void main(String[] args) {
        methodx mx = new methodx();
        System.out.print("mt.luas_lingkaran(20)");
        System.exit(0);
    }
}
