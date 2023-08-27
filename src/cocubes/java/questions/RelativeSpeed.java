package cocubes.java.questions;

public class RelativeSpeed {
	int relativespeed(int dir,int d1,int s1,int d2,int s2)
	{
		int time;
		int t1=d1/s1;
		int t2=d2/s2;
		if(dir==0)
		{
			 time=t1+t2;
			
		}
		else
		{
			 time=t1-t2;
		}
		System.out.println(time);
		return time;
	}
	public static void main(String[] args) {
		RelativeSpeed rt=new RelativeSpeed();
		rt.relativespeed(0, 30, 5, 20, 10);
		

	}

}
