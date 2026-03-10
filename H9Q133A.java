package Solutions;
import java.util.*;
public class H9Q133A {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		String result= "NO";
		String a= read.nextLine();
		for(char i: a.toCharArray()) {
			if (i=='H'||i=='9'||i=='Q') {
				result="YES";
			}
		}
		System.out.println(result);
	}
}
