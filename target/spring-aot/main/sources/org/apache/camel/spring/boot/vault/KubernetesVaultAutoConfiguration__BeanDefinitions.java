package org.apache.camel.spring.boot.vault;

import org.apache.camel.vault.KubernetesVaultConfiguration;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link KubernetesVaultAutoConfiguration}.
 */
@Generated
public class KubernetesVaultAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'kubernetesVaultAutoConfiguration'.
   */
  public static BeanDefinition getKubernetesVaultAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KubernetesVaultAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(KubernetesVaultAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kubernetesVaultConfiguration'.
   */
  private static BeanInstanceSupplier<KubernetesVaultConfiguration> getKubernetesVaultConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KubernetesVaultConfiguration>forFactoryMethod(KubernetesVaultAutoConfiguration.class, "kubernetesVaultConfiguration", KubernetesVaultConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KubernetesVaultAutoConfiguration.class).kubernetesVaultConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'kubernetesVaultConfiguration'.
   */
  public static BeanDefinition getKubernetesVaultConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KubernetesVaultConfiguration.class);
    beanDefinition.setInstanceSupplier(getKubernetesVaultConfigurationInstanceSupplier());
    return beanDefinition;
  }
}
