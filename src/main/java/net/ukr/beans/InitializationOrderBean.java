package net.ukr.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class InitializationOrderBean implements BeanNameAware, InitializingBean, DisposableBean {

  private static final Logger LOG = LoggerFactory.getLogger(InitializationOrderBean.class);

//  TODO: unkomment the code below to see how the initialization order changes
//  private SmartBean smartBean;
//
//  @Autowired
//  public void setSmartBean(SmartBean smartBean) {
//    LOG.info("InitializationOrderBean.setSmartBean()");
//    this.smartBean = smartBean;
//  }

  public InitializationOrderBean() {
    LOG.info("0) Constructor");
  }

  @Override
  public void setBeanName(final String name) {
    LOG.info("1) BeanNameAware.setBeanName()");
  }

  @PostConstruct
  public void postConstruct() {
    LOG.info("3) @PostConstruct");
  }

  @Override
  public void afterPropertiesSet() {
    LOG.info("4) InitializingBean.afterPropertiesSet()");
  }

  public void beanInit() {
    LOG.info("5) @Bean(init = \"beanInit()\")");
  }
  @PreDestroy

  public void preDestroy() {
    LOG.info("7) @PreDestroy");
  }

  @Override
  public void destroy() {
    LOG.info("8) DisposableBean.destroy()");
  }

  public void beanDestroy() {
    LOG.info("9) @Bean(destroy = \"beanDestroy()\")");
  }

  public void shutdown() {
    LOG.info("shutdown()");
  }
}
