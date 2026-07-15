package org.apache.camel.component.bean.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BeanComponentAutoConfiguration}.
 */
@Generated
public class BeanComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.bean.springboot.BeanComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<BeanComponentAutoConfiguration> getBeanComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<BeanComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new BeanComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'beanComponentAutoConfiguration'.
   */
  public static BeanDefinition getBeanComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BeanComponentAutoConfiguration.class);
    InstanceSupplier<BeanComponentAutoConfiguration> instanceSupplier = getBeanComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(BeanComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureBeanComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureBeanComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(BeanComponentAutoConfiguration.class, "configureBeanComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(BeanComponentAutoConfiguration.class).configureBeanComponent());
  }

  /**
   * Get the bean definition for 'configureBeanComponent'.
   */
  public static BeanDefinition getConfigureBeanComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureBeanComponentInstanceSupplier());
    return beanDefinition;
  }
}
