package appium.listeners;
import appium.common.BasicTestCase;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/1/30.
 */
public class TestListener implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {
        if (iTestResult.getMethod().getRealClass().getSimpleName().contains("LoginWithRightCredentials"));
        System.out.println("已成功登陆");

    }

    public void onTestFailure(ITestResult iTestResult) {
        takeScreenShot(iTestResult, BasicTestCase.driver);
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }

    //错误截图的逻辑
    public void takeScreenShot(ITestResult result, AppiumDriver driver) {
        //错误截图的命名:类名点方法名
        String name = result.getMethod().getRealClass().getSimpleName() + "." + result.getMethod().getMethodName();
        //添加时间戳
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        //错误截图的完整命名：类名.方法名-时间戳
        String screenShotName=name+"-"+format.format(new Date())+".png";
        //用该方法截图并指定输出的文件类型
        File file=driver.getScreenshotAs(OutputType.FILE);
        //指定错误截图存放路径,创建一个文件夹
        String destination="screenshots";
        //进行错误截图
        try {
            FileUtils.copyFile(file,new File(destination+"/"+screenShotName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
