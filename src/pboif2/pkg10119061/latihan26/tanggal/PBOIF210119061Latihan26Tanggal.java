/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan26.tanggal;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author Rheiza
 * NAMA  : Rheiza Akaml R
 * KELAS : IF2   
 * NIM   : 10119061
 */
public class PBOIF210119061Latihan26Tanggal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Date tanggal = new Date ();
         
         SimpleDateFormat format = new SimpleDateFormat("E dd MMMM yyyyy HH :mm:ss");
         System.out.println("Hari ini : " + format.format(tanggal));
    
    }
    
}
