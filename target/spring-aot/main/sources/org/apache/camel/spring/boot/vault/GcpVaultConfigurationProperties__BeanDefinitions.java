package org.apache.camel.spring.boot.vault;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link GcpVaultConfigurationProperties}.
 */
@Generated
public class GcpVaultConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'gcpVaultConfigurationProperties'.
   */
  public static BeanDefinition getGcpVaultConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GcpVaultConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(GcpVaultConfigurationProperties::new);
    return beanDefinition;
  }
}
