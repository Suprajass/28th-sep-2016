import java.io.*;
import java.util.*;
public class TestSolution1 {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		Solution1 s=new Solution1();
		if(a>=0&&b>=0)
		{
					boolean b1=s.sameLast(a,b);
					System.out.println(b1);
		}
		
	}
}

