package org.apache.camel.spring.boot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ComponentConfigurationProperties}.
 */
@Generated
public class ComponentConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'componentConfigurationProperties'.
   */
  public static BeanDefinition getComponentConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(ComponentConfigurationProperties::new);
    return beanDefinition;
  }
}
