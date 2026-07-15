package org.apache.camel.language.simple.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link FileLanguageConfiguration}.
 */
@Generated
public class FileLanguageConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'fileLanguageConfiguration'.
   */
  public static BeanDefinition getFileLanguageConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FileLanguageConfiguration.class);
    beanDefinition.setInstanceSupplier(FileLanguageConfiguration::new);
    return beanDefinition;
  }
}
