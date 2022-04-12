package group1_art;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class login {
	WebDriver driver;
	By myaccount=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
	By register=By.linkText("Register");
	By fname= By.name("firstname");
	By lname=By.name("lastname");
	By email=By.name("email");
	By phone=By.name("telephone");
	By pass=By.name("password");
	By cpass=By.name("confirm");
	By button=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By click=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	
	public login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickmyaccount()
	{
		driver.findElement(myaccount).click();
	}
	public void clickregisterpage()
	{
		driver.findElement(register).click();
	}
	public void clickfname(String uname)
	{
		driver.findElement(fname).sendKeys(uname);
	}
	public void clicklname(String name)
	{
		driver.findElement(lname).sendKeys(name);
	}
	public void clickemail(String mail)
	{
		driver.findElement(email).sendKeys(mail);
	}
	public void clickphone(String ph)
	{
		driver.findElement(phone).sendKeys(ph);
	}
	public void clickpassword(String password)
	{
		driver.findElement(pass).sendKeys(password);
	}
	public void clickconfirm(String cpassword)
	{
		driver.findElement(cpass).sendKeys(cpassword);
	}
	public void clickbutton()
	{
		driver.findElement(button).click();
	}
	public void clickcontinue()
	{
		driver.findElement(click).click();
	}
}
