import java.util.Scanner;
public class sapxepmang {
	public static  Scanner a= new Scanner(System.in);
	public static void main(String[] args) {
	
		int x;
		x=a.nextInt();
		int[] n = new int [x];
		for(int i=0;i<x;i++)
		{
			nhap(n,i);
		}
		TangDan(n,x);
		for(int i=0;i<x;i++)
		{
			xuat(n,i);
		}
		
		a.close();
	}
	public static void nhap(int n[],int i)
	{
		n[i]=a.nextInt();
		
	}
	public static void xuat(int  n[], int i)
	{
		System.out.print(n[i]);
	}
	public static void TangDan(int n[],int x)
		{
		    int tg;
		    for(int i = 0; i < x - 1; i++)
		    {
		        for(int j = i + 1; j < x; j++)
		        {
		            if(n[i] > n[j])
		            {
		                tg = n[i];
		                n[i] = n[j];
		                n[j] = tg;        
		            }
		        }
		    }
		}

	}

