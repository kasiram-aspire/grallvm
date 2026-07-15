package org.apache.camel.spring.boot.routetemplate;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelRouteTemplateConfigurationProperties}.
 */
@Generated
public class CamelRouteTemplateConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'camelRouteTemplateConfigurationProperties'.
   */
  public static BeanDefinition getCamelRouteTemplateConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelRouteTemplateConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(CamelRouteTemplateConfigurationProperties::new);
    return beanDefinition;
  }
}
