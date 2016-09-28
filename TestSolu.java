import java.io.*;
import java.util.*;
public class TestSolu {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		Solu s=new Solu();
		int sum=s.sumInt(a,b);
		System.out.println(sum);
	
	}
}
