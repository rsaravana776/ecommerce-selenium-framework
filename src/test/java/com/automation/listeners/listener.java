package com.automation.listeners;


import org.testng.IAnnotationTransformer;

import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.*;

import com.automation.retry.retry;

public class listener implements IAnnotationTransformer {

    @Override

    public void transform(ITestAnnotation annotation,

            Class testClass,

            Constructor constructor,

            Method method) {

        annotation.setRetryAnalyzer(retry.class);

    }

}