package org.apache.camel.component.ref.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RefComponentConfiguration}.
 */
@Generated
public class RefComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'refComponentConfiguration'.
   */
  public static BeanDefinition getRefComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RefComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(RefComponentConfiguration::new);
    return beanDefinition;
  }
}
