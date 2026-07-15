package org.apache.camel.component.stub.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link StubComponentConfiguration}.
 */
@Generated
public class StubComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'stubComponentConfiguration'.
   */
  public static BeanDefinition getStubComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(StubComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(StubComponentConfiguration::new);
    return beanDefinition;
  }
}
