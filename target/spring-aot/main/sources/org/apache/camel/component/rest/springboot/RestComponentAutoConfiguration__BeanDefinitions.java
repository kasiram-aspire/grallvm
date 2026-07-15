package org.apache.camel.component.rest.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RestComponentAutoConfiguration}.
 */
@Generated
public class RestComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.rest.springboot.RestComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<RestComponentAutoConfiguration> getRestComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RestComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new RestComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'restComponentAutoConfiguration'.
   */
  public static BeanDefinition getRestComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestComponentAutoConfiguration.class);
    InstanceSupplier<RestComponentAutoConfiguration> instanceSupplier = getRestComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(RestComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureRestComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureRestComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(RestComponentAutoConfiguration.class, "configureRestComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RestComponentAutoConfiguration.class).configureRestComponent());
  }

  /**
   * Get the bean definition for 'configureRestComponent'.
   */
  public static BeanDefinition getConfigureRestComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureRestComponentInstanceSupplier());
    return beanDefinition;
  }
}
