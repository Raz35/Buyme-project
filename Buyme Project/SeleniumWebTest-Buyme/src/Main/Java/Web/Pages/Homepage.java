package Web.Pages;

import App.Base.BasePage;
import org.openqa.selenium.By;

public class Homepage extends BasePage {

    public void loginPage(){
        clickElement(By.className("separator-link"));
    }

    public void selectAndSearch(){
        selectOptions();
        pressFind();
    }

    private void pressFind() {
        clickElement(By.cssSelector("a[rel=\"nofollow\"]"));
    }

    private void selectOptions() {
        // Click and select price range
        clickElement(By.xpath("//*[@id=\"ember978_chosen\"]/a/span"));
        clickElement(By.cssSelector("li[data-option-array-index=\"3\"]"));

        // Click and select Area
        clickElement(By.xpath("//*[@id=\"ember993_chosen\"]/a"));
        clickElement(By.cssSelector("li[data-option-array-index=\"3\"]"));

        // Click and select category
        clickElement(By.xpath("//*[@id=\"ember1003_chosen\"]/a"));
        clickElement(By.cssSelector("li[data-option-array-index=\"11\"]"));
    }
}
