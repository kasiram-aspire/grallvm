package org.apache.camel.spring.boot.vault;

import org.apache.camel.vault.IBMSecretsManagerVaultConfiguration;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link IBMVaultAutoConfiguration}.
 */
@Generated
public class IBMVaultAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'iBMVaultAutoConfiguration'.
   */
  public static BeanDefinition getIBMVaultAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(IBMVaultAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(IBMVaultAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'ibmSecretsManagerVaultConfiguration'.
   */
  private static BeanInstanceSupplier<IBMSecretsManagerVaultConfiguration> getIbmSecretsManagerVaultConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<IBMSecretsManagerVaultConfiguration>forFactoryMethod(IBMVaultAutoConfiguration.class, "ibmSecretsManagerVaultConfiguration", IBMVaultConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(IBMVaultAutoConfiguration.class).ibmSecretsManagerVaultConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'ibmSecretsManagerVaultConfiguration'.
   */
  public static BeanDefinition getIbmSecretsManagerVaultConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(IBMSecretsManagerVaultConfiguration.class);
    beanDefinition.setInstanceSupplier(getIbmSecretsManagerVaultConfigurationInstanceSupplier());
    return beanDefinition;
  }
}
