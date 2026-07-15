package org.apache.camel.spring.boot.threadpool;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelThreadPoolConfigurationProperties}.
 */
@Generated
public class CamelThreadPoolConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'camelThreadPoolConfigurationProperties'.
   */
  public static BeanDefinition getCamelThreadPoolConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelThreadPoolConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(CamelThreadPoolConfigurationProperties::new);
    return beanDefinition;
  }
}
