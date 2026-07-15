package org.apache.camel.language.variable.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link VariableLanguageConfiguration}.
 */
@Generated
public class VariableLanguageConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'variableLanguageConfiguration'.
   */
  public static BeanDefinition getVariableLanguageConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VariableLanguageConfiguration.class);
    beanDefinition.setInstanceSupplier(VariableLanguageConfiguration::new);
    return beanDefinition;
  }
}
