package 算法训练;

public class Main12 {
	public String intToRoman(int num) {
		 String [] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};    
		 int [] value = {1000,900,500,400, 100, 90,  50, 40,  10, 9,   5,  4,   1};   
		 String result = "";
		 for(int i = 0 ; num!= 0 ; i++) {
			 while(num>=value[i]){
				 result+=symbol[i] ;
				 num-=value[i];
			 }
		 }
		 return result;
     }
}
