import java.util.Scanner;

public class ngram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Q = 1;
		while(true){
			int n = scan.nextInt();
			scan.nextLine();
			if(n == 0) return;
			String paragraph = "";
			for(int i = 0; i < n; i++) paragraph += scan.nextLine()+" ";
			paragraph = paragraph.replaceAll(" {1,}", "*");
			paragraph = paragraph.replaceAll(",{1,}", "*");
			paragraph = paragraph.replaceAll("\\.{1,}", "*");
			paragraph = paragraph.replaceAll("\\*{1,}", "*");
			System.out.println(paragraph);
			
			System.out.println();
			Q++;
		}
	}
}

/*
4
z z. z,z. z z. z,z.
go go go
go go go
ali ali ali
3
a a. a,a.
bc bc
abcd abcd abcd
0 

*/