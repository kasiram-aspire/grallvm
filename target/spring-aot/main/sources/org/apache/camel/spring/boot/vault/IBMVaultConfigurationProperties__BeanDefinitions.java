package org.apache.camel.spring.boot.vault;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link IBMVaultConfigurationProperties}.
 */
@Generated
public class IBMVaultConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'iBMVaultConfigurationProperties'.
   */
  public static BeanDefinition getIBMVaultConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(IBMVaultConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(IBMVaultConfigurationProperties::new);
    return beanDefinition;
  }
}
