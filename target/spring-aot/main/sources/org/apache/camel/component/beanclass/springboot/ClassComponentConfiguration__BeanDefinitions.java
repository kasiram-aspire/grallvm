package org.apache.camel.component.beanclass.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ClassComponentConfiguration}.
 */
@Generated
public class ClassComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'classComponentConfiguration'.
   */
  public static BeanDefinition getClassComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ClassComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(ClassComponentConfiguration::new);
    return beanDefinition;
  }
}
