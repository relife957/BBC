package 历届试题;

import java.util.*;  
public class Main4_3 {  
  
    /** 
     * @param args 
     */  
  
public static class num //内部类  
{  
    public long h;//用long，否则会出错  
    public long t;//<span style="background-color:rgb(255,255,0);">//用long,否则会出错</span>  
}  
static num num1[]=new num[100001];//一开始开了100005个，但是造成了有一组测试数据超时  
static num num2[]=new num[100001];//  
    public static void main(String[] args) {  
  
        for(int i=0;i<100001;i++)//对内部类对象初始化  
        {  
            num1[i]=new num();  
            num2[i]=new num();  
        }  
        Scanner input=new Scanner(System.in);  
        int n=input.nextInt();  
        for(int j=0;j<n;j++)  
        {  
            num1[j].h=input.nextInt();  
        }  
        input.close();
        merge(num1,0,n-1);  
        long sum=0;//<span style="background-color:rgb(255,255,0);">//必须用long，否则会错误</span>  
        for(int k=0;k<n;k++)  
        {  
            //System.out.println(num1[k].h+" "+num1[k].t);  
            sum+=(num1[k].t*(num1[k].t+1))/2;//等差数列求和公示   
        }  
          
        System.out.println(sum);  
}  
    public static void merge(num a[],int left,int right)  
    {  
        if(left==right)   //终止递归的条件  
        {  
            return;  
        }  
        int mid=(left+right)/2;  
        merge(a,left,mid);  
        merge(a,mid+1,right);  
        int p=left;  
        int q=mid+1;  
        int i=left;  
         while(p<=mid && q<=right)  
         {  
             if(a[p].h>a[q].h)  
             {  
                 a[q].t+=mid+1-p;//<span style="background-color:rgb(255,255,0);">//如果左数组第一个元素比右数组第一个元素大，因为左右数组都是从小到大排序的  
//所以左数组所有的元素（mid+1-p个）都大于右数组第一个元素;  
                 num2[i++]=a[q++];//注意这里交换的是类对象,这是归并排序的核心知识</span>  
             }  
             else{  
                 a[p].t+=q-1-mid;//左数组的第一个元素小于或者等于右数组的第一个元素，q-1-mid==0,在右数组中，q所指的元素前面的元素就是那个小于p所指的元素，q-1-mid就是q所指元素的前边元素的个数;</span>  
                 					//之所以求q前面有多少个数,是因为每次之前的q移动的时候,都会移动a[p]
                 num2[i++]=a[p++];  
             }  
         }  
         while(q<=right)//<span style="background-color:rgb(255,255,0);">//右数组有剩余，说明左数组的元素都比右数组剩下的元素小</span>  
         {  
            num2[i++]=a[q++];  
         }  
         q--;//<span style="background-color:rgb(255,255,0);">//在前边判断循环终止时q=last+1，所以循环终止，所以这里需要减去1</span>  
         while(p<=mid)  
         {  
             a[p].t+=q-mid;  
            num2[i++]=a[p++];  
         }  
           
         
        int j=left;  
         for(;j<=right;j++)  
         {  
             a[j]=num2[j];//<span style="background-color:rgb(255,255,0);">//将排序好的类对象数组传给原类对象数组</span>  
         }  
          
    }  
}  