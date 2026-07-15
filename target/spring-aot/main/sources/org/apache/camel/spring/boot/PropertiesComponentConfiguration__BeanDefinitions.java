package org.apache.camel.spring.boot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PropertiesComponentConfiguration}.
 */
@Generated
public class PropertiesComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'propertiesComponentConfiguration'.
   */
  public static BeanDefinition getPropertiesComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PropertiesComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(PropertiesComponentConfiguration::new);
    return beanDefinition;
  }
}
