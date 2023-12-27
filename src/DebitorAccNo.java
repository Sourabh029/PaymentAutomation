import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class DebitorAccNo {
    private void debitorAccNosetter(WebDriver d, String accNo)
    {
        d.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys(accNo);

    }

    public void setDebitorAccNo(WebDriver d,String accNo)
    {
        try {
            debitorAccNosetter(d,accNo);
        }
        catch (NoSuchElementException e)
        {
            setDebitorAccNo(d,accNo);
        }
    }
}
