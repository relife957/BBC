package 基础;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i = 1 ; i < 10 ; i++) {
			for(int j = 0 ; j < 10 ; j ++) {
				for(int k = 0 ; k <10 ; k ++) {
					if(2*i+2*j+k == number) {
						int temp_five = i*10000 + j*1000 + k*100+j*10+i ;
						list.add(temp_five);
					}else if(2*i+2*j+2*k == number) {
						int temp_six = i*100000 + j*10000+k*1000+k*100+j*10+i ;
						list.add(temp_six);
					}
				}
			}
		}
		Collections.sort(list);;
		for(int i = 0 ; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		
		scanner.close();
	}
}

