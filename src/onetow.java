//Java语音程序设计与数据结构第一二章例题
import java.util.Scanner;
public class onetow {
	public static void main(String[] args){
	//定义
	//程序清单2-1
		double radius;
		double area;
	//程序清单2-2
		Scanner input = new Scanner(System.in);
	//程序清单2-3
		double number1,number2,number3;
		double average;
	//程序清单2-4
		final double PI=3.14159;
	//程序清单2-5
		int seconds;
		int minutes;
		int remainingSeconds;
	//程序清单2-6
		double fahrenheit;
		double celsius;
		
	//程序清单1-1
		System.out.println("Welcome to Java!");
	//程序清单1-2
		System.out.println("Programming is fun!");
		System.out.println("Fundamentals First");
		System.out.println("Problem Driven");
	//程序清单1-3
		System.out.print("(10.5+2*3)/(45-3.5)=");
		System.out.println((10.5+2*3)/(45-3.5));
	//程序清单1-6 将摄氏温度转换为华氏温度
		System.out.print("Celsius 35 is Fahrenheit degree ");
		System.out.println((9.0/5)*35+32);
	//程序清单2-1 圆的面积
		radius = 20;
		area = radius*radius*3.14159;
		System.out.println("The area for the circle of radius "+radius+" is "+area);
	//程序清单2-2 圆的面积
		System.out.println("please enter your radius:");
		radius = input.nextDouble();
		area = radius * radius * 3.14159;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
	//程序清单2-3 平均数
        System.out.println("Enter three numbers: ");
        number1=input.nextDouble();
        number2=input.nextDouble();
        number3=input.nextDouble();
        average=(number1+number2+number3)/3;
        System.out.println("The average of "+number1+" "+number2+" "+number3+" is "+average);
    //程序清单2-4 圆的面积
        System.out.println("Enter a number for radius:");
		radius = input.nextDouble();
		area = radius * radius * PI;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    //程序清单2-5 秒转换为分秒
        System.out.println("Enter an integer for seconds: ");
        seconds=input.nextInt();
        minutes=seconds/60;
        remainingSeconds=seconds%60;
        System.out.println(seconds+" seconds is "+minutes+" minutes and "+remainingSeconds+" seconds");
    //程序清单2-6 将华氏温度转换为摄氏温度
        System.out.println("Enter a degree in Fahrenheit: ");
        fahrenheit=input.nextDouble();
        celsius=(5.0/9)*(fahrenheit-32);
        System.out.println("Fahrenheit "+fahrenheit+" is "+celsius+" in Celsius");
    //程序清单2-7 获取当前时间
        long totalMilliseconds = System.currentTimeMillis();//获取1970.1.1到现在的总毫秒数
        long totalSeconds = totalMilliseconds/1000;//得到1970.1.1到现在的总秒数
        long currentSecond = totalSeconds%60;//得到当前的秒数
        long totalMinutes = totalSeconds/60;//得到1970.1.1到现在的总分钟数
        long currentMinute = totalMinutes%60;//得到当前的分钟数
        long totalHours = totalMinutes/60;//得到1970.1.1到现在的总小时数
        long currentHour = totalHours%24;//得到当前的小时数
        System.out.println("Current time is "+currentHour+":"+currentMinute+":"+currentSecond+" GMT");//GMT格林尼治标准时间
    //程序清单2-8 计算营业税值
        System.out.println("Enter purchase amount: ");
        double purchaseAmout=input.nextDouble();
        double tax=purchaseAmout*0.06;
        System.out.println("Sales tax is $"+(int)(tax*100)/100.0);
    //程序清单2-9 计算月支付额度和总支付额度
        System.out.println("Enter annual interest rate,e.g.,7.25: ");
        double interestRate = input.nextDouble();//得到利率
        System.out.println("Enter number of years as an integer,e.g.,5: ");
        double paymentOfYear = input.nextDouble();//得到支付年度
        System.out.println("Enter loan amount,e.g.,120000.95: ");
        double loanLimit = input.nextDouble();//得到贷款额度
        double monthlyPayment = loanLimit*(interestRate/1200)/(1-(1/Math.pow(1+interestRate/1200,paymentOfYear*12)));
        double totalPayment = monthlyPayment*12*paymentOfYear;
        System.out.println("The monthly payment is $"+ (int)(monthlyPayment*100)/100.0 + " the total payment is $" + (int)(totalPayment*100)/100.0);
    //程序清单2-10 整钱兑零
        System.out.println("Enter an amount in double,for example 11.56: ");
        double amount=input.nextDouble();
        int remainingAmout=(int)(amount*100);
        int numberOfOneDollars=remainingAmout/100;
        remainingAmout=remainingAmout%100;
        int numberOfQuarters=remainingAmout/25;
        remainingAmout=remainingAmout%25;
        int numberOfDimes=remainingAmout/10;
        remainingAmout=remainingAmout%10;
        int numberOfNickels=remainingAmout/5;
        remainingAmout=remainingAmout%5;
        int numberOfPennies=remainingAmout;
        System.out.println("Your amount "+amount+" consists of");
        System.out.println(" "+numberOfOneDollars+" dollars");
        System.out.println(" "+numberOfQuarters+" quarters");
        System.out.println(" "+numberOfDimes+" dimes");
        System.out.println(" "+numberOfNickels+" nickels");
        System.out.println(" "+numberOfPennies+" pennies");
        
        System.out.print("end");
	}
}
