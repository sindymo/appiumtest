package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

import java.awt.event.HierarchyEvent;

/**
 * Created by Administrator on 2018/1/26.
 */
public class PageLogin {
    private Helper helper;
    public PageLogin(Helper helper){
        this.helper=helper;
    }

    public WebElement getBackBtn(){
       return helper.findByClassName("android.widget.ImageButton",1);
    }

    public WebElement getUsernameTv(){
        return helper.findById("net.oschina.app:id/et_username");
    }
    public WebElement getUserpwdTv(){
        return helper.findById("net.oschina.app:id/et_password");
    }
    public WebElement getLoginBtn(){
        return helper.findById("net.oschina.app:id/btn_login");
    }

    public void clickBackBtn(){
        helper.click(getBackBtn());
    }
    public void enterName(String name){
        helper.enterText(getUsernameTv(),name);
    }
    public void enterPwd(String pwd){
        helper.enterText(getUserpwdTv(),pwd);
    }
    public void clickLoginBtn(){
        helper.click(getLoginBtn());
    }

    public void clearName(){
        helper.clearText(getUsernameTv());
    }
    public void clearPwd(){
        helper.clearText(getUserpwdTv());
    }
    public void login(String name,String pwd){
        helper.enterTextWithPreClear(getUsernameTv(),name);
        helper.enterTextWithPreClear(getUserpwdTv(),pwd);
        clickLoginBtn();
    }
    public boolean isLoginPage(){
        boolean result=false;
        if (getUsernameTv().isDisplayed()&&getUsernameTv().isEnabled()){
            return true;
        }
        return result;
    }


}

