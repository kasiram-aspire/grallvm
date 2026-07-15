package org.apache.camel.component.direct.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DirectComponentConfiguration}.
 */
@Generated
public class DirectComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'directComponentConfiguration'.
   */
  public static BeanDefinition getDirectComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DirectComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(DirectComponentConfiguration::new);
    return beanDefinition;
  }
}
