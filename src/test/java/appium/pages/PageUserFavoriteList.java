package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

/**
 * Created by Administrator on 2018/1/29.
 */
public class PageUserFavoriteList {
    private Helper helper;
    public PageUserFavoriteList(Helper helper){
        this.helper=helper;
    }

    public WebElement getBackBtn(){
        return helper.findByClassName("android.widget.ImageButton",1);
    }
    public WebElement getFavoriteTitleTv(int index){
        return helper.findById("net.oschina.app:id/tv_favorite_title",index);
    }

    public void clickBackBtn(){
        helper.click(getBackBtn());
    }
    public String getFavoriteTitle(int index){
        return helper.getText(getFavoriteTitleTv(index));
    }


}
