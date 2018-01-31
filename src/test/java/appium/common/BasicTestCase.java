package appium.common;

import appium.pages.PageManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.net.URL;

/**
 * Created by Administrator on 2018/1/24.
 */
public class BasicTestCase {
    public static AppiumDriver driver;// 声明appium入口：AppiumDriver
    private Helper helper;// 声明Helper
    public PageManager pageManager;// 声明PageManager
    @BeforeMethod
    public void setUp() throws Exception {
        //构造被测试应用的路径
        File app = new File(System.getProperty("user.dir"), "AUT/osc-android-v2.9.9(1609281026)-google-debug.apk");
        //实例化DesiredCapabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //deviceName的值可以任意指定
        capabilities.setCapability("deviceName","My Device");
        //设置被测应用的绝对路径
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage","net.oschina.app");
        //设置启动类的信息，这个信息可以通过aapt dump bading apkname来获得
        capabilities.setCapability("appActivity", ".AppStart");
        //Appium默认输入中文有问题，所以如果要输入中文需要加入此配置项
        capabilities.setCapability("unicodeKeyboard",true);
        //初始化AppiumDriver
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        //初始化Helper
        helper=new Helper(driver);
        //初始化PageManager
        pageManager=new PageManager(helper);

        Thread.sleep(2000);
        //driver.findElement(By.id("android:id/button1")).click();
        pageManager.getPageCommon().goBack();
        Thread.sleep(2000);
        //优化登录操作
        pageManager.getPageCommon().goToMyTab();
        if ("aotu12345aotu".equals(pageManager.getPageMy().getNickName())){
            pageManager.getPageMy().clickSettingsBtn();
            pageManager.getPageSettings().clickLoginOutBtn();
        }
        pageManager.getPageCommon().getHomeTab();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        Thread.sleep(5000);
        driver.quit();

    }
}
