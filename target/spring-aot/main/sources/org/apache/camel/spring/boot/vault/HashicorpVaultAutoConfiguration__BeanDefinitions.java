package org.apache.camel.spring.boot.vault;

import org.apache.camel.vault.HashicorpVaultConfiguration;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HashicorpVaultAutoConfiguration}.
 */
@Generated
public class HashicorpVaultAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'hashicorpVaultAutoConfiguration'.
   */
  public static BeanDefinition getHashicorpVaultAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HashicorpVaultAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(HashicorpVaultAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'hashicorpVaultConfiguration'.
   */
  private static BeanInstanceSupplier<HashicorpVaultConfiguration> getHashicorpVaultConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HashicorpVaultConfiguration>forFactoryMethod(HashicorpVaultAutoConfiguration.class, "hashicorpVaultConfiguration", HashicorpVaultConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HashicorpVaultAutoConfiguration.class).hashicorpVaultConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'hashicorpVaultConfiguration'.
   */
  public static BeanDefinition getHashicorpVaultConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HashicorpVaultConfiguration.class);
    beanDefinition.setInstanceSupplier(getHashicorpVaultConfigurationInstanceSupplier());
    return beanDefinition;
  }
}
