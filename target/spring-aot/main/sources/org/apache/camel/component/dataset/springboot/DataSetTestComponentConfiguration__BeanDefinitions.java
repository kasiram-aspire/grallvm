package org.apache.camel.component.dataset.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataSetTestComponentConfiguration}.
 */
@Generated
public class DataSetTestComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'dataSetTestComponentConfiguration'.
   */
  public static BeanDefinition getDataSetTestComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSetTestComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(DataSetTestComponentConfiguration::new);
    return beanDefinition;
  }
}
