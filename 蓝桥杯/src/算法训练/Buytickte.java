package 算法训练;

public class Buytickte {
	/**
	 * 
	 * @param five_officer 售票员五毛的个数
	 * @param five_customer 顾客五毛个数
	 * @param one 顾客一元个数
	 */
	public static int buy(int five_officer , int five_customer , int one ) {
		if(five_customer+five_officer<one) {
			return 0 ;
		}
		if(five_customer == 0 || one == 0) {
			return 1 ;
		}
		if(five_officer == 0) {
			return buy(1, five_customer-1, one);
		}else {
			return buy(five_officer+1, five_customer-1, one)+buy(five_officer-1, five_customer, one-1);
		}
		
	}
}
