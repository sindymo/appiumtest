package appium.testcases.favorites;

import appium.common.BasicTestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/29.
 */
public class AddToFavorite extends BasicTestCase{
    @Test
    public void testAddToFavorite() throws Exception {
        pageManager.getPageCommon().goToMyTab();
        pageManager.getPageMy().clickLoginIcon();
        pageManager.getPageLogin().login("735723619@qq.com","12345678");
        pageManager.getPageLogin().clickLoginBtn();
        pageManager.getPageCommon().goToHomeTab();
        String expectedNewsTitle=pageManager.getPageHome().getNewsTitleValue(2);
        pageManager.getPageHome().clickNewsTitle(2);
        pageManager.getPageNewsDetail().clickAddToFavoriteBtn();
        Thread.sleep(1000);
        //pageManager.getPageNewsDetail().clickBackBtn();
        pageManager.getPageCommon().goBack();
        pageManager.getPageCommon().goToMyTab();
        pageManager.getPageMy().clickFavoritesLayout();
        String actualNewsTitle=pageManager.getPageUserFavoriteList().getFavoriteTitle(1);
        //Assert.assertEquals(expectedNewsTitle,actualNewsTitle);
        Assert.assertTrue(expectedNewsTitle.contains(actualNewsTitle));



    }
}
