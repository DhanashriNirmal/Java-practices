package cocubes.java.questions;

public class SumNumbersDivisible {
	int sumNumbersDivisible1(int m,int n)
	{
		int sum=0;
		for(int i=m;i<=n;i++)
		{
			if(i%5==0 && i%3==0)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		
		
		SumNumbersDivisible s=new SumNumbersDivisible ();
		s.sumNumbersDivisible1(12,50);

	}

}
