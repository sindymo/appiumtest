package appium.chapter1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

/**
 * Created by Administrator on 2018/1/24.
 */
public class HelloWorld {
    private AppiumDriver driver;// 声明appium入口：AppiumDriver
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
    }
    @Test
    public void testName() throws Exception {
        Thread.sleep(5000);
        driver.findElement(By.id("android:id/button2")).click();
        Thread.sleep(2000);
        //通过id定位,两种是等价的
//        WebElement tab=driver.findElement(By.id("net.oschina.app:id/nav_item_me"));
//        tab.click();
//        WebElement tab1=driver.findElementById("net.oschina.app:id/nav_item_me");
//        tab1.click();
//        Thread.sleep(2000);
        //通过id定位,两种是等价的
//        WebElement tab2=(WebElement) driver.findElementsById("net.oschina.app:id/nav_tv_title").get(1);
//        System.out.println(tab2.getText());
//        WebElement tab3=(WebElement) driver.findElements(By.id("net.oschina.app:id/nav_tv_title")).get(1);
//        System.out.println(tab3.getText());
        //通过className定位方式
//        WebElement tab4=(WebElement) driver.findElements(By.className("android.widget.TextView")).get(2);
//        System.out.println(tab4.getText());
        //通过xpath定位方式
//        WebElement tab5=driver.findElement(By.xpath("//android.widget.TextView[@text='活动']"));
//        tab5.click();

        //输入和清空操作
        WebElement MyTab=driver.findElement(By.xpath("//android.widget.TextView[@text='我的']"));
        MyTab.click();
        WebElement MyMsg=driver.findElement(By.xpath("//android.widget.TextView[@text='我的消息']"));
        MyMsg.click();
        WebElement name=driver.findElement(By.id("net.oschina.app:id/et_username"));
        name.sendKeys("你好吗");
        Thread.sleep(3000);
        name.clear();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        Thread.sleep(5000);
        driver.quit();

    }
}
