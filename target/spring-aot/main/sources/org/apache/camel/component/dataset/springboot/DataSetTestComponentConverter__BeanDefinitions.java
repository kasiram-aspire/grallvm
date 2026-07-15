package org.apache.camel.component.dataset.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataSetTestComponentConverter}.
 */
@Generated
public class DataSetTestComponentConverter__BeanDefinitions {
  /**
   * Get the bean definition for 'dataSetTestComponentConverter'.
   */
  public static BeanDefinition getDataSetTestComponentConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSetTestComponentConverter.class);
    InstanceSupplier<DataSetTestComponentConverter> instanceSupplier = InstanceSupplier.using(DataSetTestComponentConverter::new);
    instanceSupplier = instanceSupplier.andThen(DataSetTestComponentConverter__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
