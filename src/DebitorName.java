import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class DebitorName {
    private void DebitorNameSetter(WebDriver d)
    {
        d.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("Customer");

    }

    public void setDebitorName(WebDriver d)
    {
        try {
            DebitorNameSetter(d);
        }
        catch (NoSuchElementException e)
        {
            setDebitorName(d);
        }
    }
}
