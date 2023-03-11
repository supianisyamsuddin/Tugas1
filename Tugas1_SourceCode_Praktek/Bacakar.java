/* NIM 		  : 13020210085
   Nama 		  : Supiani Syamsuddin
   Hari/Tanggal 	  : Senin, 6 Maret 2023
   Waktu Pengerjaan : 11.40 */


public class Bacakar {
/**
* @param args
* @throws IOException
*/
public static void main(String[] args) throws IOException {
char cc; int bil;
InputStreamReader isr = new 
InputStreamReader(System.in); 
BufferedReader dataIn = new BufferedReader(isr);
// atau
BufferedReader datAIn = new BufferedReader(new
InputStreamReader(System.in));

System.out.print ("hello\n");
System.out.print("baca 1 karakter : ");
//perintah baca karakter cc
cc =dataIn.readLine().charAt(0); 
System.out.print("baca 1 bilangan : ");
//perintah baca bil
bil =Integer.parseInt(datAIn.readLine());
/*String kar = JOptionPane.showInputDialog("Karakter 1 
: "); System.out.println(kar);*/
//JOptionPane.showMessageDialog(null,"hello"); 
System.out.print (cc +"\n" +bil+"\n"); 
System.out.print ("bye \n");
/* Tambahkan program membaca/input data
menggunakan Class Scanner, Class Console dan Class 
JOptionPane */
}
}
