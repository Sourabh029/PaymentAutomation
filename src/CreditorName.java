import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CreditorName {

    private void runner(WebDriver d)
    {
        d.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("GBB");

    }

    public void setSetCreditorName(WebDriver d)
    {
        try {
            runner(d);
        }
        catch (NoSuchElementException e)
        {
            setSetCreditorName(d);
        }
    }
}
