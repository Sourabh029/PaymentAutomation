import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ConnectionType {

    private WebDriver d;
    ThreadSleeper ts=new ThreadSleeper();

    public void setD(WebDriver d) {
        this.d = d;
    }

    private void setConnectionRunner(WebDriver d)
    {
        d.findElement(By.xpath("//*[@id=\"mat-select-0\"]")).click();
        d.findElement(By.xpath("//*[@id=\"mat-option-12\"]")).click();

    }

    public void setConnection(WebDriver d)
    {
        ts.setDuration(10000);
        setD(d);
        try{
            setConnectionRunner(this.d);
        }
        catch (NoSuchElementException e)
        {
            setConnection(this.d);
        }
    }
}
