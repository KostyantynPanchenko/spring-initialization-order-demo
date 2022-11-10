package net.ukr.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class OrderPostProcessor implements BeanPostProcessor {

  private final static Logger LOG = LoggerFactory.getLogger(OrderPostProcessor.class);

  @Override
  public Object postProcessBeforeInitialization(final Object bean, final String beanName)
      throws BeansException {
    if (beanName.equals("initializationOrderBean")) {
      LOG.info("2) postProcessBeforeInitialization()");
    }
    return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
  }

  @Override
  public Object postProcessAfterInitialization(final Object bean, final String beanName)
      throws BeansException {
    if (beanName.equals("initializationOrderBean")) {
      LOG.info("6) postProcessAfterInitialization");
    }
    return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
  }
}
