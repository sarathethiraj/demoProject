package com.qa.fdcalculator.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.fdcalculator.baseClass.baseclass;

public class fdpage extends baseclass {

	
	@FindBy(id="principal")
	WebElement prinicipal;
	
	@FindBy(id="interest")
	WebElement interest;
	
	@FindBy(id="tenure")
	WebElement period;
	
	@FindBy(id="tenurePeriod")
	WebElement tenureperiod;
	
	@FindBy(id="frequency")
	WebElement frequency;
	
	@FindBy(xpath="//*[@id='fdMatVal']//div[2]/a[1]")
	WebElement calculatebtn;
	
	@FindBy(xpath="//*[@id='resp_intval']/em")
	WebElement actinterest;
	
	
	
	
	public fdpage(WebDriver driver) {
		super(driver);
		
	}
	
	
   public  void simpleinterestcalculation(int prinicipalamount, int rateinterest, int duration, String mode){
	   
	   prinicipal.sendKeys(String.valueOf(prinicipalamount));
	   interest.sendKeys(String.valueOf(rateinterest));
	   period.sendKeys(String.valueOf(duration));
	   selectOperation(tenureperiod, mode);
	   selectOperation(frequency,"Simple Interest");
	   calculatebtn.click();
   }
   
   public String interestextract(){
	   
	   return actinterest.getText();
	   
	   
	   
   }
	
	

}
