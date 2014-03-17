package newGroup.myGroup;
import static org.junit.Assert.*;

import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;


//import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	WebDriver driver;
	
/*  @Test
  
  public void assertionEpta(){
	  driver=new FirefoxDriver();
	  driver.get("http://compendiumdev.co.uk/selenium/basic_web_page.html");
	 assertTrue(driver.getTitle().equals("Basic Web Page Title"));
	 assertTrue(driver.getCurrentUrl().equals("http://compendiumdev.co.uk/selenium/basic_web_page.html"));
	 assertTrue(driver.getPageSource().contains("A paragraph of text"));
	 
	  
  }*/
  
 // 
  
 /* @Test
  
  public void assertionEpta2(){
	  driver=new FirefoxDriver();
	  driver.get("http://www.compendiumdev.co.uk/selenium/find_by_playground.php");
//	 assertTrue(driver.getTitle().equals("Basic Web Page Title"));
//	 assertTrue(driver.getCurrentUrl().equals("http://compendiumdev.co.uk/selenium/basic_web_page.html"));
//	 assertTrue(driver.getPageSource().contains("A paragraph of text"));
	
List<WebElement>ele;

ele=driver.findElements(By.tagName("a"));

Set<String>str=new HashSet<String>();

for(WebElement el : ele){
	str.add(el.getTagName());
}

  
  }
  
  */
	
	/*@Test
	public void ajaxPageTesting(){
		

		  driver=new FirefoxDriver();
		  
		  new WebDriverWait(driver, 10);
		  
		  driver.get("http://compendiumdev.co.uk/selenium/basic_ajax.html");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.cssSelector("option[value='3']")).click();
		  
		  driver.findElement(By.cssSelector("option[value='23']")).click();
		  
		  driver.findElement(By.name("submitbutton")).click();
		  
		  
		  
		
	}*/
	
	
	
	/*@Test
	public void iCloudPageTesting(String str1, String str2){
		

		  driver=new FirefoxDriver();
		  
		  driver.get("https://www.icloud.com/");
		  
		  driver.findElement(By.xpath("html/body/div[3]/div[1]/div[2]/div/div[1]/div[2]/input")).sendKeys("alb7@nm.ru");
		  
		  driver.findElement(By.xpath("html/body/div[3]/div[1]/div[2]/div/div[2]/div[2]/input")).sendKeys("Albert195804");
		  
		  driver.findElement(By.cssSelector("div[id='sc1803']")).click();
		  
		  
		
		  
		  
		
	}
	*/
	
	/*@Test
	public void htmlWebPage() throws URISyntaxException{
		

		  driver=new FirefoxDriver();
		  
		  driver.get("http://compendiumdev.co.uk/selenium/basic_html_form.html");
		  
		 WebElement ele = driver.findElement(By.cssSelector("[value='cb1']"));
		 
		 assertFalse(ele.isSelected());
		 
		 ele.click();
		 
		 assertTrue(ele.isSelected());
		 
		WebElement e1= driver.findElement(By.cssSelector("select[name='dropdown']"));
		
		WebElement el2= e1.findElement(By.cssSelector("option[value='dd1']"));
		
		el2.click();
		 
		
		
		
	//	newOne.sendKeys(file.getAbsolutePath());
		
		//input[type='file']//Users/mikhaildzarasov/Desktop/AAA/lib

		 driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td/input")).sendKeys("misha");
		 
		 WebElement multiSelected;
		 
		 multiSelected=driver.findElement(By.cssSelector("select[multiple='multiple']"));
		 
		 Select select = new Select(multiSelected);
		 
		 List<WebElement>selectedList=select.getAllSelectedOptions();
		 
		 select.selectByIndex(1);
		 select.selectByIndex(2);
		 
		 selectedList=select.getAllSelectedOptions();
		 
		 assertEquals(3, selectedList.size());		 
		 
		 
		 
		 
		// select.isMultiple();
		 
		 // List<WebElement>myList = multiSelected.findElements(By.tagName("option"));
		 
		// myList.get(0).click();
		 
		// myList.get(1).click();
		 
		// myList.get(2).click();
		 
		 
		 
		 
		 
		 driver.findElement(By.xpath("html/body/form/table/tbody/tr[9]/td/input[2]")).click();
		 
		 
		 
		 
		 
		 System.out.println(driver.findElement(By.cssSelector("[id='_valueusername']")).getText());
		 
		 
		
		  
		  
		
	}
	*/
	
	/*@Test
	public void draging(){
		  driver=new FirefoxDriver();
		
		driver.get("http://compendiumdev.co.uk/selenium/gui_user_interactions.html");
	
		WebElement dragable = driver.findElement(By.cssSelector("#draggable1"));
		
		WebElement dropable = driver.findElement(By.cssSelector("#droppable1"));
		
		Actions act = new Actions(driver);
			
		act.clickAndHold(dragable).moveToElement(dropable).release().perform();
		
		assertEquals("Dropped!", dropable.getText());
		
		act.keyDown(Keys.CONTROL).sendKeys("b").build().perform();
		
		act.keyUp(dropable, Keys.CONTROL).build().perform();
		
		WebElement dra = driver.findElement(By.id("canvas"));
		
		act.clickAndHold(dra).moveByOffset(10, 45).moveByOffset(10, 50).release().perform();
		
		
			
		}*/
	
	/*
	@Test
	
	public void asertionTesting(){
		driver=new FirefoxDriver();
		driver.get("http://compendiumdev.co.uk/selenium/alert.html");
		WebElement el = driver.findElement(By.id("alertexamples"));
		el.click();
		System.out.println(driver.switchTo().alert().getText());
	}
	*/
	/*
	@Test
	public void assertAllerts(){
		
		driver=new FirefoxDriver();
		driver.get("http://compendiumdev.co.uk/selenium/alerts.html");
		WebElement elOne = driver.findElement(By.id("alertexamples"));
		elOne.click();
		driver.switchTo().alert().accept();
		WebElement elTwo=driver.findElement(By.id("confirmexample"));
		elTwo.click();
		driver.switchTo().alert().dismiss();
		String str = driver.findElement(By.cssSelector("p[id='confirmreturn']")).getText();
		
		assertEquals("false", str);
		
		System.out.println(str);
		
		WebElement promtEl = driver.findElement(By.id("promptexample"));
		
		promtEl.click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("misha");
		
		alert.accept();
		
		
	}*/
	
	
	/*@Test(priority=1)
	public void swithingFrames(){
		driver=new FirefoxDriver();
		driver.get("http://compendiumdev.co.uk/selenium/frames/");
		driver.switchTo().frame("content");
		WebElement findContentFromFrame = driver.findElement(By.xpath("html/body/ul[2]/li[2]/a"));
		findContentFromFrame.click();
		driver.findElement(By.xpath("html/body/p/a")).click();
		String str = driver.findElement(By.xpath("html/body/h1")).getText();
		System.out.println(str);
		assertEquals("Content", str);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
	}
		
		@Test(priority=2)
		public void secondOne(){
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		driver.findElement(By.xpath("html/body/a[6]")).click();
		
		
	}
	
	//http://compendiumdev.co.uk/selenium/frames/
	//HTML Frames Example - Menu 1
	
	*/
	
	
	
	
	
	/*@Test
	public void windowHandlers(){

		driver=new FirefoxDriver();
		driver.get("http://compendiumdev.co.uk/selenium/frames/");
		String windowHandler= driver.getWindowHandle();
		driver.switchTo().frame("content");
		driver.findElement(By.xpath("html/body/ul[4]/li[1]/a")).click();
		Set<String>wins=driver.getWindowHandles();
		String str = "";
		for(String winHands:wins){
			if(!windowHandler.contentEquals(winHands)){
				str=winHands; break;
				
			}
		}
		driver.switchTo().window(str);
		
	
		
		
	}
	*/
	
	
	
	/*@Test
	public void newWindowsSwitching(){
		driver=new FirefoxDriver();
		driver.get("http://compendiumdev.co.uk/selenium/frames/");
		String windowHandler= driver.getWindowHandle();
		driver.switchTo().frame("content");
		driver.findElement(By.xpath("html/body/ul[4]/li[1]/a")).click();
		driver.switchTo().window("evil");
		System.out.println(driver.getTitle());
		driver.switchTo().window(windowHandler);
		//driver.close();
		//assertEquals("Home | EvilTester.com", driver.getTitle());
		
		
	}
	*/
	
	@Test
	public void testChangingServer(){
	
		driver=new FirefoxDriver();
		driver.get("http://compendiumdev.co.uk/selenium/basic_ajax.html");
		driver.findElement(By.cssSelector("option[value='3']")).click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("option[value='23']")));
		driver.findElement(By.cssSelector("option[value='23']")).click();
		
		
		
	}
	
	
	
	
	
	}
	
	
	//http://compendiumdev.co.uk/selenium/gui_user_interactions.html
	
	

  
  
    

