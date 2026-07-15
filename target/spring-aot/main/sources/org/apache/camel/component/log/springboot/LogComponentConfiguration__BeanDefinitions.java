package org.apache.camel.component.log.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LogComponentConfiguration}.
 */
@Generated
public class LogComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'logComponentConfiguration'.
   */
  public static BeanDefinition getLogComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LogComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(LogComponentConfiguration::new);
    return beanDefinition;
  }
}
