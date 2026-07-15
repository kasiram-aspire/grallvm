package org.apache.camel.model.rest.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RestConfigurationDefinitionProperties}.
 */
@Generated
public class RestConfigurationDefinitionProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'restConfigurationDefinitionProperties'.
   */
  public static BeanDefinition getRestConfigurationDefinitionPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestConfigurationDefinitionProperties.class);
    beanDefinition.setInstanceSupplier(RestConfigurationDefinitionProperties::new);
    return beanDefinition;
  }
}
