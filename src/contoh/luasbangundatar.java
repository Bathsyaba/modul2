
import javax.swing.JOptionPane;

public class luasbangundatar {

    //method menghitung luas persegi panjang
    public static int hitung_luas_persegi_panjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    //method untuk menghitung segitiga
    public static double hitung_luas_segitiga(int alas, int tinggi) {
        return 0.5 * alas;
    }

    //method untuk menghitung luas lingkaran
    public static double hitung_luas_lingkaran(int jari2) {
        return Math.PI * Math.pow(jari2, jari2);
    }

    public static void main(String[] args) {
        //persegi panjang
        int panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang persegi panjang :"));
        int lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan lebar persegi panjang :"));
        int luaspersegipanjang = hitung_luas_persegi_panjang(panjang, lebar);
        JOptionPane.showMessageDialog(null, "Luas persegi panjang" + luaspersegipanjang);
        System.out.println("Luas persegi panjang :" + luaspersegipanjang);

        //segitiga
        int alas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan alas segitiga : "));
        int tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tinggi segitiga :"));
        double Luassegitiga = hitung_luas_segitiga(alas, tinggi);
        JOptionPane.showMessageDialog(null, "Luas segitiga " + Luassegitiga);
        System.out.println("Luas segitiga :" + Luassegitiga);

        //Lingkaran
        int jari2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jari2 Lingkaran :"));
        double Luaslingkaran = hitung_luas_lingkaran(jari2);
            JOptionPane.showInputDialog(null, "Luas Lingkaran " + Luaslingkaran);
            System.out.println("Luas Lingkaran :" + Luaslingkaran);
    }
}


