//Java����������������ݽṹ��һ��������
import java.util.Scanner;
public class onetow {
	public static void main(String[] args){
	//����
	//�����嵥2-1
		double radius;
		double area;
	//�����嵥2-2
		Scanner input = new Scanner(System.in);
	//�����嵥2-3
		double number1,number2,number3;
		double average;
	//�����嵥2-4
		final double PI=3.14159;
	//�����嵥2-5
		int seconds;
		int minutes;
		int remainingSeconds;
	//�����嵥2-6
		double fahrenheit;
		double celsius;
		
	//�����嵥1-1
		System.out.println("Welcome to Java!");
	//�����嵥1-2
		System.out.println("Programming is fun!");
		System.out.println("Fundamentals First");
		System.out.println("Problem Driven");
	//�����嵥1-3
		System.out.print("(10.5+2*3)/(45-3.5)=");
		System.out.println((10.5+2*3)/(45-3.5));
	//�����嵥1-6 �������¶�ת��Ϊ�����¶�
		System.out.print("Celsius 35 is Fahrenheit degree ");
		System.out.println((9.0/5)*35+32);
	//�����嵥2-1 Բ�����
		radius = 20;
		area = radius*radius*3.14159;
		System.out.println("The area for the circle of radius "+radius+" is "+area);
	//�����嵥2-2 Բ�����
		System.out.println("please enter your radius:");
		radius = input.nextDouble();
		area = radius * radius * 3.14159;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
	//�����嵥2-3 ƽ����
        System.out.println("Enter three numbers: ");
        number1=input.nextDouble();
        number2=input.nextDouble();
        number3=input.nextDouble();
        average=(number1+number2+number3)/3;
        System.out.println("The average of "+number1+" "+number2+" "+number3+" is "+average);
    //�����嵥2-4 Բ�����
        System.out.println("Enter a number for radius:");
		radius = input.nextDouble();
		area = radius * radius * PI;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    //�����嵥2-5 ��ת��Ϊ����
        System.out.println("Enter an integer for seconds: ");
        seconds=input.nextInt();
        minutes=seconds/60;
        remainingSeconds=seconds%60;
        System.out.println(seconds+" seconds is "+minutes+" minutes and "+remainingSeconds+" seconds");
    //�����嵥2-6 �������¶�ת��Ϊ�����¶�
        System.out.println("Enter a degree in Fahrenheit: ");
        fahrenheit=input.nextDouble();
        celsius=(5.0/9)*(fahrenheit-32);
        System.out.println("Fahrenheit "+fahrenheit+" is "+celsius+" in Celsius");
    //�����嵥2-7 ��ȡ��ǰʱ��
        long totalMilliseconds = System.currentTimeMillis();//��ȡ1970.1.1�����ڵ��ܺ�����
        long totalSeconds = totalMilliseconds/1000;//�õ�1970.1.1�����ڵ�������
        long currentSecond = totalSeconds%60;//�õ���ǰ������
        long totalMinutes = totalSeconds/60;//�õ�1970.1.1�����ڵ��ܷ�����
        long currentMinute = totalMinutes%60;//�õ���ǰ�ķ�����
        long totalHours = totalMinutes/60;//�õ�1970.1.1�����ڵ���Сʱ��
        long currentHour = totalHours%24;//�õ���ǰ��Сʱ��
        System.out.println("Current time is "+currentHour+":"+currentMinute+":"+currentSecond+" GMT");//GMT�������α�׼ʱ��
    //�����嵥2-8 ����Ӫҵ˰ֵ
        System.out.println("Enter purchase amount: ");
        double purchaseAmout=input.nextDouble();
        double tax=purchaseAmout*0.06;
        System.out.println("Sales tax is $"+(int)(tax*100)/100.0);
    //�����嵥2-9 ������֧����Ⱥ���֧�����
        System.out.println("Enter annual interest rate,e.g.,7.25: ");
        double interestRate = input.nextDouble();//�õ�����
        System.out.println("Enter number of years as an integer,e.g.,5: ");
        double paymentOfYear = input.nextDouble();//�õ�֧�����
        System.out.println("Enter loan amount,e.g.,120000.95: ");
        double loanLimit = input.nextDouble();//�õ�������
        double monthlyPayment = loanLimit*(interestRate/1200)/(1-(1/Math.pow(1+interestRate/1200,paymentOfYear*12)));
        double totalPayment = monthlyPayment*12*paymentOfYear;
        System.out.println("The monthly payment is $"+ (int)(monthlyPayment*100)/100.0 + " the total payment is $" + (int)(totalPayment*100)/100.0);
    //�����嵥2-10 ��Ǯ����
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
