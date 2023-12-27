import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CreditorSortCode {
    private void creditorSortsetter(WebDriver d)
    {
        d.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("040584");

    }

    public void setCreditorSortCode(WebDriver d)
    {
        try {
            creditorSortsetter(d);
        }
        catch (NoSuchElementException e)
        {
            setCreditorSortCode(d);
        }
    }
}
