/** NIM 			: 13020210288
  * NAMA			: RINA FEBRIYANTI HASJUM
  * HARI, TANGGAL	: RABU, 8 MARET 2023
  * WAKTU			: 20.10
*/
	import java.util.Scanner;
	
	public class BacaData {
	public static void main(String[] args) {
		int a;
		Scanner masukan;
		System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
		masukan = new Scanner(System.in);
		a = masukan.nextInt();
	
		System.out.print ("Nilai yang dibaca : "+ a);
	}
 }