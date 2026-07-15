package org.apache.camel.spring.boot.vault;

import org.apache.camel.vault.CyberArkVaultConfiguration;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CyberArkVaultAutoConfiguration}.
 */
@Generated
public class CyberArkVaultAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'cyberArkVaultAutoConfiguration'.
   */
  public static BeanDefinition getCyberArkVaultAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CyberArkVaultAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(CyberArkVaultAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'cyberarkVaultConfiguration'.
   */
  private static BeanInstanceSupplier<CyberArkVaultConfiguration> getCyberarkVaultConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CyberArkVaultConfiguration>forFactoryMethod(CyberArkVaultAutoConfiguration.class, "cyberarkVaultConfiguration", CyberArkVaultConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CyberArkVaultAutoConfiguration.class).cyberarkVaultConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'cyberarkVaultConfiguration'.
   */
  public static BeanDefinition getCyberarkVaultConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CyberArkVaultConfiguration.class);
    beanDefinition.setInstanceSupplier(getCyberarkVaultConfigurationInstanceSupplier());
    return beanDefinition;
  }
}
