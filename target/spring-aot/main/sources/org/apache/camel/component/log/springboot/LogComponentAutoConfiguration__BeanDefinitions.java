package org.apache.camel.component.log.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LogComponentAutoConfiguration}.
 */
@Generated
public class LogComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.log.springboot.LogComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<LogComponentAutoConfiguration> getLogComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LogComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new LogComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'logComponentAutoConfiguration'.
   */
  public static BeanDefinition getLogComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LogComponentAutoConfiguration.class);
    InstanceSupplier<LogComponentAutoConfiguration> instanceSupplier = getLogComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(LogComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureLogComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureLogComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(LogComponentAutoConfiguration.class, "configureLogComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(LogComponentAutoConfiguration.class).configureLogComponent());
  }

  /**
   * Get the bean definition for 'configureLogComponent'.
   */
  public static BeanDefinition getConfigureLogComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureLogComponentInstanceSupplier());
    return beanDefinition;
  }
}
