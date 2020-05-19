package org.example.demo.stepsdefinitions;

import net.thucydides.core.annotations.Step;
import org.example.demo.pageobject.GoogleHomepage;
import org.example.demo.pageobject.GoogleResultPage;
import org.mockito.ArgumentMatchers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GoogleUser {
    private String actor;

    GoogleHomepage googleHomepage;
    GoogleResultPage resultPage;

    @Step("#actor is on Google Homepage")
    public void is_on_Google_Homepage() {
        googleHomepage.open();
    }

    @Step("#actor searches using keyword '{0}' ")
    public void searches_using_keyword(String keyword) {
        googleHomepage.searches_by(keyword);
        googleHomepage.submit_search();
    }

    @Step("#actor should see only results containing '{0}'")
    public void should_see_only_results_containing(String keyword) {
        assertThat(resultPage.getDisplayedResults(),everyItem(containsString(keyword)));
    }
}
