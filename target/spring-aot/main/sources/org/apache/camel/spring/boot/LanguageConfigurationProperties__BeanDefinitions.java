package org.apache.camel.spring.boot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LanguageConfigurationProperties}.
 */
@Generated
public class LanguageConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'languageConfigurationProperties'.
   */
  public static BeanDefinition getLanguageConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LanguageConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(LanguageConfigurationProperties::new);
    return beanDefinition;
  }
}
