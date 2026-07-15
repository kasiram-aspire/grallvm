package org.apache.camel.spring.boot.vault;

import org.apache.camel.vault.KubernetesConfigMapVaultConfiguration;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link KubernetesConfigMapVaultAutoConfiguration}.
 */
@Generated
public class KubernetesConfigMapVaultAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'kubernetesConfigMapVaultAutoConfiguration'.
   */
  public static BeanDefinition getKubernetesConfigMapVaultAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KubernetesConfigMapVaultAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(KubernetesConfigMapVaultAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kubernetesConfigMapVaultConfiguration'.
   */
  private static BeanInstanceSupplier<KubernetesConfigMapVaultConfiguration> getKubernetesConfigMapVaultConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KubernetesConfigMapVaultConfiguration>forFactoryMethod(KubernetesConfigMapVaultAutoConfiguration.class, "kubernetesConfigMapVaultConfiguration", KubernetesConfigMapVaultConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KubernetesConfigMapVaultAutoConfiguration.class).kubernetesConfigMapVaultConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'kubernetesConfigMapVaultConfiguration'.
   */
  public static BeanDefinition getKubernetesConfigMapVaultConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KubernetesConfigMapVaultConfiguration.class);
    beanDefinition.setInstanceSupplier(getKubernetesConfigMapVaultConfigurationInstanceSupplier());
    return beanDefinition;
  }
}
