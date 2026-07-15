package org.apache.camel.spring.boot.security;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelSSLAutoConfiguration}.
 */
@Generated
public class CamelSSLAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'camelSSLAutoConfiguration'.
   */
  public static BeanDefinition getCamelSSLAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelSSLAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(CamelSSLAutoConfiguration::new);
    return beanDefinition;
  }
}
