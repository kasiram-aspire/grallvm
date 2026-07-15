package org.apache.camel.component.controlbus.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ControlBusComponentConfiguration}.
 */
@Generated
public class ControlBusComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'controlBusComponentConfiguration'.
   */
  public static BeanDefinition getControlBusComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ControlBusComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(ControlBusComponentConfiguration::new);
    return beanDefinition;
  }
}
