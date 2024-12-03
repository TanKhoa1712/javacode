import java.util.Scanner;
public class In_cac_phan_tu_trung_lap {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		int[]a= new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.print("\nnhap vao phan tu thu \n"+i+" :");
		    a[i] =nhap.nextInt();
		}
		nhap.close();
		System.out.print("\n phan tu trung lap: ");
		int []b= new int [10];
		for(int i=0;i<10;i++)
		{
		    b[i] =0;
		}
		int j=0;
		while(j<10){
		int in=0;
		if(b[j]==0){
			b[j]=1;
			int tam=a[j];
			for (int i=1;i<10;i++)
			if (tam==a[i] && b[i]==0)
			{
				b[i]=1;
				in++;
			}
		}
		if(in>0){
				System.out.print(a[j]+" ");
		}
		in=0;
		j++;
		}
		
		
	}

}
