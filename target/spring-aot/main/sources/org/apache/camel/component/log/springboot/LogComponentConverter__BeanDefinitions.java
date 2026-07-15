package org.apache.camel.component.log.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LogComponentConverter}.
 */
@Generated
public class LogComponentConverter__BeanDefinitions {
  /**
   * Get the bean definition for 'logComponentConverter'.
   */
  public static BeanDefinition getLogComponentConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LogComponentConverter.class);
    InstanceSupplier<LogComponentConverter> instanceSupplier = InstanceSupplier.using(LogComponentConverter::new);
    instanceSupplier = instanceSupplier.andThen(LogComponentConverter__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
