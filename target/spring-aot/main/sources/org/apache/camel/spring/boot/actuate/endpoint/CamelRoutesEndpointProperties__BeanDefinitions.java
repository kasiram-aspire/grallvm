package org.apache.camel.spring.boot.actuate.endpoint;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelRoutesEndpointProperties}.
 */
@Generated
public class CamelRoutesEndpointProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'camelRoutesEndpointProperties'.
   */
  public static BeanDefinition getCamelRoutesEndpointPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelRoutesEndpointProperties.class);
    beanDefinition.setInstanceSupplier(CamelRoutesEndpointProperties::new);
    return beanDefinition;
  }
}
