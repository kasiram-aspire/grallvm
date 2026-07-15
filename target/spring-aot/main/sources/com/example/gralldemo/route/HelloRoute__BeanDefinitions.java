package com.example.gralldemo.route;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HelloRoute}.
 */
@Generated
public class HelloRoute__BeanDefinitions {
  /**
   * Get the bean definition for 'helloRoute'.
   */
  public static BeanDefinition getHelloRouteBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HelloRoute.class);
    beanDefinition.setInstanceSupplier(HelloRoute::new);
    return beanDefinition;
  }
}
