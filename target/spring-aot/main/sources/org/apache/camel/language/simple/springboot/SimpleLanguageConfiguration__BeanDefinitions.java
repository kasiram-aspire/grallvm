package org.apache.camel.language.simple.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SimpleLanguageConfiguration}.
 */
@Generated
public class SimpleLanguageConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'simpleLanguageConfiguration'.
   */
  public static BeanDefinition getSimpleLanguageConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SimpleLanguageConfiguration.class);
    beanDefinition.setInstanceSupplier(SimpleLanguageConfiguration::new);
    return beanDefinition;
  }
}
