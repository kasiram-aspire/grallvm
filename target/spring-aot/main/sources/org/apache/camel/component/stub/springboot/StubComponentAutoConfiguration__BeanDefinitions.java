package org.apache.camel.component.stub.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link StubComponentAutoConfiguration}.
 */
@Generated
public class StubComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.stub.springboot.StubComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<StubComponentAutoConfiguration> getStubComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<StubComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new StubComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'stubComponentAutoConfiguration'.
   */
  public static BeanDefinition getStubComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(StubComponentAutoConfiguration.class);
    InstanceSupplier<StubComponentAutoConfiguration> instanceSupplier = getStubComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(StubComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureStubComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureStubComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(StubComponentAutoConfiguration.class, "configureStubComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(StubComponentAutoConfiguration.class).configureStubComponent());
  }

  /**
   * Get the bean definition for 'configureStubComponent'.
   */
  public static BeanDefinition getConfigureStubComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureStubComponentInstanceSupplier());
    return beanDefinition;
  }
}
