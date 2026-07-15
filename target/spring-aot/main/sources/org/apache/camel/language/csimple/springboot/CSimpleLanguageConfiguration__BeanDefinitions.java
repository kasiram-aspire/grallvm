package org.apache.camel.language.csimple.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CSimpleLanguageConfiguration}.
 */
@Generated
public class CSimpleLanguageConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'cSimpleLanguageConfiguration'.
   */
  public static BeanDefinition getCSimpleLanguageConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CSimpleLanguageConfiguration.class);
    beanDefinition.setInstanceSupplier(CSimpleLanguageConfiguration::new);
    return beanDefinition;
  }
}
