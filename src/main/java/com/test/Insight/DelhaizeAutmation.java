package com.test.Insight;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DelhaizeAutmation extends Delahize_page {

	String southportland = "CLEVELAND/3Z";
	String DCName, userName, orderdatastatus, productselected;
	String unitofmeasurestr = "Unit of Measurement";
	String usebystr = "Use By";
	String commentsstr = "Comments";

	@Test

	public void Delhaize_Automation() throws InterruptedException {

		// activity.setStopApp(false);

		System.out.println("Delhaize Test Started");
		Thread.sleep(3000);
		
		//Delahize_page.allow();
		//Delahize_page.allow();
		//Delahize_page.allow();
		//Delahize_page.allow();
		
		Delhaize_Login.emialField("user@delhaize.com");
		Delhaize_Login.passwordField("password");
		//Thread.sleep(2000);
		Delhaize_Login.sign_in_button();
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, 600000);
		System.out.println("Waiting for Sync to Finish");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/customPanel")));
		System.out.println("Processing Data.......");
		
		Thread.sleep(15000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.trimble.harvestmark.insights:id/selectStoreText")));
        System.out.println("At Select Location Screen");

	}
}