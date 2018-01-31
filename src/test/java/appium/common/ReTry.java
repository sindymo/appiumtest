package appium.common;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by Administrator on 2018/1/31.
 */
public class ReTry implements IRetryAnalyzer{
    int index=0;
    int reTryCount=2;//失败重跑次数
    public boolean retry(ITestResult iTestResult) {
        if (index<2){
            index++;
            return true;
        }
        return false;
    }
}
