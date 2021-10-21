import java.util.Random;
import java.util.Scanner;
public class five {
	public static void main(String[] args){
		//5.7
		float total=0,tuition=10000;
		for(int i=0;i<10;i++)
		{
			if(i<4)
				total+=tuition;
			tuition*=1.05;
		}
		System.out.println("total is "+total);
		System.out.println("tuition is "+tuition);
		
		//5.17
		System.out.print("Enter the number of lines: ");
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			int k=n;
			for(int j=1;j<i+n;j++)
			{
				if(j<n)
				{
					if(k<=i)
						System.out.print(k+" ");
					else
						System.out.print("  ");
					k--;
				}
				else
				{
					System.out.print(k+" ");
					k++;
				}
			}
			System.out.println();
		}
		
		//5.19
		int i,j,p,q;
		for(i=0;i<8;i++)
		{
			j=0;
			for(p=1;p<=8;p++)
			{
				if((8-p)>i)
				{
					System.out.print(' ');
					j++;
				}
				else
				{
					System.out.print((int)Math.pow(2,i-7+j));
					j++;
				}
				System.out.print(' ');
			}
			for(q=7;q>=1;q--)
			{
				if((8-q)<=i)
					System.out.print((int)Math.pow(2,(i-8+q)));
				else
					System.out.print(' ');
				System.out.print(' ');
			}
			System.out.print('\n');
		}
		
		//5.21
		System.out.print("Loan Amount: ");
		double loan=input.nextDouble();
		System.out.print("Number Of Years: ");
		double year=input.nextDouble();
		System.out.println("Interest Rate"+"     "+"Monthly Payment"+"     "+"Total Payment");
		for(double v=5.000;v<=8.000;v+=0.125)
		{
			double w=v/1200,mpay;
			mpay = (loan*w)/(1-(1/(Math.pow(1+w,year*12))));
			System.out.printf("%.3f %2s",v,"%           ");
			System.out.printf("%.2f %2s",mpay,"             ");
			System.out.printf("%.2f\n",year*12*mpay);
		}
		
		//5.22
		System.out.print("Loan Amount: ");
		loan = input.nextDouble();
		System.out.print("Number of Years: ");
		year=input.nextDouble();
		System.out.print("Annual Interest Rate: ");
		double ar = input.nextDouble(),mr=ar/1200;
		double mpay,tpay;
		mpay = (loan*mr)/(1-(1/(Math.pow(1+mr,year*12))));
		System.out.printf("\nMonthly Payment: %.2f\n",mpay);
		tpay = mpay*year*12;
		System.out.printf("Total Payment: %.2f\n",tpay);
		System.out.println("Payment#\tInterest\tPrincipal\tBalance");
		for(i=1;i<=year*12;i++)
		{
			double interest =mr*loan,principal = mpay-interest;
			loan-=principal;
			if(i==year*12&&loan!=0)
			{
				principal +=loan;
				loan-=loan;
			}
			System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n",i,interest,principal,loan);
		}
		
		
		//5.25
		double pii=0;
		double h,y;
		for(h=10000;h<=100000;h+=10000)
		{
			for(y =1;y<=h;y++)
			{
				if(y%2==0)
					pii-=1/(2*y-1);
				else
					pii+=1/(2*y-1);
			}
			System.out.printf("%.1f = %.7f\n",h,4*pii);
			pii=0;
		}
		
		//5.26
		for(h=10000;h<100001;h+=10000)
		{
			double e=1,item=1;
			for(y=1;y<=h;y++)
			{
				item*=1.0/y;
				e+=item;
			}
			System.out.printf("%.1f = %.10f\n",h,e);
		}
		
		//5.27
		int count=0;
		for(i =101;i<=2100;i++)
		{
			if(i%400==0||i%4==0&&i%100!=0)
			{
				System.out.printf("%5d",i);
				count++;
				if(count%10==0)
					System.out.print("\n");
			}
		}
		System.out.println("\n Count: "+count);
		
