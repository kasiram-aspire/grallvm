package org.apache.camel.component.platform.http.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PlatformHttpComponentAutoConfiguration}.
 */
@Generated
public class PlatformHttpComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.platform.http.springboot.PlatformHttpComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<PlatformHttpComponentAutoConfiguration> getPlatformHttpComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PlatformHttpComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new PlatformHttpComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'platformHttpComponentAutoConfiguration'.
   */
  public static BeanDefinition getPlatformHttpComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PlatformHttpComponentAutoConfiguration.class);
    InstanceSupplier<PlatformHttpComponentAutoConfiguration> instanceSupplier = getPlatformHttpComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(PlatformHttpComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configurePlatformHttpComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigurePlatformHttpComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(PlatformHttpComponentAutoConfiguration.class, "configurePlatformHttpComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(PlatformHttpComponentAutoConfiguration.class).configurePlatformHttpComponent());
  }

  /**
   * Get the bean definition for 'configurePlatformHttpComponent'.
   */
  public static BeanDefinition getConfigurePlatformHttpComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigurePlatformHttpComponentInstanceSupplier());
    return beanDefinition;
  }
}
