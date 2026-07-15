package org.apache.camel.spring.boot.vault;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AzureVaultConfigurationProperties}.
 */
@Generated
public class AzureVaultConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'azureVaultConfigurationProperties'.
   */
  public static BeanDefinition getAzureVaultConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AzureVaultConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(AzureVaultConfigurationProperties::new);
    return beanDefinition;
  }
}
