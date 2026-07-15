package org.apache.camel.spring.boot.security;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelSSLConfigurationProperties}.
 */
@Generated
public class CamelSSLConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'camelSSLConfigurationProperties'.
   */
  public static BeanDefinition getCamelSSLConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelSSLConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(CamelSSLConfigurationProperties::new);
    return beanDefinition;
  }
}
