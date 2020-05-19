package org.example.demo.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

@DefaultUrl("http://www.google.nl")
public class GoogleHomepage extends PageObject {

    @FindBy(xpath = "//input[@name='q']")
    WebElementFacade inputSearch;

    @FindBy(xpath = "(//input[@name='btnK'])[2]")
    WebElementFacade buttonSearch;

    public void searches_by(String keyword) {
        inputSearch.type(keyword + Keys.TAB);
    }

    public void submit_search() {
        buttonSearch.click();
    }
}
