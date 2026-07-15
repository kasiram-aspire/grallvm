package org.apache.camel.spring.boot.vault;

import org.apache.camel.vault.GcpVaultConfiguration;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link GcpVaultAutoConfiguration}.
 */
@Generated
public class GcpVaultAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'gcpVaultAutoConfiguration'.
   */
  public static BeanDefinition getGcpVaultAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GcpVaultAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(GcpVaultAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'gcpVaultConfiguration'.
   */
  private static BeanInstanceSupplier<GcpVaultConfiguration> getGcpVaultConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<GcpVaultConfiguration>forFactoryMethod(GcpVaultAutoConfiguration.class, "gcpVaultConfiguration", GcpVaultConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(GcpVaultAutoConfiguration.class).gcpVaultConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'gcpVaultConfiguration'.
   */
  public static BeanDefinition getGcpVaultConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GcpVaultConfiguration.class);
    beanDefinition.setInstanceSupplier(getGcpVaultConfigurationInstanceSupplier());
    return beanDefinition;
  }
}
