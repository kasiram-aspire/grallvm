package org.apache.camel.component.dataset.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataSetComponentConverter}.
 */
@Generated
public class DataSetComponentConverter__BeanDefinitions {
  /**
   * Get the bean definition for 'dataSetComponentConverter'.
   */
  public static BeanDefinition getDataSetComponentConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSetComponentConverter.class);
    InstanceSupplier<DataSetComponentConverter> instanceSupplier = InstanceSupplier.using(DataSetComponentConverter::new);
    instanceSupplier = instanceSupplier.andThen(DataSetComponentConverter__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
