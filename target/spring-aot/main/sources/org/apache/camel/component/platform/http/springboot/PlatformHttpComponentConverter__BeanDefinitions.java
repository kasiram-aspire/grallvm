package org.apache.camel.component.platform.http.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PlatformHttpComponentConverter}.
 */
@Generated
public class PlatformHttpComponentConverter__BeanDefinitions {
  /**
   * Get the bean definition for 'platformHttpComponentConverter'.
   */
  public static BeanDefinition getPlatformHttpComponentConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PlatformHttpComponentConverter.class);
    InstanceSupplier<PlatformHttpComponentConverter> instanceSupplier = InstanceSupplier.using(PlatformHttpComponentConverter::new);
    instanceSupplier = instanceSupplier.andThen(PlatformHttpComponentConverter__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
