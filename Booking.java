package org.fb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking extends Baseclass {
	public Booking() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private  WebElement selectloction;
	@FindBy(id="hotels")
	private WebElement selecthotel;
	@FindBy (id="room_type")
	private WebElement selectroomtype;
	@FindBy (id = "room_nos")
	private WebElement selectnumber;
	@FindBy (id= "datepick_in")
	private WebElement selectcheckindate;
	@FindBy (id= "datepick_out")
	private WebElement selectcheckoutdate;
	public WebElement getSelectloction() {
		return selectloction;
	}
	public WebElement getSelecthotel() {
		return selecthotel;
	}
	public WebElement getSelectroomtype() {
		return selectroomtype;
	}
	public WebElement getSelectnumber() {
		return selectnumber;
	}
	public WebElement getSelectcheckindate() {
		return selectcheckindate;
	}
	public WebElement getSelectcheckoutdate() {
		return selectcheckoutdate;
	}
}
