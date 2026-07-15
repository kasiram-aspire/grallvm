package org.apache.camel.component.scheduler.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SchedulerComponentAutoConfiguration}.
 */
@Generated
public class SchedulerComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.scheduler.springboot.SchedulerComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<SchedulerComponentAutoConfiguration> getSchedulerComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SchedulerComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new SchedulerComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'schedulerComponentAutoConfiguration'.
   */
  public static BeanDefinition getSchedulerComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SchedulerComponentAutoConfiguration.class);
    InstanceSupplier<SchedulerComponentAutoConfiguration> instanceSupplier = getSchedulerComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(SchedulerComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureSchedulerComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureSchedulerComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(SchedulerComponentAutoConfiguration.class, "configureSchedulerComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(SchedulerComponentAutoConfiguration.class).configureSchedulerComponent());
  }

  /**
   * Get the bean definition for 'configureSchedulerComponent'.
   */
  public static BeanDefinition getConfigureSchedulerComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureSchedulerComponentInstanceSupplier());
    return beanDefinition;
  }
}
