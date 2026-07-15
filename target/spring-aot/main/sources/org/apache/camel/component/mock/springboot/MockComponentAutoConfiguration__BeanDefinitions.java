package org.apache.camel.component.mock.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MockComponentAutoConfiguration}.
 */
@Generated
public class MockComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.mock.springboot.MockComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<MockComponentAutoConfiguration> getMockComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MockComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new MockComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'mockComponentAutoConfiguration'.
   */
  public static BeanDefinition getMockComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MockComponentAutoConfiguration.class);
    InstanceSupplier<MockComponentAutoConfiguration> instanceSupplier = getMockComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(MockComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureMockComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureMockComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(MockComponentAutoConfiguration.class, "configureMockComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(MockComponentAutoConfiguration.class).configureMockComponent());
  }

  /**
   * Get the bean definition for 'configureMockComponent'.
   */
  public static BeanDefinition getConfigureMockComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureMockComponentInstanceSupplier());
    return beanDefinition;
  }
}
