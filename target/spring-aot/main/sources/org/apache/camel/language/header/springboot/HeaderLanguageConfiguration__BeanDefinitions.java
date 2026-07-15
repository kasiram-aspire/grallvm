package org.apache.camel.language.header.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HeaderLanguageConfiguration}.
 */
@Generated
public class HeaderLanguageConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'headerLanguageConfiguration'.
   */
  public static BeanDefinition getHeaderLanguageConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HeaderLanguageConfiguration.class);
    beanDefinition.setInstanceSupplier(HeaderLanguageConfiguration::new);
    return beanDefinition;
  }
}
