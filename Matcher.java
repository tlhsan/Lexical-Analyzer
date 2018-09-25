package taruha_sama;


public class Matcher {
	String[] keywords = {"int", "float","String", "if","else"};
	String varName = "[a-z]*";
	String dgt = "(\\d+(\\.\\d+)?)";
	String op = "(=|-|\\+)";
	String gaps = "\\s+";
	String [] others = {"!","$","%","^","&","*","(",")","_","|","~","-","`","{","}","<","\" ,",";","'","<",">","?",",",".","/",";","[","]","+","if","else"};         
	String takeback ="";
	
	public String checkK(String s) {
		
		for(int i=0; i<keywords.length;i++) {
			if(s.equals(keywords[i])){
				return s;
			}
		}
		return "no";
	}
			
	public String checkV(String s) {

		if(s.matches(varName)) {
			
			return s;
		}
		return "no";
	}
	
	public String checkD(String s) {
		if(s.matches(dgt)) {
			return s;
		}
		return "no";
	}
	public String checkOp(String s) {
		if(s.matches(op)) {
			return s;
		}
		return "no";
	}
	public String checkGaps(String s) {
		if(s.matches(gaps)) {
			return s;
		}
		return "no";
	}
     public String checkOthers(String s) {
		
		for(int i=0; i<others.length;i++) {
			if(s.equals(others[i])){
				return s;
			}
		}
		return "no";
	}
    public String checkEnd(String s) {
    	
    	String[] special = {";",",","{","}","[","]"};
    	String sp = "";
    	
    	for(int i=0; i<special.length; i++) {
    		if(s.contains(special[i])) {
    			sp = special[i];
    			//System.out.println("the special is now:" + sp);
    			s = s.replace(special[i],"");
    			//System.out.println("the word is now:" + s);
    			takeback =s;
    		}
    		
    		
    		
    		
    	}
    	return sp;
    	
    	
    }
    public String reTake() {
    	return takeback;
    }

}

		
	
		
		
		
			
			
		
		
	
	
	

