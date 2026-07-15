package org.apache.camel.component.scheduler.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SchedulerComponentConfiguration}.
 */
@Generated
public class SchedulerComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'schedulerComponentConfiguration'.
   */
  public static BeanDefinition getSchedulerComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SchedulerComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(SchedulerComponentConfiguration::new);
    return beanDefinition;
  }
}
