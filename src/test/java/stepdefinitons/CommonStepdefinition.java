package stepdefinitons;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonStepdefinition
{


    public WebDriver webDriver;
    Properties properties=loadPropFile();

    @Before
    public void beforeScenario(){
        System.out.println("---------Start the browser-----------");
        System.setProperty("webdriver.chrome.driver","chromedriver");
        //ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
       webDriver=new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
        webDriver.manage().window().maximize();
    }
    @After
    public void afterScenario(){
        System.out.println("Closing browser");
        webDriver.quit();
    }

    public static Properties loadPropFile()
    {
        Properties prop = new Properties();
        try {
            InputStream input = new FileInputStream("src/test/Properties/title.properties");
            prop.load(input);

        }
        catch (Exception e)
        {

        }
        return prop;

    }


}
