package org.apache.camel.component.validator.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ValidatorComponentAutoConfiguration}.
 */
@Generated
public class ValidatorComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.validator.springboot.ValidatorComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<ValidatorComponentAutoConfiguration> getValidatorComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ValidatorComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new ValidatorComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'validatorComponentAutoConfiguration'.
   */
  public static BeanDefinition getValidatorComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValidatorComponentAutoConfiguration.class);
    InstanceSupplier<ValidatorComponentAutoConfiguration> instanceSupplier = getValidatorComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(ValidatorComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureValidatorComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureValidatorComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(ValidatorComponentAutoConfiguration.class, "configureValidatorComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ValidatorComponentAutoConfiguration.class).configureValidatorComponent());
  }

  /**
   * Get the bean definition for 'configureValidatorComponent'.
   */
  public static BeanDefinition getConfigureValidatorComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureValidatorComponentInstanceSupplier());
    return beanDefinition;
  }
}
