package appium.testcases.crossapp;

import appium.common.BasicTestCase;
import org.testng.annotations.Test;


/**
 * Created by Administrator on 2018/1/30.
 */
public class ShareToQQ extends BasicTestCase{
    @Test
    public void testShareToQQ() throws Exception {
        pageManager.getPageCommon().goToMyTab();
        pageManager.getPageMy().clickLoginIcon();
        pageManager.getPageLogin().login("735723619@qq.com","12345678");
        pageManager.getPageCommon().goToHomeTab();
        pageManager.getPageHome().clickNewsTitle(2);
        pageManager.getPageNewsDetail().clickShareBtn();
        pageManager.getPageNewsDetail().clickShareToQQ();
        pageManager.getPageQQ().ShareToToXiaoMei();
        pageManager.getPageQQ().clickSendBtn();

    }
}
