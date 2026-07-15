package org.apache.camel.language.ref.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RefLanguageConfiguration}.
 */
@Generated
public class RefLanguageConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'refLanguageConfiguration'.
   */
  public static BeanDefinition getRefLanguageConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RefLanguageConfiguration.class);
    beanDefinition.setInstanceSupplier(RefLanguageConfiguration::new);
    return beanDefinition;
  }
}
