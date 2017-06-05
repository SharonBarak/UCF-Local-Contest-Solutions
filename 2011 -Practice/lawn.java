import java.util.Scanner;

public class lawn {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Q = 1;
		while(true){
			int n = scan.nextInt();
			if(n == 0) return;
			Point[] lawn = new Point[n];
			long areaBig = 0;
			for(int i = 0; i < n; i++){
				lawn[i] = new Point(scan.nextInt(), scan.nextInt());
			}
			areaBig = lawn[n-1].x*lawn[0].y-lawn[n-1].y*lawn[0].x;
			for(int i = 0; i < n-1; i++){
				areaBig += lawn[i].x*lawn[i+1].y-lawn[i].y*lawn[i+1].x;
			}
			areaBig /= 2.0;
			int v = scan.nextInt();
			double areaSub = 0;
			Point[] house = new Point[v];
			for(int i = 0; i < v; i++){
				house[i] = new Point(scan.nextInt(), scan.nextInt());
			}
			areaSub = house[v-1].x*house[0].y-house[v-1].y*house[0].x;
			for(int i = 0; i < v-1; i++){
				areaSub += house[i].x*house[i+1].y-house[i].y*house[i+1].x;
			}
			areaSub /= 2.0;
			int k = scan.nextInt();
			for(int q = 0; q < k; q++){
				double area = 0;
				int x = scan.nextInt();
				Point[] land = new Point[x];
				for(int i = 0; i < x; i++){
					land[i] = new Point(scan.nextInt(), scan.nextInt());
				}
				area = land[x-1].x*land[0].y-land[x-1].y*land[0].x;
				for(int i = 0; i < x-1; i++){
					area += land[i].x*land[i+1].y-land[i].y*land[i+1].x;
				}
				area /= 2.0;
				areaSub += area;
			}
			System.out.println("Lawn #"+Q+": buy "+(int)Math.ceil((areaBig-areaSub)/1000)+" bag(s)");
			System.out.println();
			Q++;
		}
	}
	
	static class Point{
		
		int x;
		int y;
		
		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}

/*
4 0 0 100 0 100 100 0 100
4 20 20 80 20 80 80 20 80
1
4 20 10 30 10 30 20 20 20
4 50 50 250 50 250 200 50 200
6 100 100 150 100 150 150 200 150 200 200 100 200
2
5 50 50 70 50 70 60 60 70 50 70
4 150 100 250 100 250 120 150 120
0
*/
