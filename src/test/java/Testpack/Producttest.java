package Testpack;

import org.testng.Assert;
import org.testng.annotations.Test;

import Objectpack.Basepage;
import Objectpack.Homepage;
import Objectpack.Productpage;

public class Producttest  {
	Productpage pp;
	Basepage bp;
	Homepage hp;
	public Producttest() {
		pp=new Productpage();
		bp=new Basepage();
		hp=new Homepage();
	}

	@Test
	public void verifysizes() {
		hp.ClickDresses();
		Assert.assertTrue(bp.elementFound(pp.small()), "failed small");
		Assert.assertTrue(pp.Medium().isDisplayed(), "failed medium");
		Assert.assertTrue(pp.Large().isDisplayed(), "failed large");
	}
}
