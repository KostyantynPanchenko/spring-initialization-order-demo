package net.ukr.config;

import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanOrderDefinitionPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        LoggerFactory.getLogger(this.getClass()).info("BeanOrderDefinitionPostProcessor.postProcessBeanFactory()");
        beanFactory.getBeanDefinition("smartBean").setInitMethodName("myInit");
    }
}
