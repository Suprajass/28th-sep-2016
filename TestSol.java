import java.io.*;
import java.util.*;
public class TestSol {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		Solut s=new Solut();
		int count=s.countLeapYear(a,b);
		System.out.println(count);
	
	}
}
