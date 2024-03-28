/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contoh;
public class modul2202357201045 {
    public static void main(String[] args) {
       int bil = 10;
       String b[] = { "a", "b", "c" };
       
       try {
           System.out.println(bil / 0);
           System.out.println(b[3]);
       }catch (ArithmeticException ai){
           System.out.println("Error Aritmatik");
           System.out.println(ai.getMessage());
       }catch (ArrayIndexOutOfBoundsException n){
           System.out.println("Error karena melebihi kapasiias array");
           System.out.println(n.getMessage());
       }catch (Exception e){
           System.out.println("ada error");
           System.out.println(e.getMessage());
       }
    }
}