package org.apache.camel.component.timer.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TimerComponentConfiguration}.
 */
@Generated
public class TimerComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'timerComponentConfiguration'.
   */
  public static BeanDefinition getTimerComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TimerComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(TimerComponentConfiguration::new);
    return beanDefinition;
  }
}
