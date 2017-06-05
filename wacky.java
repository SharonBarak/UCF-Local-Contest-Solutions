import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class wacky {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t = scan.nextInt();
		for(int q = 1; q <= t; q++){
			out.println("Data set #"+q+":");
			int n = 0;
			int e = 0;
			int w = 0;
			int s = 0;
			int x = scan.nextInt();
			ArrayList<Car> arr = new ArrayList<Car>();
			for(int i = 0; i < x; i++){
				int idx = scan.nextInt();
				String d = scan.next();
				int time = scan.nextInt();
				if(d.equals("N")){
					n += time;
					time = n;
				}
				else if(d.equals("E")){
					e += time;
					time = e;
				}
				else if(d.equals("W")){
					w += time;
					time = w;
				}
				else{
					s += time;
					time = s;
				}
				arr.add(new Car(idx, time));
			}
			Collections.sort(arr);
			for(int i = 0; i < arr.size(); i++){
				out.println("Car #"+arr.get(i).idx);
			}
			out.println();
		}
		out.flush();
	}
	
	static class Car implements Comparable<Car>{
		
		int idx;
		int t;
		
		public Car(int idx, int t){
			this.idx = idx;
			this.t = t;
		}

		@Override
		public int compareTo(Car arg0) {
			return this.t-arg0.t;
		}
	}
}
