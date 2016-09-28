import java.io.*;
import java.util.*;
public class Test {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		Sol s=new Sol();
		boolean b1=s.inRange(a,b);
		System.out.println(b1);
		
	}
}

