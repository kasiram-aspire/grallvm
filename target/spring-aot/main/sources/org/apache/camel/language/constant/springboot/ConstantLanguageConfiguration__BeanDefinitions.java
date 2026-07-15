package org.apache.camel.language.constant.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ConstantLanguageConfiguration}.
 */
@Generated
public class ConstantLanguageConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'constantLanguageConfiguration'.
   */
  public static BeanDefinition getConstantLanguageConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ConstantLanguageConfiguration.class);
    beanDefinition.setInstanceSupplier(ConstantLanguageConfiguration::new);
    return beanDefinition;
  }
}
