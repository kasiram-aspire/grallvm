package org.apache.camel.component.dataformat.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataFormatComponentConfiguration}.
 */
@Generated
public class DataFormatComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'dataFormatComponentConfiguration'.
   */
  public static BeanDefinition getDataFormatComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataFormatComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(DataFormatComponentConfiguration::new);
    return beanDefinition;
  }
}
