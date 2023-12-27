import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Submit {
    private void submitSetter(WebDriver d)
    {
        d.findElement(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/app-fps-inbound-payments/div/mat-card/form/div/button")).click();

    }

    public void submitButton(WebDriver d)
    {
        try {
            submitSetter(d);
        }
        catch (NoSuchElementException e)
        {
            submitButton(d);
        }
    }
}
