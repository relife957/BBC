package 试验;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class BookCook implements Comparable<BookCook>{  
    private String title;  
    private double price;  
    public BookCook(String title,double price){  
        this.title = title;  
        this.setPrice(price);  
    }  
    @Override  
    public String toString() {  
        return "书名："+this.title+",价格："+this.getPrice();  
    }  
    @Override  
    public int compareTo(BookCook o) {  
        if(this.getPrice() > o.getPrice()){  
            return 1;  
        }else if(this.getPrice() < o.getPrice()){  
            return -1;  
        }else{  
            return 0;  
        }  
    }
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}  
}  

class Bookcomparator implements Comparator<BookCook>{

	@Override
	public int compare(BookCook o1, BookCook o2) {
		// TODO Auto-generated method stub
		if(o1.getPrice() > o2.getPrice()) {
			return -1 ;
		}else if(o1.getPrice()<o2.getPrice()){
			return 1 ;
		}
		return 0;
	}
	
}
public class Compare {
	public static void main(String[] args) {
		BookCook b1 = new BookCook("一", 90);
		BookCook b2 = new BookCook("二", 80);
		BookCook b3 = new BookCook("三", 60);
		BookCook b4 = new BookCook("四", 70);
		BookCook[] bookCooks = {b1,b2,b3,b4};
		Arrays.sort(bookCooks, new Bookcomparator());
		for(BookCook book : bookCooks) {
			System.out.println(book.toString());
		}
	}

}
