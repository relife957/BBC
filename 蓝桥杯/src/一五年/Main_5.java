package 一五年;
public class Main_5
{
    public static void f(int n)
    {
        String s = "*";
        for(int i=0; i<2*n-3; i++) s += ".";
        s += "*";
    
        String s1 = s + "\n";
        String s2 = "";
        
        for(int i=0; i<n-1; i++){
            //System.out.println("=>"+s);
            s = "." + s.substring(0,n*2-i-4)+ "*";  //填空
            s1 = s + "\n" + s1;
            s2 += s + "\n";
        }
        System.out.println(s1+s2);        
    }
    
    public static void main(String[] args)
    {
        f(8);
    }
}