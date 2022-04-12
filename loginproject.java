package group1_art;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginproject {
	WebDriver driver;
	By myaccount=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
	By login=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	By email=By.name("email");
	By password=By.name("password");
	By buttonclick=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");

public loginproject(WebDriver driver)
{
	this.driver=driver;
}
public void clickmyaccount()
{
	driver.findElement(myaccount).click();
}
public void clicklogin()
{
	driver.findElement(login).click();
}
public void enteremail(String id)
{
	driver.findElement(email).sendKeys(id);
}
public void enterpassword(String pass)
{
	driver.findElement(password).sendKeys(pass);
}
public void clickloginbutton()
{
	driver.findElement(buttonclick).click();
}
}