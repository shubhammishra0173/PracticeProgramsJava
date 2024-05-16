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

public class brokenLink3 {

	public static WebDriver driver =null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String homePage="url";
String url ="";
HttpURLConnection huc = null;
int respcode=200;
driver =new ChromeDriver();

driver.manage().window().maximize();
driver.get(homePage);
List<WebElement> list = driver.findElements(By.tagName("a"));
Iterator<WebElement>itr=list.iterator();
while(itr.hasNext())
{
url = itr.next().getAttribute("href");
if(url==null || url.isEmpty())
{
	System.out.println("url is not prsent");
	continue;
}
if(!url.startsWith(homePage))
{
System.out.println("url is not belong to this address");
continue;
}
try {
	huc = (HttpURLConnection)(new URL(url).openConnection());
	huc.setRequestMethod("Head");
	huc.connect();
	respcode=huc.getResponseCode();
	if(respcode>=400)
	{
		System.out.println("This is broken link");
	}
	else
	{
		System.out.println("link is valid  ");
	}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}



	}

}
