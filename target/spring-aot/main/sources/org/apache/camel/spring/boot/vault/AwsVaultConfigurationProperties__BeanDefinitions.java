package org.apache.camel.spring.boot.vault;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AwsVaultConfigurationProperties}.
 */
@Generated
public class AwsVaultConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'awsVaultConfigurationProperties'.
   */
  public static BeanDefinition getAwsVaultConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AwsVaultConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(AwsVaultConfigurationProperties::new);
    return beanDefinition;
  }
}
