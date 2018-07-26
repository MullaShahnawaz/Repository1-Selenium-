package com.accenture.utilities;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class ReportDemo {
	@Test
	public void loginWithValidDdata() {
		String ER="Tested";
		String AR = "Tested";

		Assert.assertEquals(AR, ER);

	}

	@Test
	public void loginWithInValidDdata() {
		String AR = "Tested123";
		String ER="Tested";
		

		Assert.assertEquals(AR, ER,"both value are different");

	}

}
