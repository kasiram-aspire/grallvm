package org.apache.camel.spring.boot.cloud;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelCloudAutoConfiguration}.
 */
@Generated
public class CamelCloudAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'camelCloudAutoConfiguration'.
   */
  public static BeanDefinition getCamelCloudAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelCloudAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(CamelCloudAutoConfiguration::new);
    return beanDefinition;
  }
}
