/** NIM 			: 13020210288
  * NAMA			: RINA FEBRIYANTI HASJUM
  * HARI, TANGGAL	: RABU, 8 MARET 2023
  * WAKTU			: 22.10
*/
public class Oper4 {
	public static void main(String[] args) {
		int i = 0; /* perhatikan int i,j=0 bukan seperti ini */
		int j = 0;
		char c = 8; char d = 10;
		int e = (((int)c > (int)d) ? c: d);
		int k = ((i>j) ? i: j);
		/* ALGORITMA */
		System.out.print ("Nilai e = "+ e); 
		System.out.print ("\nNilai k = "+ k); 
		i = 2;
		j = 3;
		k = ((i++>j++) ? i: j) ;
		System.out.print ("\nNilai k = "+ k);
		}
}
