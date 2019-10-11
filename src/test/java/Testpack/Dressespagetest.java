package Testpack;

import org.testng.Assert;
import org.testng.annotations.Test;

import Objectpack.Dressespage;
import Objectpack.Homepage;

public class Dressespagetest {
Dressespage dp;
Homepage hp;
public Dressespagetest() {
dp= new Dressespage();
hp= new Homepage();
}
@Test
public void verifydressescount() {
	hp.ClickDresses();
	Assert.assertTrue(dp.getproductnumberfromheader()==dp.getProductcount(), "failed:count");

}
}