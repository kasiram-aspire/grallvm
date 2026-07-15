package org.apache.camel.component.language.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LanguageComponentConfiguration}.
 */
@Generated
public class LanguageComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'languageComponentConfiguration'.
   */
  public static BeanDefinition getLanguageComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LanguageComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(LanguageComponentConfiguration::new);
    return beanDefinition;
  }
}
