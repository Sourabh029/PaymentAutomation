import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class PaymentReference {

    private void paymentreferencesetter(WebDriver d)
    {
        d.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("Testing");

    }

    public void setPaymentReference(WebDriver d)
    {
        try {
            paymentreferencesetter(d);
        }
        catch (NoSuchElementException e)
        {
            setPaymentReference(d);
        }
    }

}
