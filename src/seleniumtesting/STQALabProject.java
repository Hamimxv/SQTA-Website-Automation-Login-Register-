package seleniumtesting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class STQALabProject {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\h\\Desktop\\SQLT Lab\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mern-hotel-booking-567.netlify.app/");

        File f0 = new File("C:\\Users\\h\\Desktop\\result.txt");
        FileWriter fwrite = new FileWriter("C:\\Users\\h\\Desktop\\result.txt");

        // Registration
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/header/div[2]/a[2]")).click();
        Thread.sleep(1000);

        String registrationInfo[][] = {{"kfc", "kfc@gmail.com", "123456", "C:\\Users\\h\\Desktop\\kfc.jpeg"}};
        fwrite.write("\nRegistration\nUsername\tEmail\tPassword\tAvatar\tStatus\n\n");

        for (int i = 0; i < registrationInfo.length; i++) {
            driver.findElement(By.name("username")).clear();
            driver.findElement(By.name("email")).clear();
            driver.findElement(By.name("password")).clear();
            driver.findElement(By.name("avatar")).clear();

            driver.findElement(By.name("username")).sendKeys(registrationInfo[i][0]);
            driver.findElement(By.name("email")).sendKeys(registrationInfo[i][1]);
            driver.findElement(By.name("password")).sendKeys(registrationInfo[i][2]);
            driver.findElement(By.name("avatar")).sendKeys(registrationInfo[i][3]);

            driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[1]/form/div[5]/input")).click();
            Thread.sleep(3000);

            if (driver.getPageSource().contains("username already exist!")) {
                System.out.println("User already registered!");
                fwrite.write(registrationInfo[i][0] + "\t" + registrationInfo[i][1] + "\t" + registrationInfo[i][2] + "\t" + registrationInfo[i][3] + "\t" + "Already Registered\n");
            } else if (driver.getCurrentUrl().equals("https://mern-hotel-booking-567.netlify.app/")) {
                System.out.println("Registration test case passed!");
                fwrite.write(registrationInfo[i][0] + "\t" + registrationInfo[i][1] + "\t" + registrationInfo[i][2] + "\t" + registrationInfo[i][3] + "\t" + "Passed\n");
            } else {
                System.out.println("Registration test case failed!");
                fwrite.write(registrationInfo[i][0] + "\t" + registrationInfo[i][1] + "\t" + registrationInfo[i][2] + "\t" + registrationInfo[i][3] + "\t" + "Failed\n");
            }
        }

        // Login
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/header/div[2]/a[1]")).click();
        Thread.sleep(1000);

        String loginInfo[][] = {{"abc", "abc"}, {"123", "123"},{"kfc", "123456"}};
        fwrite.write("\nLogin\nUsername\tPassword\tStatus\n\n");

        for (int i = 0; i < loginInfo.length; i++) {
            driver.findElement(By.name("username")).clear();
            driver.findElement(By.name("password")).clear();
            driver.findElement(By.name("username")).sendKeys(loginInfo[i][0]);
            driver.findElement(By.name("password")).sendKeys(loginInfo[i][1], Keys.ENTER);
            Thread.sleep(3000);

            if (driver.getCurrentUrl().equals("https://mern-hotel-booking-567.netlify.app/")) {
                System.out.println("Test case passed!");
                fwrite.write(loginInfo[i][0] + "\t" + loginInfo[i][1] + "\t" + "Passed\n");
            } else {
                System.out.println("Test case Failed!");
                fwrite.write(loginInfo[i][0] + "\t" + loginInfo[i][1] + "\t" + "Failed\n");
            }
        }

        fwrite.close();
    }
}
