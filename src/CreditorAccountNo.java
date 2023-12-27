import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CreditorAccountNo {


    private void creaditorAccNosetter(WebDriver d, String accNo)
    {
        d.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys(accNo);

    }

    public void setCreditorAccNo(WebDriver d,String accNo)
    {

        try {
            creaditorAccNosetter(d,accNo);
        }
        catch (NoSuchElementException e)
        {
            setCreditorAccNo(d,accNo);
        }
    }

    private void resetAccNo(WebDriver d)
    {
        try{
            resetCreditorAccNo(d);
        }
        catch (NoSuchElementException e)
        {
            resetCreditorAccNo(d);
        }
    }

    public void resetCreditorAccNo(WebDriver d)
    {

            d.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).clear();

    }
}
