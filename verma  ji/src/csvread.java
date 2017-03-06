import java.io.IOException;

public class csvread  {
	

	public static void main(String[] args) {
String scoreWithExtraText="Take 1: 50%";
		String actual ="You cannot take the Post-Test until 11/17/16 12:58 PMYour score will not display as 100% until you have taken the Post-Test.";
		System.out.println(actual);
		String actual1=actual.substring(0, 44).trim();

	    String actual2=actual.substring(53);
	   
	    String exp= actual1+". "+actual2; 
	    System.out.println(exp);
	}


}
