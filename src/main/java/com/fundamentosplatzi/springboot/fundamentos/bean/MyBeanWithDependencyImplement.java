package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);
       private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("We have gotten into the printWithdependency method.");
        int number = 1;
        LOGGER.debug("The number send as parameter to operation dependency is : "+number);
        System.out.println(myOperation.sum(number));
        System.out.println("Hello from a bean implementation with dependency");
    }
}
