package 试验;

public class Recursion {
	//从n个球中取出m个球,求所有的可能性
	public static int f1(int n , int m) {
		if(n<m) {
			return 0 ;
		}else if(n == m) {
			return 1 ;
		}else if(m == 0) {
			return 1 ;
		}
		return f1(n-1, m-1) + f1(n-1, m);
	}
	//求一个字串的全排列
	public static void f2(char[] array , int k) {
		if(k == array.length-1) {
			for(int i = 0 ; i < array.length;i++) {
				System.out.print(array[i]);
			}
			System.out.println();
		}
		for(int i = k ; i < array.length ; i++) {
			{
				char temp = array[i] ;
				array[i] = array[k];
				array[k] = temp ;
			}
			f2(array, k+1);
			{
				char temp = array[i] ;
				array[i] = array[k];
				array[k] = temp ;
			}
		}
	}
	
	//求两个字串的公共子序列的最大长度
	public static int f3(String s1 , String s2) {
		if(s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		if(s1.charAt(0) == s2.charAt(0)) {
			return f3(s1.substring(1), s2.substring(1))+1;
		}else {
			return Math.max(f3(s1, s2.substring(1)), f3(s1.substring(1), s2));
		}
		
	}
	
	public static void main(String[] args) {
		//一
		System.out.println(f1(5, 3));
		//二
		char[] array = "abcde".toCharArray();
		f2(array, 0);
		//三
		System.out.println(f3("abcds", "rbfcs"));
	}
}
