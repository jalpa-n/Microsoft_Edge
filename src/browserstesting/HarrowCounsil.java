package browserstesting;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class HarrowCounsil {

    public static void main(String[] args) {

        String baseUrl = "https://www.harrow.gov.uk";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());

        boolean verifytitle = title.equals("Home – Harrow Council");
        boolean verifyContains = title.contains("Homepage");
        System.out.println(verifytitle);
        System.out.println(verifyContains);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.close();
    }
}
