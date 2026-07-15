package org.apache.camel.component.timer.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TimerComponentAutoConfiguration}.
 */
@Generated
public class TimerComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.timer.springboot.TimerComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<TimerComponentAutoConfiguration> getTimerComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TimerComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new TimerComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'timerComponentAutoConfiguration'.
   */
  public static BeanDefinition getTimerComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TimerComponentAutoConfiguration.class);
    InstanceSupplier<TimerComponentAutoConfiguration> instanceSupplier = getTimerComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(TimerComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureTimerComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureTimerComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(TimerComponentAutoConfiguration.class, "configureTimerComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TimerComponentAutoConfiguration.class).configureTimerComponent());
  }

  /**
   * Get the bean definition for 'configureTimerComponent'.
   */
  public static BeanDefinition getConfigureTimerComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureTimerComponentInstanceSupplier());
    return beanDefinition;
  }
}
