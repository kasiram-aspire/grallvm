package org.apache.camel.spring.boot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelStartupConditionConfigurationProperties}.
 */
@Generated
public class CamelStartupConditionConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'camelStartupConditionConfigurationProperties'.
   */
  public static BeanDefinition getCamelStartupConditionConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelStartupConditionConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(CamelStartupConditionConfigurationProperties::new);
    return beanDefinition;
  }
}
