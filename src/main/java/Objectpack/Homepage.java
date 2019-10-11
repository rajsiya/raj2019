package Objectpack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Basepage {
@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
private WebElement women;
@FindBy(xpath="//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]")
private WebElement Dresses;
@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[3]/a")
private WebElement Tshirts;
//@FindBy(xpath="//*[@id=\"center_column\"]/h1/span[2]")
//private WebElement products;
//@FindBy(xpath="//*[@id=\"u1_layered_id_attribute_group_1\"]")
//private WebElement size;
//@FindBy(xpath="//*[@id=\"u1_layered_id_attribute_group_1\"]/li[1]/label/a")
//private WebElement s;

public Homepage() {
	PageFactory.initElements(driver, this);
}
public WebElement women() {
	return women;
}
public WebElement Dresses() {
	return Dresses;
}
public WebElement Tshirts() {
	return Tshirts;
}
public void Clickwomen() {
	women.click();
}
public void ClickDresses() {
	Dresses.click();
}
public void ClickTshirts() {
	Tshirts.click();
}

}

