package org.apache.camel.spring.boot.cloud;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelCloudConfigurationProperties}.
 */
@Generated
public class CamelCloudConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'camelCloudConfigurationProperties'.
   */
  public static BeanDefinition getCamelCloudConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelCloudConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(CamelCloudConfigurationProperties::new);
    return beanDefinition;
  }
}
