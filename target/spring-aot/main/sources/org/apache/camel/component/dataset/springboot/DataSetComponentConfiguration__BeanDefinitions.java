package org.apache.camel.component.dataset.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataSetComponentConfiguration}.
 */
@Generated
public class DataSetComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'dataSetComponentConfiguration'.
   */
  public static BeanDefinition getDataSetComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSetComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(DataSetComponentConfiguration::new);
    return beanDefinition;
  }
}
