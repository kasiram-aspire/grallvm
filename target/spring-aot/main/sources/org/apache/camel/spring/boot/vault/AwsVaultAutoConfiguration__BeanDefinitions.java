package org.apache.camel.spring.boot.vault;

import org.apache.camel.vault.AwsVaultConfiguration;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AwsVaultAutoConfiguration}.
 */
@Generated
public class AwsVaultAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'awsVaultAutoConfiguration'.
   */
  public static BeanDefinition getAwsVaultAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AwsVaultAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(AwsVaultAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'awsVaultConfiguration'.
   */
  private static BeanInstanceSupplier<AwsVaultConfiguration> getAwsVaultConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<AwsVaultConfiguration>forFactoryMethod(AwsVaultAutoConfiguration.class, "awsVaultConfiguration", AwsVaultConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AwsVaultAutoConfiguration.class).awsVaultConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'awsVaultConfiguration'.
   */
  public static BeanDefinition getAwsVaultConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AwsVaultConfiguration.class);
    beanDefinition.setInstanceSupplier(getAwsVaultConfigurationInstanceSupplier());
    return beanDefinition;
  }
}
