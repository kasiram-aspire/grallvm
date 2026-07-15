package org.apache.camel.spring.boot.vault;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link KubernetesVaultConfigurationProperties}.
 */
@Generated
public class KubernetesVaultConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'kubernetesVaultConfigurationProperties'.
   */
  public static BeanDefinition getKubernetesVaultConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KubernetesVaultConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(KubernetesVaultConfigurationProperties::new);
    return beanDefinition;
  }
}
