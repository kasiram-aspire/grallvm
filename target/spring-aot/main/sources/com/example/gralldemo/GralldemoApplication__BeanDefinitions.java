package com.example.gralldemo;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link GralldemoApplication}.
 */
@Generated
public class GralldemoApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'gralldemoApplication'.
   */
  public static BeanDefinition getGralldemoApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GralldemoApplication.class);
    beanDefinition.setTargetType(GralldemoApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(GralldemoApplication.class);
    beanDefinition.setInstanceSupplier(GralldemoApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
