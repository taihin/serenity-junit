package org.example.demo;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.demo.stepsdefinitions.GoogleUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenSearchingByKeyword {

    @Steps
    GoogleUser peter;

    @Managed
    WebDriver driver;

    @Test
    public void should_see_relevant_result(){

        peter.is_on_Google_Homepage();
        peter.searches_using_keyword("Efteling");
        peter.should_see_only_results_containing("Efteling");


    }
}
