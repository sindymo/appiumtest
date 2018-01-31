package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

/**
 * Created by Administrator on 2018/1/29.
 */
public class PageNewsDetail {
    private Helper helper;
    public PageNewsDetail(Helper helper){
        this.helper=helper;
    }
//    public WebElement getBackBtn(){
//        return helper.findById("android.widget.ImageButton",1);
//    }
    public WebElement getAddToFavoriteBtn(){
        return helper.findById("net.oschina.app:id/iv_fav");
    }
    public WebElement getShareBtn(){
        return helper.findById("net.oschina.app:id/iv_share");
    }
    public WebElement getShareToQQ(){
        return helper.findById("net.oschina.app:id/ly_share_qq");
    }

//    public void clickBackBtn(){
//        helper.click(getBackBtn());
//    }
//    public void clickBackBtn(){
//        helper.goBack();
//    }
    public void clickAddToFavoriteBtn(){
        helper.click(getAddToFavoriteBtn());
    }
    public void clickShareBtn(){
        helper.click(getShareBtn());
    }
    public void clickShareToQQ(){
        helper.click(getShareToQQ());
    }
}