		//5.28
		System.out.print("Enter year and day of week:");
		int yy = input.nextInt(),ww = input.nextInt();
		String m[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		String d[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int[] nl0 = {0,31,59,90,120,151,181,212,243,273,304,334};
		int[] il0 = {0,31,60,91,121,152,182,213,244,274,305,335};
		if(yy%400==0||yy%4==0&&yy%100!=0)
		{
			for(i=1;i<=12;i++)
			{
				int mw = (ww+il0[i-1]-1)%7;
				System.out.printf("%s 1, %d is %s\n",m[i-1],yy,d[mw]);
			}
		}
		else {
			for(i=1;i<=12;i++)
			{
				int mw = (ww+nl0[i-1])%7;
				System.out.printf("%s 1, %d is %s\n",m[i-1],yy,d[mw]);
			}
		}
		
		//5.29
		System.out.print("Enter year and day of week:");
		yy = input.nextInt();
		ww = input.nextInt();
		int[] nl = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] il = {31,29,31,30,31,30,31,31,30,31,30,31};
		if(yy%400==0||yy%4==0&&yy%100!=0)
		{
			for(i=1;i<=12;i++)
			{
				System.out.printf("\t\t\t%s%d\t\t\t\t\n",m[i-1],yy);
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
				count=0;
				for(j =0;j<il[i-1];j++)
				{
					int mw = (ww+j)%7;
					if(j==0)switch (mw)
					{
					case 0:
						System.out.print(j+1+"\t");
						count=mw+1;
						break;
					case 1:
						System.out.print("\t"+(j+1)+"\t");
						count=mw+1;
						break;
					case 2:
						System.out.print("\t\t"+(j+1)+"\t");
						count=mw+1;
						break;
					case 3:
						System.out.print("\t\t\t"+(j+1)+"\t");
						count=mw+1;
						break;
					case 4:
						System.out.print("\t\t\t\t"+(j+1)+"\t");
						count=mw+1;
						break;
					case 5:
						System.out.print("\t\t\t\t\t"+(j+1)+"\t");
						count=mw+1;
						break;
					case 6:
						System.out.print("\t\t\t\t\t\t"+(j+1)+"\t");
						count=mw+1;
						break;
					}
					else
					{
						System.out.print((j+1)+"\t");
						count++;
						if(j==il[i-1]-1)
							ww=mw+1;
					}
					if(count==7)
					{
						System.out.print("\n");
						count=0;
					}
				}
				System.out.print("\n");
			}
		}
		else
		{
			for(i=1;i<=12;i++)
			{
					System.out.printf("\t\t\t%s%d\t\t\t\t\n",m[i-1],yy);
					System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
					System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
					count=0;
					for(j =0;j<nl[i-1];j++)
					{
						int mw = (ww+j)%7;
						if(j==0)switch (mw)
						{
						case 0:
							System.out.print(j+1+"\t");
							count=mw+1;
							break;
						case 1:
							System.out.print("\t"+(j+1)+"\t");
							count=mw+1;
							break;
						case 2:
							System.out.print("\t\t"+(j+1)+"\t");
							count=mw+1;
							break;
						case 3:
							System.out.print("\t\t\t"+(j+1)+"\t");
							count=mw+1;
							break;
						case 4:
							System.out.print("\t\t\t\t"+(j+1)+"\t");
							count=mw+1;
							break;
						case 5:
							System.out.print("\t\t\t\t\t"+(j+1)+"\t");
							count=mw+1;
							break;
						case 6:
							System.out.print("\t\t\t\t\t\t"+(j+1)+"\t");
							count=mw+1;
							break;
						}
						else
						{
							System.out.print((j+1)+"\t");
							count++;
							if(j==nl[i-1]-1)
								ww=mw+1;
						}
						if(count==7)
						{
							System.out.print("\n");
							count=0;
						}
					}
					System.out.print("\n");
			}
		}
		
		//5.32
		int a=0,b=0;
		while(a==b)
		{
			a = (int)(10*Math.random());
			b = (int)(10*Math.random());
		}
		System.out.print("lottery: ");
		System.out.println(10*a+b);
		
		//5.33
		System.out.print("Perfect number:");
		for(i=1;i<=10000;i++)
		{
			count=0;
			for(j=1;j<i;j++)
			{
				if(i%j==0&&i!=j)
					count+=j;
			}
			if(count==i)
				System.out.println(i);
		}
		
		//5.34
		int[] flag = new int[2];
		while(flag[1]<2&&flag[0]<2)
		{
			a = (int)(3*Math.random());
			System.out.print("scissor(0),rock(1),paper(2): ");
			b = input.nextInt();
			if(a==0)
			{
				switch(b)
				{
				case 0:
					System.out.println("The computer is scissor.You are scissor too. It is a draw");
					break;
				case 1:
					System.out.println("The computer is scissor.You are rock. You win");
					flag[1]++;
					break;
				case 2:
					System.out.println("The computer is scissor.You are paper. You lose");
					flag[0]++;
					break;
				}
			}
			else if(a==1)
			{
				switch(b)
				{
				case 0:
					System.out.println("The computer is rock.You are scissor. You lose");
					flag[0]++;
					break;
				case 1:
					System.out.println("The computer is rock.You are rock too. It is a draw");
					break;
				case 2:
					System.out.println("The computer is rock.You are paper. You win");
					flag[1]++;
					break;
				}
			}
			else if(a==2)
			{
				switch(b)
				{
				case 0:
					System.out.println("The computer is paper.You are scissor.You win");
					flag[1]++;
					break;
				case 1:
					System.out.println("The computer is paper.You are rock. You lose");
					flag[0]++;
					break;
				case 2:
					System.out.println("The computer is paper.You are paper too. It is a draw");
					break;
				}
			}
			else
			{
				System.out.println("Wrong input!");
				return;
			}
		}
		if(flag[1]==2)
			System.out.println("You win!");
		else
			System.out.println("You lose!");
		
		//5.36
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int num = input.nextInt();
		String cnum = String.valueOf(num);
		int d0=0;
		char rd0='X';
		for(i =9;i>0;i--)
		{
			d0+=(num%10)*i;
			num/=10;
		}
		d0%=11;
		System.out.print("The ISBN-10 number is ");
		if(num!=0)
			if (d0==10)
				System.out.println(cnum+rd0);
			else
				System.out.println(cnum+d0);
		else
			if (d0==10)
				System.out.println('0'+cnum+rd0);
			else
				System.out.println('0'+cnum+d0);
		
		//5.37
		System.out.print("Enter a number(10):");
		n = input.nextInt();
		int[] y1= new int[100];
		int count1=0;
		while(n!=0)
		{
			y1[count1] = n%2;
			n/=2;
			count1++;
		}
		System.out.print("Get a number(2):");
		for(count1=count1-1;count1>=0;count1--)
			System.out.print(y1[count1]);
		
		//5.38
		System.out.print("Enter a number(10):");
		n = input.nextInt();
		int[] y2= new int[100];
		int count2=0;
		while(n!=0)
		{
			y2[count2] = n%8;
			n/=8;
			count2++;
		}
		System.out.print("Get a number(8):");
		for(count2=count2-1;count2>=0;count2--)
			System.out.print(y2[count2]);
		
		//5.45
		System.out.print("Ener 10 numbers: ");
		double sum=0,sssum=0;
		for(i =0;i<10;i++)
		{
			double a1 = input.nextDouble();
			sum+=a1;
			sssum+=a1*a1;
		}
		double ave = sum/10,sd = Math.sqrt((sssum-(sum*sum/10))/9);
		System.out.print("The mean is "+ave+"\nThe standard deviation is "+sd);
	}
}
