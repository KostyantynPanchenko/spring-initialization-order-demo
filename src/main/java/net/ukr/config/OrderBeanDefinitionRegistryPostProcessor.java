package net.ukr.config;

import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

public class OrderBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

  @Override
  public void postProcessBeanDefinitionRegistry(final BeanDefinitionRegistry registry)
      throws BeansException {
    LoggerFactory.getLogger(OrderBeanDefinitionRegistryPostProcessor.class)
        .info("-2) OrderDefinitionPostProcessor#postProcessBeanDefinitionRegistry");
  }

  @Override
  public void postProcessBeanFactory(final ConfigurableListableBeanFactory beanFactory)
      throws BeansException {
    LoggerFactory.getLogger(OrderBeanDefinitionRegistryPostProcessor.class)
        .info("-1) OrderDefinitionPostProcessor#postProcessBeanFactory");
  }
}
