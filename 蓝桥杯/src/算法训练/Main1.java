package 算法训练;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
	public static int[][] shortTime(int[][] array) {
		final int INFO = Integer.MAX_VALUE;
		int[][] time = new int[array.length][array.length];
		for (int i = 0; i < time.length; i++) {
			for (int j = 0; j < time.length; j++) {
				time[i][j] = (array[i][j] == 0 ? INFO:array[i][j]) ;
			}
		}
		for(int k=0;k<array.length;k++){ 
		    for(int i=0;i<array.length;i++) {
		        for(int j=0;j<array.length;j++) {
		            if(time[i][k] < INFO && time[k][j] < INFO && time[i][j]>(time[i][k]+time[k][j])){
		                time[i][j]=time[i][k]+time[k][j] ;
		                time[j][i] = time[i][j] ;
		            } 
		        } 
		     }
	    }
		return time;
}

	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int location_number = scanner.nextInt();
	int road_number = scanner.nextInt();
	ArrayList<int[]> beginning = new ArrayList<>();
	ArrayList<int[]> end = new ArrayList<>();
	ArrayList<int[]> mid = new ArrayList<>();
	
	for(int i = 0 ; i < road_number;i++) {
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		int time = scanner.nextInt();
		int[] temp = {first,second,time};
		if(first == 0) {
			beginning.add(temp);
		}else if(second == location_number-1) {
			end.add(temp);
		}else {
			mid.add(temp);
		}
	}
	
	//构建邻接矩阵
	int[][] array = new int[location_number-2][location_number-2];
	for(int i = 0 ; i < mid.size() ;i++) {
		int[] temp = mid.get(i);
		array[temp[0]-1][temp[1]-1] = temp[2] ;
	}
	
	int [][] shorttime = shortTime(array);
	int min = Integer.MAX_VALUE ;
	int roadLength = 0 ;
	for(int i = 0 ; i < beginning.size();i++) {
		for(int j = 0 ; j < end.size();j++) {
			int temp = shorttime[beginning.get(i)[1]-1][end.get(j)[0]-1];
			if(temp<min) {
				min = temp ;
				roadLength = beginning.get(i)[2]*2 + end.get(j)[2]*2 ;
			}
		}
	}
	System.out.println(min*4+roadLength);
	scanner.close();
	
	}

}
