package org.apache.camel.component.rest.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RestApiComponentAutoConfiguration}.
 */
@Generated
public class RestApiComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.rest.springboot.RestApiComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<RestApiComponentAutoConfiguration> getRestApiComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RestApiComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new RestApiComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'restApiComponentAutoConfiguration'.
   */
  public static BeanDefinition getRestApiComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestApiComponentAutoConfiguration.class);
    InstanceSupplier<RestApiComponentAutoConfiguration> instanceSupplier = getRestApiComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(RestApiComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureRestApiComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureRestApiComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(RestApiComponentAutoConfiguration.class, "configureRestApiComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RestApiComponentAutoConfiguration.class).configureRestApiComponent());
  }

  /**
   * Get the bean definition for 'configureRestApiComponent'.
   */
  public static BeanDefinition getConfigureRestApiComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureRestApiComponentInstanceSupplier());
    return beanDefinition;
  }
}
