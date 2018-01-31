package appium.testcases.login;

import appium.common.BasicTestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/29.
 */
public class LoginStatusCheck extends BasicTestCase{
    @Test
    public void testShouldLogin() throws Exception {
        pageManager.getPageCommon().goToMyTab();
        pageManager.getPageMy().clickMyMsgItem();
        Assert.assertTrue(pageManager.getPageLogin().isLoginPage());
        //Assert.assertEquals(pageManager.getPageLogin().isLoginPage(),true);
        pageManager.getPageLogin().clickBackBtn();

        pageManager.getPageMy().clickMyBlogItem();
        Assert.assertTrue(pageManager.getPageLogin().isLoginPage());
        pageManager.getPageLogin().clickBackBtn();

        pageManager.getPageMy().clickMyActivitiseItem();
        Assert.assertTrue(pageManager.getPageLogin().isLoginPage());
        pageManager.getPageLogin().clickBackBtn();

        pageManager.getPageMy().clickMyTeamItem();
        Assert.assertTrue(pageManager.getPageLogin().isLoginPage());
        pageManager.getPageLogin().clickBackBtn();
    }
}
