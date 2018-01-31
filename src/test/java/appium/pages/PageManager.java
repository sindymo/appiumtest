package appium.pages;

import appium.common.Helper;

import java.awt.event.HierarchyEvent;

/**
 * Created by Administrator on 2018/1/26.
 */
public class PageManager {
    private Helper helper;
    private PageCommon pageCommon;
    private PageMy pageMy;
    private PageLogin pageLogin;
    private PageSettings pageSettings;
    private PageAbout pageAbout;
    private PageHome pageHome;
    private PageNewsDetail pageNewsDetail;
    private PageUserFavoriteList pageUserFavoriteList;
    private PageQQ pageQQ;

    public PageManager(Helper helper){
        this.helper=helper;
    }

    public PageCommon getPageCommon(){
        if (pageCommon==null){
            pageCommon=new PageCommon(helper);
        }
        return pageCommon;
    }

    public PageMy getPageMy() {
        if (pageMy==null){
            pageMy=new PageMy(helper);
        }
        return pageMy;
    }

    public PageLogin getPageLogin() {
        if (pageLogin==null){
            pageLogin=new PageLogin(helper);
        }
        return pageLogin;
    }

    public PageSettings getPageSettings() {
        if (pageSettings==null){
            pageSettings=new PageSettings(helper);
        }
        return pageSettings;
    }

    public PageAbout getPageAbout() {
        if (pageAbout==null){
            pageAbout=new PageAbout(helper);
        }
        return pageAbout;
    }
    public PageHome getPageHome(){
        if (pageHome==null){
            pageHome=new PageHome(helper);
        }
        return pageHome;
    }
    public PageNewsDetail getPageNewsDetail(){
        if (pageNewsDetail==null){
            pageNewsDetail=new PageNewsDetail(helper);
        }
        return pageNewsDetail;
    }
    public PageUserFavoriteList getPageUserFavoriteList(){
        if (pageUserFavoriteList==null){
            pageUserFavoriteList=new PageUserFavoriteList(helper);
        }
        return pageUserFavoriteList;
    }
    public PageQQ getPageQQ(){
        if (pageQQ==null){
            pageQQ=new PageQQ(helper);
        }
        return pageQQ;
    }
}
