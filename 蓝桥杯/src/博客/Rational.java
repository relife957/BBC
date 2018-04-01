package 博客;

public class Rational {
	private long _a ;
	private long _b ;
	public Rational() {
		_a = _b = 1 ;
	}
	
	//求a和b的最大公约数
	public static long gcd(long a, long b) {
		if(a<0) {
			a = -a ;
		}
		if(b<0) {
			b = -b;
		}
		if(b == 0) {
			return a ;
		}
		return gcd(b, a%b) ;
	}
	
	public Rational(long a,long b) {
		long d = gcd(a, b);
		_a = a/d ;
		_b = b/d ;
	}
	//两个有理数相加
	public Rational add(Rational x) {
		return new Rational(this._a*x._b+this._b*x._a,this._b*x._b);
	}
	//两个有理数相乘
	public Rational multiple(Rational x) {
		return new Rational(this._a*x._a,this._b*this._b);
	}
	//求有理数的倒数
	public Rational inserve() {
		return new Rational(this._b,this._a);
	}
	//两个有理数相除
	public Rational diver(Rational x) {
		return multiple(x.inserve());
	}
	//求一个有理数的相反数
	public Rational negative() {
		return new Rational(-this._a,this._b);
	}
	//求两个有理数相减
	public Rational sub(Rational x) {
		return add(x.negative());
	}
	public static Rational valueOf(long x) {
		return new Rational(x,1);
	}
	public String toString() {
		if(this._b == 1) {
			return _a+"" ;
		}else {
			return _a+"/"+_b ;
		}
	}
	public static void main(String[] args) {
		System.out.println(new Rational(18,24).add(Rational.valueOf(6)));
	}
}
