package org.apache.camel.component.seda.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SedaComponentConfiguration}.
 */
@Generated
public class SedaComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'sedaComponentConfiguration'.
   */
  public static BeanDefinition getSedaComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SedaComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(SedaComponentConfiguration::new);
    return beanDefinition;
  }
}
