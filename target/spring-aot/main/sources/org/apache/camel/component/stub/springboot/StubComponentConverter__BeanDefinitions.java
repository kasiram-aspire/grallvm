package org.apache.camel.component.stub.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link StubComponentConverter}.
 */
@Generated
public class StubComponentConverter__BeanDefinitions {
  /**
   * Get the bean definition for 'stubComponentConverter'.
   */
  public static BeanDefinition getStubComponentConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(StubComponentConverter.class);
    InstanceSupplier<StubComponentConverter> instanceSupplier = InstanceSupplier.using(StubComponentConverter::new);
    instanceSupplier = instanceSupplier.andThen(StubComponentConverter__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
