package 基础;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

class Complex{
	public double real ;
	public double imaginary ;
	public Complex(double real ,double imaginary) {
		this.real = real ;
		this.imaginary = imaginary ;
	}
	public Complex add(Complex c){
		double _real = c.real + this.real ;
		double _imaginary = c.imaginary + this.imaginary ;
		return new Complex(_real,_imaginary) ;
		 
	}
	public Complex sub(Complex c) {
		return new Complex(this.real-c.real ,this.imaginary-c.imaginary) ;
	}
	public Complex mul(Complex c) {
		return new Complex(this.real*c.real-this.imaginary*c.imaginary ,
				this.imaginary*c.real + this.real*c.imaginary);
	}
	public Complex div(Complex c) {
		double _real = BigDecimal.valueOf(c.real*this.real + 
				this.imaginary*c.imaginary).divide(BigDecimal.valueOf
						(c.real*c.real+c.imaginary*c.imaginary),3,BigDecimal.ROUND_HALF_UP).doubleValue();
		double _imaginary = BigDecimal.valueOf(c.real*this.imaginary - 
				this.imaginary*c.real).divide(BigDecimal.valueOf
						(c.real*c.real+c.imaginary*c.imaginary),3,BigDecimal.ROUND_HALF_UP).doubleValue();
		return new Complex(_real,_imaginary);
	}
}
public class Main14 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] nums = scan.nextLine().split(" ");
		scan.close();
		String operator = nums[0] ;
		DecimalFormat df = new DecimalFormat("#.00") ;
		Complex c1 = new Complex(Double.valueOf(nums[1]),Double.valueOf(nums[2]));
		Complex c2 = new Complex(Double.valueOf(nums[3]),Double.valueOf(nums[4]));
		switch(operator) {
			case "+" :
				Complex temp = c1.add(c2) ;
				System.out.println(df.format(temp.real)+"+"+df.format(temp.imaginary)+"i");
				break ;
			case "-" :
				Complex temp2 = c1.sub(c2) ;
				System.out.println(df.format(temp2.real)+"+"+df.format(temp2.imaginary)+"i");
				break ;
			case "*" :
				Complex temp3 = c1.mul(c2) ;
				System.out.println(df.format(temp3.real)+"+"+df.format(temp3.imaginary)+"i");
				break ;
			case "/" :
				Complex temp4 = c1.div(c2) ;
				System.out.println(df.format(temp4.real)+"+"+df.format(temp4.imaginary)+"i");
				break ;
		}
	}
}
