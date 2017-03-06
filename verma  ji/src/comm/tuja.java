package comm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class tuja {
 
 
public static void main (String args[]) throws InterruptedException

{
 FirefoxDriver d=new FirefoxDriver();
 d.get("https://www.google.com/intl/en/mail/help/about.html");
 Thread.sleep(2000);
 d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 d.findElement(By.id("gmail-create-account")).click();
 d.findElement(By.id("FirstName")).sendKeys("tanvi");
 d.findElement(By.id("LastName")).sendKeys("Ojha");
 d.findElement(By.id("GmailAddress")).sendKeys("tanviojha");
 //d.findElement(By.id("username-suggestions"));
 
 // for(i=0;i=2;i++)
 //{
  //if(i==1)
   //System.out.println("tanviojha38");
  //else
  //{
   //System.out.println("tanviojha9");
  //}
 //}
 //d.findElement(By.linkText("tanviojha38")).click();
 d.findElement(By.id("Passwd")).sendKeys("Tanvi12345");
 d.findElement(By.id("PasswdAgain")).sendKeys("Tanvi12345");
 d.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]")).click();
 Thread.sleep(3000);
WebElement ww=d.findElement(By.xpath("(//span[@id='BirthMonth']/div[2]/div/div)[2]"));
Thread.sleep(1000);
ww.click();
System.out.println(ww);
 //d.findElement(By.className("goog-inline-block goog-flat-menu-button jfk-select goog-flat-menu-button-focused"));
 d.findElement(By.id("BirthDay")).sendKeys("16");
 d.findElement(By.id("BirthYear")).sendKeys("1992");
 //d.findElement(By.className("goog-inline-block goog-flat-menu-button jfk-select goog-flat-menu-button-focused"));
 d.findElement(By.id("RecoveryPhoneNumber")).sendKeys("7042097728");
 d.findElement(By.id("RecoveryEmailAddress")).sendKeys("tanuja14709high@gmail.com");
 d.findElement(By.id("submitbutton")).click();
 
 
 
}
}