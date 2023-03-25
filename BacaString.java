/*Nama: Sukmawati*/
/*NIM: 13020210025*/
/*Hari/Tanggal: Sabtu/25-03-2023*/
/*Waktu: 12.30 PM*/

package tgs1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;
public class BacaString {
    
    /**
    * @param args
    * @throws IOException
    */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        /* Kamus */
        String str;

        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        /* Program */

        System.out.print ("\nBaca string dan Integer: \n");
        System.out.print("masukkan sebuah string: ");
        str= datAIn.readLine();
        System.out.print ("String yang dibaca : "+ str);
        
    }
    
}
