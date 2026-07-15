package org.apache.camel.component.saga.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SagaComponentAutoConfiguration}.
 */
@Generated
public class SagaComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.saga.springboot.SagaComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<SagaComponentAutoConfiguration> getSagaComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SagaComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new SagaComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'sagaComponentAutoConfiguration'.
   */
  public static BeanDefinition getSagaComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SagaComponentAutoConfiguration.class);
    InstanceSupplier<SagaComponentAutoConfiguration> instanceSupplier = getSagaComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(SagaComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureSagaComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureSagaComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(SagaComponentAutoConfiguration.class, "configureSagaComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(SagaComponentAutoConfiguration.class).configureSagaComponent());
  }

  /**
   * Get the bean definition for 'configureSagaComponent'.
   */
  public static BeanDefinition getConfigureSagaComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureSagaComponentInstanceSupplier());
    return beanDefinition;
  }
}
