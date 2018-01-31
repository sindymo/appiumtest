package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

/**
 * Created by Administrator on 2018/1/26.
 */
public class PageMy {
    private Helper helper;
    public PageMy(Helper helper){
        this.helper=helper;
    }

    public WebElement getSettingsBtn(){
        return helper.findById("net.oschina.app:id/iv_logo_setting");
    }
    public WebElement getLoginIcon(){
        return helper.findById("net.oschina.app:id/iv_portrait");
    }
    public WebElement getNickNameTv(){
        return helper.findById("net.oschina.app:id/tv_nick");
    }

    public WebElement getMyMsgItem(){
        return helper.findById("net.oschina.app:id/iv_portrait");
    }

    public WebElement getMyBlogItem(){
        return helper.findById("net.oschina.app:id/rl_blog");
    }
    public WebElement getMyActivitiesItem(){
        return helper.findById("net.oschina.app:id/rl_info_avtivities");
    }
    public WebElement getMyTeamitem(){
        return helper.findById("net.oschina.app:id/rl_team");
    }
    public WebElement getFavoritesLayout(){
        return helper.findById("net.oschina.app:id/ly_favorite");
    }

    public void clickSettingsBtn(){
        helper.click(getSettingsBtn());
    }
    public void clickLoginIcon(){
        helper.click(getLoginIcon());
    }
    public void clickMyMsgItem(){
        helper.click(getMyMsgItem());
    }
    public void clickMyBlogItem(){
        helper.click(getMyBlogItem());
    }
    public void clickMyActivitiseItem(){
        helper.click(getMyActivitiesItem());
    }
    public void clickMyTeamItem(){
        helper.click(getMyTeamitem());
    }
    public String getNickName(){
        return helper.getText(getNickNameTv());
    }
    public void clickFavoritesLayout(){
        helper.click(getFavoritesLayout());
    }
}
