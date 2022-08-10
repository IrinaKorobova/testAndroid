package tests;

import lib.CoreTestCase;
import lib.MainPageObject;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class SearchTest extends CoreTestCase {

    @Test
    public void testFindJava() {

        MainPageObject mainPO = new MainPageObject(this.driver);

        WebElement searchInit = mainPO.waitForElementPresent(
                "id:org.wikipedia:id/fragment_feed_header",
                "Cannot find Search Wikipedia init search input");
        searchInit.click();


        WebElement searchInput = mainPO.waitForElementPresent(
                "id:org.wikipedia:id/search_src_text",
                "Cannot find search input");

        searchInput.sendKeys("wfewfewfwegweg");

        WebElement expectedResult = mainPO.waitForElementPresent(
                "id:org.wikipedia:id/search_empty_view",
                "Cannot find image and text no results found"
        );
    }
}
// org.wikipedia:id/fragment_feed_header
// org.wikipedia:id/search_src_text
//org.wikipedia:id/view_list_card_list
