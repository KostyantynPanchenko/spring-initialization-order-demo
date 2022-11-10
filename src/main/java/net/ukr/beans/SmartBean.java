package net.ukr.beans;

import org.slf4j.LoggerFactory;

public class SmartBean {

  public void myInit() {
    LoggerFactory.getLogger(SmartBean.class).info("SmartBean.myInit() - set by bean definition postprocessor");
  }

  public void shutdown() {
    LoggerFactory.getLogger(SmartBean.class).info("SmartBean.shutdown() - called by Spring because of the method name");
  }
}
