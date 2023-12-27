import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Amount {

    private void amountSetter(WebDriver d)
    {
        d.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("100");

    }

    public void setAmount(WebDriver d)
    {
        try {
            amountSetter(d);
        }
        catch (NoSuchElementException e)
        {
            setAmount(d);
        }
    }
}
