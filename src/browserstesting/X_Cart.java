package browserstesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class X_Cart {
    public static void main(String[] args) {
        String baseUrl = "https://www.x-cart.com/";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());
        boolean verifytitle = title.equals("X-Cart | The Last Ecommerce Platform You Will Ever Need");
        boolean vrifycontains = title.contains("Ecommerce Platform");
        System.out.println("verifycontains");
        System.out.println("verifytitle");
        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        driver.close();
    }

}
