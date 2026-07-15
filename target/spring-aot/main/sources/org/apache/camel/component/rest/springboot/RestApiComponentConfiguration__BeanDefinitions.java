package org.apache.camel.component.rest.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RestApiComponentConfiguration}.
 */
@Generated
public class RestApiComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'restApiComponentConfiguration'.
   */
  public static BeanDefinition getRestApiComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestApiComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(RestApiComponentConfiguration::new);
    return beanDefinition;
  }
}
