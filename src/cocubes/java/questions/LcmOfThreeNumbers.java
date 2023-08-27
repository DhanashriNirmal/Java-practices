package cocubes.java.questions;

import java.util.Scanner;

public class LcmOfThreeNumbers {
	Scanner s= new Scanner(System.in);
	int a1,b1,c1;
//	int g,p,i;
//	System.out.println("Enter the value of a,b,c:");
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	p=a*b*c;
	g=a>b&&a>c?a: Math.max(b, c);
	for(i=g;i<=p;i=i+g){
	if(i%a1==0 &&i%b1==0 && i%c1==0){
	break;
	}
	}
	System.out.println(i);
	s.close(); }

}
