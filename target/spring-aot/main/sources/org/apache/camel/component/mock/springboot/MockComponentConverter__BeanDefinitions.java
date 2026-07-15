package org.apache.camel.component.mock.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MockComponentConverter}.
 */
@Generated
public class MockComponentConverter__BeanDefinitions {
  /**
   * Get the bean definition for 'mockComponentConverter'.
   */
  public static BeanDefinition getMockComponentConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MockComponentConverter.class);
    InstanceSupplier<MockComponentConverter> instanceSupplier = InstanceSupplier.using(MockComponentConverter::new);
    instanceSupplier = instanceSupplier.andThen(MockComponentConverter__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
