package org.apache.camel.component.direct.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DirectComponentAutoConfiguration}.
 */
@Generated
public class DirectComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.direct.springboot.DirectComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<DirectComponentAutoConfiguration> getDirectComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DirectComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new DirectComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'directComponentAutoConfiguration'.
   */
  public static BeanDefinition getDirectComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DirectComponentAutoConfiguration.class);
    InstanceSupplier<DirectComponentAutoConfiguration> instanceSupplier = getDirectComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(DirectComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureDirectComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureDirectComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(DirectComponentAutoConfiguration.class, "configureDirectComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(DirectComponentAutoConfiguration.class).configureDirectComponent());
  }

  /**
   * Get the bean definition for 'configureDirectComponent'.
   */
  public static BeanDefinition getConfigureDirectComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureDirectComponentInstanceSupplier());
    return beanDefinition;
  }
}
