package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

import java.awt.event.HierarchyEvent;

/**
 * Created by Administrator on 2018/1/29.
 */
public class PageHome {
    private Helper helper;

    public PageHome(Helper helper){
        this.helper=helper;
    }
    public WebElement getNewsTitleTv(int index){
        return helper.findById("net.oschina.app:id/tv_title",index);

    }
    public String getNewsTitleValue(int index){
        return helper.getText(getNewsTitleTv(index));
    }
    public void clickNewsTitle(int index){
        helper.click(getNewsTitleTv(index));;
    }
}
