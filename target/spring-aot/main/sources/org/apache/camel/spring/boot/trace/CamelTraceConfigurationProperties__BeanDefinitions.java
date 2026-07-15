package org.apache.camel.spring.boot.trace;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelTraceConfigurationProperties}.
 */
@Generated
public class CamelTraceConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'camelTraceConfigurationProperties'.
   */
  public static BeanDefinition getCamelTraceConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelTraceConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(CamelTraceConfigurationProperties::new);
    return beanDefinition;
  }
}
