package org.apache.camel.component.mock.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MockComponentConfiguration}.
 */
@Generated
public class MockComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'mockComponentConfiguration'.
   */
  public static BeanDefinition getMockComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MockComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(MockComponentConfiguration::new);
    return beanDefinition;
  }
}
