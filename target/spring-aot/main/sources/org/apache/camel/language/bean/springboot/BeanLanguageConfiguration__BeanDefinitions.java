package org.apache.camel.language.bean.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BeanLanguageConfiguration}.
 */
@Generated
public class BeanLanguageConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'beanLanguageConfiguration'.
   */
  public static BeanDefinition getBeanLanguageConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BeanLanguageConfiguration.class);
    beanDefinition.setInstanceSupplier(BeanLanguageConfiguration::new);
    return beanDefinition;
  }
}
