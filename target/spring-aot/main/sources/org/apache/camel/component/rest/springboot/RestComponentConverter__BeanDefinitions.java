package org.apache.camel.component.rest.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RestComponentConverter}.
 */
@Generated
public class RestComponentConverter__BeanDefinitions {
  /**
   * Get the bean definition for 'restComponentConverter'.
   */
  public static BeanDefinition getRestComponentConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestComponentConverter.class);
    InstanceSupplier<RestComponentConverter> instanceSupplier = InstanceSupplier.using(RestComponentConverter::new);
    instanceSupplier = instanceSupplier.andThen(RestComponentConverter__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
