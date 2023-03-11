/** NIM 			: 13020210288
  * NAMA			: RINA FEBRIYANTI HASJUM
  * HARI, TANGGAL	: Jumat, 10 MARET 2023
  * WAKTU			: 21.40
*/
import java.util.Scanner;
public class StudiKasus{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan total detik : ");
		int d = sc . nextInt();
		int d1 = d % 60;
		int m = d / 60;
		int m2 = m % 60;
		int j = m /  60;
		int j1 = j % 24;
		System.out.println("Detik = " + d1);
		System.out.println("Total menit	= " + m);
		System.out.println("Menit = " + m2);
		System.out.println("Total jam = " + j);
		System.out.println("Jam = " + j1);
	}
}