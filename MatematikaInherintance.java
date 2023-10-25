/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author naufa
 */
public class MatematikaInherintance {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Matematika mtk = new Matematika();
         Matematika2 mtk2 = new Matematika2();

         int pertambahan = mtk.pertambahan(900, 11);
         int pengurangan = mtk.pengurangan(15, 2);
         int perkalian = mtk.perkalian(303, 5);
         float pembagian = mtk.pembagian(22, 7);
         int modulus = mtk2.modulus(17, 8);

         System.out.println("Pertambahan: 900 + 11 = " + pertambahan);
         System.out.println("Pengurangan: 15 - 2 = " + pengurangan);
         System.out.println("Perkalian  : 303 * 5 = " + perkalian);
         System.out.println("Pembagian  : 24 / 7 = " + pembagian);
         System.out.println("Modulus    : 17 % 8 = " + modulus);
    }
    
}
