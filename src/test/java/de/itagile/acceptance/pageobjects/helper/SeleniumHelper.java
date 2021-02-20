package de.itagile.acceptance.pageobjects.helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHelper {
	/**
	 * Use if element is not clickable ("Element is not clickable at point...")
	 * <pre>
	 * // Call it like this. Use By.id or what every you need to find the element
	 * SeleniumHelper.jsClick(driver.findElement(By.id("theUniqueIdOfTheElement")), driver);
	 * </pre>
	 * You could also try to use the Actions class to chain methods
	 * 
	 * @see org.openqa.selenium.JavascriptExecutor
	 * @see org.openqa.selenium.interactions.Actions#moveToElement(WebElement)
	 * 
	 * @param element the element you want to click on
	 * @param driver the WebDrive to use as JavascriptExecutor, usually the usual WebDriver you are already using
	 */
	public static void jsClickOn(WebElement element, WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", element);
	}
}
