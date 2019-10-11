package Objectpack;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Dressespage extends Basepage {
	@FindBy(xpath="//span[@class='heading-counter']")
			private WebElement textheader;			
	@FindBys(@FindBy(xpath="//ul[@class=\"product_list grid row\"]/li"))
	private List<WebElement>productcount;
	
	public Dressespage()
	{
		PageFactory.initElements(driver, this);
	}
public int getproductnumberfromheader() {
	String txt=textheader.getText();
	String [] arr=txt.split(" ");
	String value=arr[2];
	int number=Integer.parseInt(value);
	return number;
	//return Integer.parseInt(textheader.getText().split(" ")[2]);
			}
public int getProductcount() {
	int s1=productcount.size();
	return s1;

}
}