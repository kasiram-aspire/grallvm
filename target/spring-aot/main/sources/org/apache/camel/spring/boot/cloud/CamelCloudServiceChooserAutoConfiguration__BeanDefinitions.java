package org.apache.camel.spring.boot.cloud;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelCloudServiceChooserAutoConfiguration}.
 */
@Generated
public class CamelCloudServiceChooserAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'camelCloudServiceChooserAutoConfiguration'.
   */
  public static BeanDefinition getCamelCloudServiceChooserAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelCloudServiceChooserAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(CamelCloudServiceChooserAutoConfiguration::new);
    return beanDefinition;
  }
}
