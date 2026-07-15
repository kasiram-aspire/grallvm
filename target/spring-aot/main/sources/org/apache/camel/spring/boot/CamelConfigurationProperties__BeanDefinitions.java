package org.apache.camel.spring.boot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelConfigurationProperties}.
 */
@Generated
public class CamelConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'camelConfigurationProperties'.
   */
  public static BeanDefinition getCamelConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(CamelConfigurationProperties::new);
    return beanDefinition;
  }
}
