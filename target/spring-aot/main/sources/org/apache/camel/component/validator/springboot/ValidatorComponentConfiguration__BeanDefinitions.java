package org.apache.camel.component.validator.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ValidatorComponentConfiguration}.
 */
@Generated
public class ValidatorComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'validatorComponentConfiguration'.
   */
  public static BeanDefinition getValidatorComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValidatorComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(ValidatorComponentConfiguration::new);
    return beanDefinition;
  }
}
