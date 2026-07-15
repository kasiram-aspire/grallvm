package org.apache.camel.component.bean.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BeanComponentConfiguration}.
 */
@Generated
public class BeanComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'beanComponentConfiguration'.
   */
  public static BeanDefinition getBeanComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BeanComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(BeanComponentConfiguration::new);
    return beanDefinition;
  }
}
