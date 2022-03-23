import java.util.*;

class Array
{
public  static void main(String[] args)
 
{
  
int n;
System.out.println("enter the size of array:");
 Scanner input=new Scanner(System.in);
 n=input.nextInt();
int a[]=new int[n];
 
int i;
 
System.out.println("enter the number to be inserted:");
  
for(i=0;i<n;i++)
  
{
     
  a[i]=input.nextInt();
    
 }
   
 System.out.println("array elements are:");
   
 for(i=0;i<n;i++)
    
{
  
 System.out.println(a[i]);
  
}
 
}

}