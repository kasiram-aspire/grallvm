package org.apache.camel.spring.boot.vault;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HashicorpVaultConfigurationProperties}.
 */
@Generated
public class HashicorpVaultConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'hashicorpVaultConfigurationProperties'.
   */
  public static BeanDefinition getHashicorpVaultConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HashicorpVaultConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(HashicorpVaultConfigurationProperties::new);
    return beanDefinition;
  }
}
