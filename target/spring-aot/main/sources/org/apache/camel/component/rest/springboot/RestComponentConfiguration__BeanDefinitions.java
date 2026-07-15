package org.apache.camel.component.rest.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RestComponentConfiguration}.
 */
@Generated
public class RestComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'restComponentConfiguration'.
   */
  public static BeanDefinition getRestComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(RestComponentConfiguration::new);
    return beanDefinition;
  }
}
