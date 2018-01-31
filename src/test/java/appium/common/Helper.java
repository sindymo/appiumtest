package appium.common;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2018/1/25.
 */
public class Helper {
    private AppiumDriver driver;
    private final long DEFAULT_TIMEOUT = 5;
    private final long LONG_TIMEOUT = 10;

    public Helper(AppiumDriver driver) {
        this.driver = driver;
    }

    public void waitForElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
    public void waitForElementForLongTime(By by){
        WebDriverWait wait=new WebDriverWait(driver,LONG_TIMEOUT);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    /**
     * 常见定位方式封装
     *
     * @param
     * @return
     */
    //按id定位
    public WebElement findById(String id) {
        waitForElement(By.id(id));
        return driver.findElement(By.id(id));
    }

    //多个相同id的定位方法，index从0开始
    public WebElement findById(String id, int index) {
        waitForElement(By.id(id));
        return (WebElement) driver.findElements(By.id(id)).get(index - 1);
    }

    //按控件类型定位className
    public WebElement findByClassName(String clsName,int index){
        waitForElement(By.className(clsName));
        return (WebElement) driver.findElements(By.className(clsName)).get(index-1);
    }

    //按文本定位text
    public WebElement findByText(String text){
        waitForElement(By.xpath("//*[@text='"+text+"']"));
        return driver.findElement(By.xpath("//*[@text='"+text+"']"));
    }
    public WebElement findByText(String text,int index){
        waitForElement(By.xpath("//*[@text='"+text+"']"));
        return (WebElement)driver.findElements(By.xpath("//*[@text='"+text+"']")).get(index-1);
    }

    /**
     * 常见控件的定位方式
     * @param
     */
    //执行点击操作
    public void click(WebElement element){
        System.out.println("执行控件点击操作");
        element.click();
    }

    //执行输入操作
    public void enterText(WebElement element,String text){
        System.out.println("执行输入操作，输入文本为:"+text);
        element.sendKeys(text);
    }
    //执行清空操作
    public void clearText(WebElement element){
        System.out.println("执行清空输入框操作");
        element.clear();
    }
    //输入之前执行清空操作
    public void enterTextWithPreClear(WebElement element,String text){
       clearText(element);
       enterText(element,text);
    }
    //获取控件文本
    public String getText(WebElement element){
        System.out.println("执行如下操作：获取控件文本");
        return element.getText();
    }
    public void goBack(){
//        String cmdstr="adb shell input keyevent 4";
//        driver.execute(cmdstr);
        driver.navigate().back();
    }

}
