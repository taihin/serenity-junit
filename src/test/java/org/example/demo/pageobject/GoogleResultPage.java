package org.example.demo.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.stream.Collectors;

public class GoogleResultPage extends PageObject {

    @FindBy(xpath = "//div[@class='g']")
    List<WebElementFacade> results;


    public List<String> getDisplayedResults() {
        return results.stream().map(e -> e.getAttribute("textContent")).collect(Collectors.toList());
    }
}
