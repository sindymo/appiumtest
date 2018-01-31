package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

/**
 * Created by Administrator on 2018/1/25.
 */
public class PageCommon {
    private Helper helper;
    public PageCommon(Helper helper){
        this.helper=helper;
    }

    public WebElement getHomeTab(){
        return helper.findById("net.oschina.app:id/nav_item_news");
    }
    public WebElement getMomentTab(){
        return helper.findById("net.oschina.app:id/nav_item_tweet");
    }
    public WebElement getPublishBtn(){
        return helper.findById("net.oschina.app:id/nav_item_tweet_pub");
    }
    public WebElement getExploreTab(){
        return helper.findById("net.oschina.app:id/nav_item_explore");
    }
    public WebElement getMyTab(){
        return helper.findByText("我的");
    }

    public void goToHomeTab(){
        helper.click(getHomeTab());
    }
    public void goToMomentTab(){
        helper.click(getMomentTab());
    }
    public void clickPublishBtn(){
        helper.click(getPublishBtn());
    }
    public void goToExploreTab(){
        helper.click(getExploreTab());
    }
    public void goToMyTab(){
        helper.click(getMyTab());
    }
    public void goBack(){
        helper.goBack();
    }
}
