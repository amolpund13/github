package StringProgram;

public class RemoveSPAVCE {

	public static void main(String[] args) 
	{
	
		String s= "The Sun is vey bright";
		String ns=s.replaceAll("\\s","");
		System.out.println(ns);
		
		
	}
	
}
