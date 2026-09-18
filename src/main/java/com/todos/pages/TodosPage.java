package com.todos.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.todos.utils.BasePage;

public class TodosPage extends BasePage {

	public TodosPage() throws IOException {
		PageFactory.initElements(driver, this);
	
	}
/**@FindBy**/
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='What needs to be done?']")
	public static WebElement inputText;
	
	@FindBy(how = How.XPATH, using = "//label[@data-testid='todo-item-label']")
	public static WebElement todoText ;
	
	@FindBy(how = How.XPATH, using = "//input[@class='toggle']")
	public static WebElement checkBox ;
	
	@FindBy(how = How.XPATH, using = "//button[@class='destroy']")
	public static WebElement deleteButton;
	
	
	/**Create Methods **/
	
	public void submitTodos(String todos) {
		inputText.clear();
		inputText.sendKeys(todos);
		inputText.sendKeys(Keys.ENTER); 
	}
	
	public boolean isElementDisplayed(WebElement element) {
		Boolean isElementDisplayed = element.isDisplayed();
		return isElementDisplayed;
		
	}
	
	public String checkElementContain(WebElement element) {
		String elementTodo = element.getText();
		return elementTodo;
	}
	
	public void removeTodo() {
	    Actions actions = new Actions(driver);
	    actions.moveToElement(todoText).perform();
	    deleteButton.click();
	}

	public boolean isTodoListEmpty() {
	    return checkElementContain(todoText).isEmpty();
	}
	
    public boolean isCheckBoxSelected(WebElement element) {
    Boolean isCheckBoxSelected = element.isSelected();
    	return isCheckBoxSelected;
    }
}
