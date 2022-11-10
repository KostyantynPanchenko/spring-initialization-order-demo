package net.ukr;

import net.ukr.beans.InitializationOrderBean;
import net.ukr.beans.SmartBean;
import net.ukr.config.BeanOrderDefinitionPostProcessor;
import net.ukr.config.OrderBeanDefinitionRegistryPostProcessor;
import net.ukr.config.OrderPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringInitializationOrderDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringInitializationOrderDemoApplication.class, args);
  }

  @Bean
  public static BeanOrderDefinitionPostProcessor beanOrderDefinitionPostProcessor() {
    return new BeanOrderDefinitionPostProcessor();
  }

  @Bean
  public static OrderBeanDefinitionRegistryPostProcessor orderDefinitionPostProcessor() {
    return new OrderBeanDefinitionRegistryPostProcessor();
  }

  @Bean
  public OrderPostProcessor orderPostProcessor() {
    return new OrderPostProcessor();
  }

  @Bean(name = "initializationOrderBean", initMethod = "beanInit", destroyMethod = "beanDestroy")
  public InitializationOrderBean initializationOrderBean() {
    return new InitializationOrderBean();
  }

  @Bean
  public SmartBean smartBean() {
    return new SmartBean();
  }
}
