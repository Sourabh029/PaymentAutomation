import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class DebitorSortCode {
    private void debitorSortsetter(WebDriver d,String sortcode)
    {
        d.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys(sortcode);

    }

    public void setDebitorSortCode(WebDriver d,String sortCode)
    {
        try {
            debitorSortsetter(d,sortCode);
        }
        catch (NoSuchElementException e)
        {
            setDebitorSortCode(d,sortCode);
        }
    }
}
