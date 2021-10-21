//第三章编程练习
import java.util.Random;
import java.util.Scanner;
public class three {
	public static void main(String[] args){
		//3.4
	    long randomNum = System.currentTimeMillis();  
	    int ran = (int) (randomNum%12);
	    String[] s= new String[]{"December","January","February","March","April","May","June","July","August","September","October","November"};
		System.out.println(s[ran-1]);
		
		//3.9
		Scanner input = new Scanner(System.in);
		int number=input.nextInt();
		int i;
		int list[]=new int[10];
		list[9]=0;
		for(i=8;i>=0;i--)
		{
			list[i]=number%10;
			number/=10;
			list[9]=list[i]*(i+1)+list[9];
		}
		list[9]%=11;
		System.out.print("The ISBN-10 number is ");
		for(i=0;i<9;i++)
			System.out.print(list[i]);
		if(list[9]==10)
			System.out.println("X");
		else
			System.out.println(list[9]);
		
		//3.15
		long r = System.currentTimeMillis();  
	    int lottery = (int) (r%1000), lo[]=new int[3], ulo[]=new int[3], t;
	    int userlottery=input.nextInt();
	    System.out.print("");
	    for(i=0;i<3;i++)
	    {
	    	lo[i]=lottery%10;
	    	lottery/=10;
	    	ulo[i]=userlottery%10;
	    	userlottery/=10;
	    }
	    if(lottery==userlottery)
	    	System.out.print("用户赢得奖金10000美元");
    	t=0;
	    for(i=0;i<3;i++)
	    {
	    	if(ulo[i]==lo[0])
	    		t++;
	    	else if(ulo[i]==lo[1])
	    		t++;
	    	else if(ulo[i]==lo[2])
	    		t++;
	    }
	    if(t>=3)
	    	System.out.print("用户赢得奖金3000美元");
	    if(t==2)
	    	System.out.print("用户赢得奖金2000美元");
	    if(t==1)
	    	System.out.print("用户赢得奖金1000美元");
	    
	    //3.19
	    int a,b,c;
		a= input.nextInt();
		b = input.nextInt();
		c= input.nextInt();
		if (a+b>c||a+c>b||b+c>a)
			System.out.println(a+b+c);
		else
			System.out.println("illegal input!");
	    
	    //3.21
		System.out.print("Enter year:(e.g.,20212): ");
		int year = input.nextInt();
		System.out.print("Enter month:1-12: ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month:1-31: ");
		int day = input.nextInt();
		System.out.print("Day of the week is ");
		int mo=month;
		if (month==1||month==2)
		{
			mo+=12;
			year-=1;
		}
		int j=year/100, k=year%100;
		int h = (day+26*(mo+1)/10+k+k/4+j/4+5*j)%7;
		switch (h)
		{
			case 0:
				System.out.println("Sunday!");
				break;
			case 1:
				System.out.println("Monday!");
				break;
			case 2:
				System.out.println("Tuesday!");
				break;
			case 3:
				System.out.println("Wendesday!");
				break;
			case 4:
				System.out.println("Tursday!");
				break;
			case 5:
				System.out.println("Friday!");
				break;
			case 6:
				System.out.println("Saturday!");
				break;
		}
		
		//3.22
		int x,y;
		System.out.println("Enter a point with two coordinates: ");
		x = input.nextInt();
		y = input.nextInt();
		if (x*x+y*y<100)
			System.out.print("Point ("+x+", "+y+") is in the circle");
		else
			System.out.print("Point ("+x+", "+y+") is not in the circle");
		
		//3.23
		System.out.println("Enter a point with two coordinates: ");
		x= input.nextInt();
		y= input.nextInt();
		if(x<5&&x>-5&&y<2.5&&y>-2.5)
			System.out.print("Point ("+x+", "+y+") is in the rectangle");
		else
			System.out.print("Point ("+x+", "+y+") is not in the rectangle");
		
		//3.24
		String str[] = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String st[] = {"Clubs","Diamonds","Hearts","Spades"};
		int num1,num2;
		num1 = (int)(13*Math.random());
		num2 = (int)(4*Math.random());
		System.out.println("The card you picked is "+str[num1]+" of "+st[num2]);
		
		//3.27
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x27 = input.nextDouble();
		double y27 = input.nextDouble();
		if(x27>0 && y27>0 && (0.5*x27+y27-100)<0)
			System.out.print("The point is in the triangle");
		else
			System.out.print("The point is not in the triangle");
		
		//3.28
		System.out.print("Enter r1's center x-,y-coordinates,width,and height: ");
		float x1=input.nextFloat(),y1=input.nextFloat(),w1=input.nextFloat(),h1=input.nextFloat();
		System.out.print("Enter r2's center x-,y-coordinates,width,and height: ");
		float x2=input.nextFloat(),y2=input.nextFloat(),w2 = input.nextFloat(),h2 = input.nextFloat();
		float X[] = {x2+w2/2,x2-w2/2},Y[]={y2+h2/2,y2-h2/2};
		int flag=0;
		for(i=0;i<2;i++)
		{
			boolean a28 = X[i]>=(x1-w1/2)&&X[i]<=(x1+w1/2);
			for(j=0;j<2;j++)
			{
				boolean b28 = Y[j]>=(y1-h1/2)&&Y[j]<=(y1+h1/2);
				if(a28&&b28)
					flag+=1;
			}
		}
		if(flag==0)
			System.out.print("r2 does not overlap r1");
		else if (flag==4)
			System.out.print("r2 is inside r1");
		else
			System.out.print("r2 overlaps r1");
		
		//3.29
		System.out.print("Enter circle1's center x-,y-coordinates,and radius: ");
		x1= input.nextFloat();
		y1=input.nextFloat();
		float r1=input.nextFloat();
		System.out.print("Enter circle1's center x-,y-coordinates,and radius: ");
		x2= input.nextFloat();
		y2=input.nextFloat();
		float r2=input.nextFloat();
		
		float d1= (float) Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		float d2 = Math.abs(r1-r2),d3 =r1+r2;
		
		if (d1<=d2)
			System.out.println("circle2 is inside circle1");
		else if(d1<=d3)
			System.out.println("circle2 overlap circle1");
		else
			System.out.println("circle2 does not overlap circle1");
		
	}
}