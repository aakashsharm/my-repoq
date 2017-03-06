package Myutility;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.Verify;
import com.sun.jna.platform.unix.X11.Screen;

import junit.framework.Assert;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("JAVA");
		System.out.println(""+s);
		
		 String s1 = new String("JAVA");
		 String s2="JAVA";
		
		 if(s1.hashCode()==s2.hashCode())
	        System.out.println(s1+"matched"); 
		 else
			 System.out.println("not");//Output : JAVA
	 
	}
}
