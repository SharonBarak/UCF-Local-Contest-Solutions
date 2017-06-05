import java.util.Scanner;

public class isograms {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int q = 1; q <= t; q++){
			String s = scan.next();
			int[] freq = new int[26];
			for(int i = 0; i < s.length(); i++){
				freq[s.charAt(i)-'a']++;
			}
			boolean can = true;
			for(int i = 0; i < 26; i++){
				if(freq[i] != 0 && freq[i] != 2){
					can = false;
				}
			}
			if(can) System.out.println(s+" --- pair isograms");
			else System.out.println(s+" --- not pair isograms");
			System.out.println();
		}
	}
}
