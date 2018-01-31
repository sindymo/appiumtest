package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

/**
 * Created by Administrator on 2018/1/30.
 */
public class PageQQ {
    private Helper helper;
    public PageQQ(Helper helper){
        this.helper=helper;
    }
    public WebElement getShareToXiaoMeiTv(){
        return helper.findByText("小美");
    }
    public WebElement getSendBtn(){
        return helper.findById("com.tencent.mobileqq:id/dialogRightBtn");
    }


    public void ShareToToXiaoMei(){
        helper.click(getShareToXiaoMeiTv());
    }
    public void clickSendBtn(){
        helper.click(getSendBtn());
    }
}
