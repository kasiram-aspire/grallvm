package org.apache.camel.spring.boot.vault;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link KubernetesConfigMapVaultConfigurationProperties}.
 */
@Generated
public class KubernetesConfigMapVaultConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'kubernetesConfigMapVaultConfigurationProperties'.
   */
  public static BeanDefinition getKubernetesConfigMapVaultConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KubernetesConfigMapVaultConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(KubernetesConfigMapVaultConfigurationProperties::new);
    return beanDefinition;
  }
}
