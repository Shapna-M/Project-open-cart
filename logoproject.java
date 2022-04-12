package group1_art;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logoproject {
	WebDriver driver;
	By search=By.name("search");
	By click=By.xpath("//*[@id=\"search\"]/span/button");
	By mystore=By.xpath("//*[@id=\"logo\"]/h1/a");

public logoproject(WebDriver driver)
{
	this.driver=driver;
}
public void clicksearch(String info)
{
	driver.findElement(search).sendKeys(info);
}
public void clickbutton()
{
	driver.findElement(click).click();
}
public void clickstore()
{
	driver.findElement(mystore).click();
}
	
}
