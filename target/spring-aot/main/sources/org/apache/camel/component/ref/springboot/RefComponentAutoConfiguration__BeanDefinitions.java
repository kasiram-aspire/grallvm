package org.apache.camel.component.ref.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RefComponentAutoConfiguration}.
 */
@Generated
public class RefComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.ref.springboot.RefComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<RefComponentAutoConfiguration> getRefComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RefComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new RefComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'refComponentAutoConfiguration'.
   */
  public static BeanDefinition getRefComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RefComponentAutoConfiguration.class);
    InstanceSupplier<RefComponentAutoConfiguration> instanceSupplier = getRefComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(RefComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureRefComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureRefComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(RefComponentAutoConfiguration.class, "configureRefComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RefComponentAutoConfiguration.class).configureRefComponent());
  }

  /**
   * Get the bean definition for 'configureRefComponent'.
   */
  public static BeanDefinition getConfigureRefComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureRefComponentInstanceSupplier());
    return beanDefinition;
  }
}
