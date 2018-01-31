package appium.testcases.versioncheck;

import appium.common.BasicTestCase;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.mustache.BaseChunk;

/**
 * Created by Administrator on 2018/1/29.
 */
public class VersionCheck extends BasicTestCase{
    @Test
    public void testAppVersion() throws Exception {
        pageManager.getPageCommon().goToMyTab();
        pageManager.getPageMy().clickSettingsBtn();
        pageManager.getPageSettings().clickAboutAs();
        Assert.assertEquals(pageManager.getPageAbout().getAppVersionValue(),"v2.9.9(1609281026)");
    }
}
