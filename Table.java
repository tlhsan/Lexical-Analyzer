package taruha_sama;
import java.util.*;


public class Table {
	LinkedHashSet <String> keyword = new LinkedHashSet<String>();
	LinkedHashSet <String> varName = new LinkedHashSet<String>();
	LinkedHashSet <String> dgt = new LinkedHashSet<String>();
	LinkedHashSet <String> op = new LinkedHashSet<String>();
	LinkedHashSet <String> gaps = new LinkedHashSet<String>();
	LinkedHashSet <String> others = new LinkedHashSet<String>();
	
	public void addK(String s) {
		keyword.add(s);
		
	}
	public void addV(String s) {
		varName.add(s);
		
	}
	public void addD(String s) {
		dgt.add(s);
		
	}
	public void addOp(String s) {
		op.add(s);
		
	}
	public void addGaps(String s) {
		gaps.add(s);
		
	}
	public void addOthers(String s) {
		others.add(s);
		
	}
	public void print() {
		System.out.print("Keywords: ");
		System.out.println(keyword);
		System.out.print("Identifiers: ");
		System.out.println(varName);
		System.out.print("Number Values: ");
		System.out.println(dgt);
		System.out.print("Math Operators: ");
		System.out.println(op);
		System.out.print("Others: ");
		System.out.println(others);
		
		
	}
	

}
