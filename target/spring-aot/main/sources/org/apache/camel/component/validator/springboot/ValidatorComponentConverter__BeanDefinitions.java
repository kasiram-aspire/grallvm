package org.apache.camel.component.validator.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ValidatorComponentConverter}.
 */
@Generated
public class ValidatorComponentConverter__BeanDefinitions {
  /**
   * Get the bean definition for 'validatorComponentConverter'.
   */
  public static BeanDefinition getValidatorComponentConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValidatorComponentConverter.class);
    InstanceSupplier<ValidatorComponentConverter> instanceSupplier = InstanceSupplier.using(ValidatorComponentConverter::new);
    instanceSupplier = instanceSupplier.andThen(ValidatorComponentConverter__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
