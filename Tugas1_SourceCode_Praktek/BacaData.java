/* NIM 		  : 13020210085
   Nama 		  : Supiani Syamsuddin
   Hari/Tanggal 	  : Senin, 6 Maret 2023
   Waktu Pengerjaan : 11.34 */
 
import java.util.Scanner;

 public class BacaData {
/**
* @param args
*/
public static void main(String[] args) {
int a;
Scanner masukan;

System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
masukan = new Scanner(System.in);
a = masukan.nextInt(); /* coba ketik : 
masukan.nextInt(); 
Apa akibatnya ?*/
System.out.print ("Nilai yang dibaca : "+ a);
}
 }
