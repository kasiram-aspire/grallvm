package org.apache.camel.component.controlbus.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ControlBusComponentAutoConfiguration}.
 */
@Generated
public class ControlBusComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.controlbus.springboot.ControlBusComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<ControlBusComponentAutoConfiguration> getControlBusComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ControlBusComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new ControlBusComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'controlBusComponentAutoConfiguration'.
   */
  public static BeanDefinition getControlBusComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ControlBusComponentAutoConfiguration.class);
    InstanceSupplier<ControlBusComponentAutoConfiguration> instanceSupplier = getControlBusComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(ControlBusComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureControlBusComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureControlBusComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(ControlBusComponentAutoConfiguration.class, "configureControlBusComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ControlBusComponentAutoConfiguration.class).configureControlBusComponent());
  }

  /**
   * Get the bean definition for 'configureControlBusComponent'.
   */
  public static BeanDefinition getConfigureControlBusComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureControlBusComponentInstanceSupplier());
    return beanDefinition;
  }
}
