package Testpack;

import org.testng.Assert;
import org.testng.annotations.Test;

import Objectpack.Basepage;
import Objectpack.Homepage;

public class Homepagetest {
	Homepage hp;
	Basepage bp;
	
	public Homepagetest()
	{
		hp=new Homepage();
		bp=new Basepage();
	}
	
   @Test
   public void verifywomen() {
	Assert.assertTrue(hp.women().isDisplayed());
}	
   
   @Test
	public void verifyTshirts() {
		Assert.assertTrue(hp.Tshirts().isDisplayed());
} 
   @Test
	public void verifyDresses() {
Assert.assertTrue(hp.Dresses().isDisplayed());

}
   
   @Test
   public void verifyclickwomen() {
	   hp.Clickwomen();
	   String title=bp.getTitlte();
	   Assert.assertTrue(title.contains("Women - My Store"));
   }
   @Test
   public void verifyclickDresses() {
	   hp.ClickDresses();
	   String title=bp.getTitlte();
	   Assert.assertTrue(title.contains("Dresses - My Store"));
   }
   @Test
   public void verifyclickTshirts() {
	   hp.ClickTshirts();
	   String title=bp.getTitlte();
	   Assert.assertTrue(title.contains("T-shirts - My Store"));
   }
}




