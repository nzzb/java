import java.util.Random;
import java.util.Scanner;
public class seven {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		//7.3
		int[] a=new int[100];
		int i, j, count;
		boolean flag=true;
		System.out.println("Enter the integers between 1 and 100:");
		for(i=0;i<100;i++)
		{
			a[i]=input.nextInt();
			if(a[i]==0)
				break;
		}
		for1:for(i=0;i<=100;i++)
		{
			count=0;
			for(j=0;j<a.length;j++)
			{
				if(a[j]==i)
					count++;
				if(a[j]<0||a[j]>100)
				{
					System.out.println("Some data are errors");
					flag=false;
					break for1;
				}
			}
			if(count!=0&&i!=0)
				System.out.printf("%d occurs %d times\n",i,count);
		}
		
		//7.5
		System.out.printf("Enter 10 numbers:\n");
		int[] b=new int[10],c=new int[10];
		int t=0;
		for(i=0;i<10;i++)
			b[i]=0;
		for(i=0;i<10;i++)
			a[i]=input.nextInt();
		for(i=0;i<10;i++)
			for(j=i+1;j<10;j++)
				if(a[j]==a[i])
					b[j]++;
		count=0;
		for(i=0;i<10;i++)
			if(b[i]==0)
				count++;
		System.out.printf("The number of distinct numbers are %d\n",count);
		System.out.print("The distinct number are ");
		for(i=0;i<10;i++)
			if(b[i]==0)
				System.out.printf("%d ",a[i]);
		System.out.printf("\n");
		
		//7.17
		//next方法不能得到带空格的字符串。
		//nextLine()方法返回的是Enter键之前的所有字符，它是可以得到带空格的字符串的。
		System.out.println("请输入学生人数(不超过100人)");
		int n=input.nextInt();
		int[] a17=new int[100],c17=new int[100];
		String[] b17=new String[100];
		String ch;
		System.out.println("请输入学生的姓名和他们的成绩");
		for(i=0;i<n;i++)
		{
			b17[i]=input.next();
			a17[i]=input.nextInt();
			c17[i]=i;
		}
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				if(a17[j]>a17[i])
				{
					t=c17[j];
					c17[j]=c17[i];
					c17[i]=t;
				}
			}
		}
		System.out.println("学生的降序排序：");
		for(i=0;i<n;i++)
			System.out.printf("%s ",b17[c17[i]]);
		
		//7.18
		
		
		
		
	}
}
