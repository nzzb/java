import java.util.Scanner;
import java.util.Random;
public class eight {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//8.4
		int [][] time=new int[8][7],sum=new int[2][8];
		int i,j,t;
		System.out.println("输入工作时数：");
		for(i=0;i<8;i++)
			for(j=0;j<7;j++)
				time[i][j]=input.nextInt();
		for(i=0;i<8;i++)
		{
			sum[0][i]=i;
			sum[1][i]=0;
			for(j=0;j<7;j++)
				sum[1][i]+=time[i][j];
			//System.out.print(sum[1][i]);
			//System.out.print(" ");
		}
		System.out.println("");
		for(i=0;i<8;i++)
			for(j=i;j<8;j++)
				if(sum[1][i]<sum[1][j])
				{
					t=sum[1][i];
					sum[1][i]=sum[1][j];
					sum[1][j]=t;
					t=sum[0][i];
					sum[0][i]=sum[0][j];
					sum[0][j]=t;
				}
		for(i=0;i<8;i++)
			System.out.printf("Employee %d: %d\n",i,sum[1][i]);
/*输入2 4 3 4 5 8 8
7 3 4 3 3 4 4
3 3 4 3 3 2 2
9 3 4 7 3 4 1
3 5 4 3 6 3 8
3 4 4 6 3 4 4
3 7 4 8 3 8 4
6 3 5 9 2 7 9*/
		
		//8.6
		double[][] a=new double[3][3],b=new double[3][3],c=new double[3][3];
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				a[i][j]=input.nextDouble();
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				b[i][j]=input.nextDouble();
		c=multiplyMatrix(a,b);
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.printf("%.1f ",a[i][j]);
			if(i!=1)
				System.out.printf("       ");
			else
				System.out.printf("   *   ");
			for(j=0;j<3;j++)
				System.out.printf("%.1f ",b[i][j]);
			if(i!=1)
				System.out.printf("       ");
			else
				System.out.printf("   =   ");
			for(j=0;j<3;j++)
				System.out.printf("%.1f ",c[i][j]);
			System.out.println("");
		}
/*输入1 2 3 4 5 6 7 8 9
0 2 4 1 4.5 2.2 1.1 4.3 5.2*/
		
		//8.8
		

		//8.9
		String[][] chessboard=new String[3][4],pieces=new String[3][4];
		boolean flag=true;
		char win;
		int f,end,x,y,game=0;
		for(i=0;i<3;i++)
			for(j=0;j<4;j++)
			{
				chessboard[i][j]="|";
				pieces[i][j]=" ";
			}
		System.out.printf("……………………………………\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.printf("%s ",chessboard[i][j]);
				System.out.printf("%s ",pieces[i][j]);
			}
			System.out.printf("\n……………………………………\n");
		}
		while(flag)
		{
			game++;
			if(game%2!=0)
			{
				System.out.print("Enter a row (0, 1, or 2)for player X:");
				x=input.nextInt();
				System.out.print("Enter a column (0, 1, or 2)for player X:");
				y=input.nextInt();
				pieces[x][y]="X";
			}
			else
			{
				System.out.print("Enter a row (0, 1, or 2)for player O:");
				x=input.nextInt();
				System.out.print("Enter a column (0, 1, or 2)for player O:");
				y=input.nextInt();
				pieces[x][y]="O";
			}
			System.out.printf("……………………………………\n");
			for(i=0;i<3;i++)
			{
				for(j=0;j<4;j++)
				{
					System.out.printf("%s ",chessboard[i][j]);
					System.out.printf("%s ",pieces[i][j]);
				}
				System.out.printf("\n……………………………………\n");
			}
			for(i=0;i<3;i++)
			{
				t=0;
				f=0;
				for(j=0;j<3;j++)
					if(pieces[i][j]=="X")
						t++;
					else if(pieces[i][j]=="O")
						f++;
				if(t==3)
				{
					flag=false;
					win='X';
					System.out.printf("%c player won!",win);
					break;
				}
				else if(f==3)
				{
					flag=false;
					win='O';
					System.out.printf("%c player won!",win);
					break;
				}
			}
			for(i=0;i<3;i++)
			{
				t=0;
				f=0;
				for(j=0;j<3;j++)
					if(pieces[j][i]=="X")
						t++;
					else if(pieces[j][i]=="O")
						f++;
				if(t==3)
				{
					flag=false;
					win='X';
					System.out.printf("%c player won!",win);
					break;
				}
				else if(f==3)
				{
					flag=false;
					win='O';
					System.out.printf("%c player won!",win);
					break;
				}
			}
			t=0;
			f=0;
			for(i=0;i<3;i++)
			{
				if(pieces[i][i]=="X")
					t++;
				else if(pieces[i][i]=="O")
					f++;
				if(t==3)
				{
					flag=false;
					win='X';
					System.out.printf("%c player won!",win);
					break;
				}
				else if(f==3)
				{
					flag=false;
					win='O';
					System.out.printf("%c player won!",win);
					break;
				}
			}
			t=0;
			f=0;
			for(i=0;i<3;i++)
			{
				if(pieces[i][2-i]=="X")
					t++;
				else if(pieces[i][2-i]=="O")
					f++;
				if(t==3)
				{
					flag=false;
					win='X';
					System.out.printf("%c player won!",win);
					break;
				}
				else if(f==3)
				{
					flag=false;
					win='O';
					System.out.printf("%c player won!",win);
					break;
				}
			}
			end=0;
			for(i=0;i<3;i++)
				for(j=0;j<4;j++)
					if(pieces[i][j]!=" ")
						end++;
			if(end==9)
			{
				flag=false;
				System.out.printf("No winner!\n");
				break;
			}
		}
	}
	
	//8.6
	public static double[][] multiplyMatrix(double[][] a,double[][] b)
	{
		double[][] c=new double[3][3];
		int i,j;
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				c[i][j]=a[i][1]*b[1][j]+a[i][2]*b[2][j]+a[i][0]*b[0][j];
		return c;
	}
}
