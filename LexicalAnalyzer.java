package taruha_sama;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class LexicalAnalyzer {
	private static Scanner sc;

	public static void main(String args[]) throws Throwable {

		File input = new File("input.txt");
		FileInputStream f = new FileInputStream(input);
		sc = new Scanner(f);

		//StringTokenizer st = new StringTokenizer();
		Matcher mc = new Matcher();
		Table tb = new Table();
		
		
		

		while (sc.hasNext()) {
			
			String s = sc.next();
			//System.out.println(s);
			
			
			if (s.equals(mc.checkK(s))) {

				tb.addK(s);
				continue;

			}
			if (s.equals(mc.checkV(s))) {
				

				tb.addV(s);
				continue;
				

			}
			if (s.equals(mc.checkD(s))) {

				tb.addD(s);
				continue;

			}
			if (s.equals(mc.checkOp(s))) {

				tb.addOp(s);
				continue;

			}
			if (s.equals(mc.checkGaps(s))) {

				tb.addGaps(s);
				continue;

			}
			if (s.equals(mc.checkOthers(s))) {

				tb.addOthers(s);
				continue;

			}
			else{
				String s2 = mc.checkEnd(s);
				tb.addOthers(s2);
				String s3 = mc.reTake();
				if (s3.equals(mc.checkK(s3))) {

					tb.addK(s3);
					

				}
				if (s3.equals(mc.checkV(s3))) {
					

					tb.addV(s3);
					
					

				}
				if (s3.equals(mc.checkD(s3))) {

					tb.addD(s3);
					

				}
				if (s3.equals(mc.checkOp(s3))) {

					tb.addOp(s3);
					
				}
				if (s3.equals(mc.checkGaps(s))) {

					tb.addGaps(s);
				}
					

				continue;

			}
				
		
		}
		
		tb.print(); 
		sc.close();
	}

}
