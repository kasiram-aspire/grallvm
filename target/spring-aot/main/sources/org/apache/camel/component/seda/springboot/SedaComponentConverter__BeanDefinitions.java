package org.apache.camel.component.seda.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SedaComponentConverter}.
 */
@Generated
public class SedaComponentConverter__BeanDefinitions {
  /**
   * Get the bean definition for 'sedaComponentConverter'.
   */
  public static BeanDefinition getSedaComponentConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SedaComponentConverter.class);
    InstanceSupplier<SedaComponentConverter> instanceSupplier = InstanceSupplier.using(SedaComponentConverter::new);
    instanceSupplier = instanceSupplier.andThen(SedaComponentConverter__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
