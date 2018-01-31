package appium.testcases.login;

import appium.common.BasicTestCase;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by Administrator on 2018/1/26.
 */
public class LoginWithRightCredentials extends BasicTestCase{
    @Test
    public void testSuccessfullyLogin() throws Exception {
        pageManager.getPageCommon().goToMyTab();
        pageManager.getPageMy().clickLoginIcon();
        pageManager.getPageLogin().login("735723619@qq.com","12345678");
        Assert.assertEquals(pageManager.getPageMy().getNickName(),"aotu12345aotu");
    }
}
