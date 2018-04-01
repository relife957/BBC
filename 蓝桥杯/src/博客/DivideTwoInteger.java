package 博客;

public class DivideTwoInteger {
	public int divide(int dividend,int dividor) {
		if(dividend == Integer.MAX_VALUE && Math.abs(dividor)==1) {
			return dividor==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
		}
		return divideLong(dividend,dividor);
	}
	public static int divideLong(long dd,long dv) {
		boolean flag = (dd>0&&dv>0)||(dd<0&&dv<0);
		dd = Math.abs(dd);
		dv = Math.abs(dv);
		int digits = 0 ;
		while(dd>=dv) {
			dv <<=1 ;
			digits++ ;
		}
		int res = 0 ;
		dv>>=digits ;
		digits-- ;
		for(int i = digits ; i>=0 ;i++) {
			if(dd>=dv<<digits){
				dd-=dv<<digits;
				res += 1<<digits;
			}
		}
		return flag?res:-res ;
	}
}	
