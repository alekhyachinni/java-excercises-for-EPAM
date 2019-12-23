import java.io.*;
import java.util.*;
class Day13-3
{
public static void main(String[]args)
{
int n,i,k,flag=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
k=sc.nextInt();
for(i=0;i<n;i++)
{
if(k==a[i])
{flag=1;
break;
}
}
if(flag==1)
{
System.out.println(i+1);
}
else
{
System.out.println("-1");
}
}
}
