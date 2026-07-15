package org.apache.camel.component.seda.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SedaComponentAutoConfiguration}.
 */
@Generated
public class SedaComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.seda.springboot.SedaComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<SedaComponentAutoConfiguration> getSedaComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SedaComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new SedaComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'sedaComponentAutoConfiguration'.
   */
  public static BeanDefinition getSedaComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SedaComponentAutoConfiguration.class);
    InstanceSupplier<SedaComponentAutoConfiguration> instanceSupplier = getSedaComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(SedaComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureSedaComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureSedaComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(SedaComponentAutoConfiguration.class, "configureSedaComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(SedaComponentAutoConfiguration.class).configureSedaComponent());
  }

  /**
   * Get the bean definition for 'configureSedaComponent'.
   */
  public static BeanDefinition getConfigureSedaComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureSedaComponentInstanceSupplier());
    return beanDefinition;
  }
}
