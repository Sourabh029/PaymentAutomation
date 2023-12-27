import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int i = 206;
        BufferedWriter writer = null;
/*        System.setProperty("webdriver.gecko.driver", "E:\\Programing\\Sellenium\\geckodriver-v0.33.0-win32\\geckodriver.exe");
        WebDriver d = new FirefoxDriver();*/

        //System.setProperty("webdriver.chrome.driver", "E:\\Programing\\Sellenium\\chromedriver_win32 (2)\\chromedriver.exe");
        //WebDriver d = new ChromeDriver();
        String sortCode="800551";
        String AccNo="00813796";
        System.setProperty("webdriver.edge.driver", "E:\\Programing\\Sellenium\\edgedriver_win64\\msedgedriver.exe");
        WebDriver d = new EdgeDriver();
        d.manage().window().maximize();
        ThreadSleeper slepper=new ThreadSleeper();
        d.get("https://paymentsimulator.clearbank.co.uk/inboundpayments");
        slepper.setDuration(20000);


        ConnectionType connectionType=new ConnectionType();
        CreditorName creditorName=new CreditorName();
        CreditorAccountNo creditorAccountNo = new CreditorAccountNo();
        Amount amount = new Amount();
        CreditorSortCode creditorSortCode=new CreditorSortCode();
        DebitorAccNo debitorAccNo=new DebitorAccNo();
        DebitorName debitorName=new DebitorName();
        DebitorSortCode debitorSortCode=new DebitorSortCode();
        FetchAccNoFromFolder fetchAccNoFromFolder=new FetchAccNoFromFolder();
        PaymentReference paymentReference=new PaymentReference();
        Submit submit=new Submit();



        connectionType.setConnection(d);
        paymentReference.setPaymentReference(d);
        amount.setAmount(d);
        creditorName.setSetCreditorName(d);
        creditorSortCode.setCreditorSortCode(d);
        debitorName.setDebitorName(d);
        debitorSortCode.setDebitorSortCode(d,sortCode);
        debitorAccNo.setDebitorAccNo(d,AccNo);

        List<String> accounts= fetchAccNoFromFolder.fetchAccNo("E:\\Programing\\Sellenium\\NewAccDetails - Copy\\testing");

        for (String account : accounts ) {
            creditorAccountNo.setCreditorAccNo(d,account);
            slepper.setDuration(1000);
            submit.submitButton(d);
            creditorAccountNo.resetCreditorAccNo(d);


        }




    }
}