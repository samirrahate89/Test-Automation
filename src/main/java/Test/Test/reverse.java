package Test.Test;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "This is my Java Program";
		String reverse="";
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			reverse=ch+reverse;
		}
		
		System.out.println("Reversed String is :"+ reverse);
	}

}
