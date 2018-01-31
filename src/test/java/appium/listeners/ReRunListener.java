package appium.listeners;

import appium.common.ReTry;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/1/30.
 */
public class ReRunListener implements IAnnotationTransformer {

    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        IRetryAnalyzer iRetryAnalyzer=iTestAnnotation.getRetryAnalyzer();
        if (iRetryAnalyzer==null){
            iTestAnnotation.setRetryAnalyzer(ReTry.class);
        }
    }
}
