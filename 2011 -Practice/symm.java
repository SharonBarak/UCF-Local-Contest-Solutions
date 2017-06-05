import java.io.PrintWriter;
import java.util.Scanner;

public class symm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter out =  new PrintWriter(System.out);
		int Q = 1;
		while(true){
			int n = scan.nextInt();
			if(n == 0) return;
			out.println("Input matrix #"+Q+":");
			String[][] grid = new String[n][n];
			for(int i = 0; i < n; i++){
				String p = "";
				for(int j = 0; j < n; j++){
					grid[i][j] = scan.next();
					p += grid[i][j]+" ";
				}
				out.println(p.trim());
			}
			int t = scan.nextInt();
			for(int q = 1; q <= t; q++){
				int x = scan.nextInt();
				out.println("Symmetric diagonals "+x+":");
				int r = 0;
				int c = x-1;
				String ans = "";
				while(r < n && c < n){
					ans += grid[r][c]+" ";
					r++;
					c++;
				}
				out.println(ans.trim());
				if(x != 1){
					r = x-1;
					c = 0;
					ans = "";
					while(r < n && c < n){
						ans += grid[r][c]+" ";
						r++;
						c++;
					}
					out.println(ans.trim());
				}
			}
			Q++;
			out.println();
			out.flush();
		}
	}
}