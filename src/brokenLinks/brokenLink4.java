package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLink4 {

	
	public static WebDriver driver =null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
driver=new ChromeDriver();
String homePage="url";
String url ="";
HttpURLConnection huc = null;
int respcode=200;

driver.manage().window().maximize();
driver.get("url");
List<WebElement>list = driver.findElements(By.tagName("a"));
Iterator<WebElement> itr = list.iterator();
while(itr.hasNext())
{
url=itr.next().getAttribute("href");
if(url==null)
{
	System.out.println("url is not present");
}
if((!url.startsWith(homePage)))
{
System.out.println("url contains different address");	
}
try {
	huc = (HttpURLConnection)(new URL(url).openConnection());
	huc.setRequestMethod("HEAD");
	huc.connect();
	respcode=huc.getResponseCode();
	if(respcode>400)
	{
		System.out.println("broken link found");
	}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

	}

}
