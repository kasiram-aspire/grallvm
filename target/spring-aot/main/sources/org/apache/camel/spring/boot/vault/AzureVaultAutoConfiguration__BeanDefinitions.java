package org.apache.camel.spring.boot.vault;

import org.apache.camel.vault.AzureVaultConfiguration;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AzureVaultAutoConfiguration}.
 */
@Generated
public class AzureVaultAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'azureVaultAutoConfiguration'.
   */
  public static BeanDefinition getAzureVaultAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AzureVaultAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(AzureVaultAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'azureVaultConfiguration'.
   */
  private static BeanInstanceSupplier<AzureVaultConfiguration> getAzureVaultConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<AzureVaultConfiguration>forFactoryMethod(AzureVaultAutoConfiguration.class, "azureVaultConfiguration", AzureVaultConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AzureVaultAutoConfiguration.class).azureVaultConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'azureVaultConfiguration'.
   */
  public static BeanDefinition getAzureVaultConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AzureVaultConfiguration.class);
    beanDefinition.setInstanceSupplier(getAzureVaultConfigurationInstanceSupplier());
    return beanDefinition;
  }
}
