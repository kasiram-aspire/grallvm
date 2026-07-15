package org.apache.camel.spring.boot.vault;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CyberArkVaultConfigurationProperties}.
 */
@Generated
public class CyberArkVaultConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'cyberArkVaultConfigurationProperties'.
   */
  public static BeanDefinition getCyberArkVaultConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CyberArkVaultConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(CyberArkVaultConfigurationProperties::new);
    return beanDefinition;
  }
}
