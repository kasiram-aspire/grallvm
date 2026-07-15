package org.apache.camel.component.saga.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SagaComponentConfiguration}.
 */
@Generated
public class SagaComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'sagaComponentConfiguration'.
   */
  public static BeanDefinition getSagaComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SagaComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(SagaComponentConfiguration::new);
    return beanDefinition;
  }
}
