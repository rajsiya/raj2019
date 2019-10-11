package Objectpack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage extends Basepage {

	@FindBy(xpath="//*[@id=\'ul_layered_id_attribute_group_1\']/li[1]/label/a")
		private WebElement small;
		@FindBy(xpath="//*[@id=\'ul_layered_id_attribute_group_1\']/li[2]/label/a")
		private WebElement Medium;
		@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
		private WebElement Large;


public Productpage() {
	PageFactory.initElements(driver, this);
	
}
public WebElement small() {
	return small;

}
public WebElement Medium() {
	return Medium;

}
public WebElement Large() {
	return Large;

}
}