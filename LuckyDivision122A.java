package Solutions;
import java.util.*;
public class LuckyDivision122A {

	public static void main(String[] args) {
		int c=0;
		int[] luckynumbers= new int[500];
		for(int i=0;i<500;i++) {
			String a=i+"";
			if (!a.contains("0")&&!a.contains("1")&&!a.contains("2")&&!a.contains("3")&&!a.contains("5")&&!a.contains("6")&&!a.contains("8")&&!a.contains("9"))  {
				luckynumbers[c]=i;
				c++;
			}
		}
		Scanner read=new Scanner(System.in);
		int d=read.nextInt();
		boolean b=false;
		for (int i:luckynumbers) {
			if (i!=0&&i!=1) {
			if (d%i==0) {
				b=true;
			}
			}
		}
		if (!b) {
			System.out.println("NO");
			
		}
		else {
			System.out.println("YES");
		}
	
	}

}

