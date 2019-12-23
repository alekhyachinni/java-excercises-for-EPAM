import java.io.*;
import java.util.*;
class Day13-2
{
public static void main(String[]args)
{
int n,i,min,max;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}min=a[0];
max=a[0];
for(i=0;i<n;i++)
{
if(max<a[i])
max=a[i];
if(min>a[i])
min=a[i];
}
System.out.println(max);
System.out.println(min);
}
}
