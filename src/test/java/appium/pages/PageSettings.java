package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

import java.awt.event.HierarchyEvent;

/**
 * Created by Administrator on 2018/1/29.
 */
public class PageSettings {
    private Helper helper;
    public PageSettings(Helper helper){
        this.helper=helper;
    }
    public WebElement getLoginOutBtn(){
        return helper.findById("net.oschina.app:id/rl_cancle");
    }
    public WebElement getAboutUs(){
        return helper.findById("net.oschina.app:id/rl_about");
    }
    public void clickLoginOutBtn(){
        helper.click(getLoginOutBtn());
    }
    public void clickAboutAs(){
        helper.click(getAboutUs());
    }

}
