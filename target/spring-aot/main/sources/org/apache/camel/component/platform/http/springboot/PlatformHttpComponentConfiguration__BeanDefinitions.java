package org.apache.camel.component.platform.http.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PlatformHttpComponentConfiguration}.
 */
@Generated
public class PlatformHttpComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'platformHttpComponentConfiguration'.
   */
  public static BeanDefinition getPlatformHttpComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PlatformHttpComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(PlatformHttpComponentConfiguration::new);
    return beanDefinition;
  }
}
