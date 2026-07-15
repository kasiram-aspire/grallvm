package org.apache.camel.component.file.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link FileComponentConfiguration}.
 */
@Generated
public class FileComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'fileComponentConfiguration'.
   */
  public static BeanDefinition getFileComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FileComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(FileComponentConfiguration::new);
    return beanDefinition;
  }
}
