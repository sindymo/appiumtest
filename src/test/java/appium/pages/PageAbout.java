package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

/**
 * Created by Administrator on 2018/1/29.
 */
public class PageAbout {
    private Helper helper;
    public PageAbout(Helper helper){
        this.helper=helper;
    }

    public WebElement getBackBtn(){
        return helper.findByClassName("android.widget.ImageButton",1);
    }
    public WebElement getAppVersionTv(){
        return helper.findById("net.oschina.app:id/tv_version_name");
    }

    public void clickBackBtn(){
        helper.click(getBackBtn());
    }
    public String getAppVersionValue(){
        return helper.getText(getAppVersionTv());
    }

}
