package org.apache.camel.component.dataset.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataSetTestComponentAutoConfiguration}.
 */
@Generated
public class DataSetTestComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.dataset.springboot.DataSetTestComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<DataSetTestComponentAutoConfiguration> getDataSetTestComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DataSetTestComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new DataSetTestComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'dataSetTestComponentAutoConfiguration'.
   */
  public static BeanDefinition getDataSetTestComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSetTestComponentAutoConfiguration.class);
    InstanceSupplier<DataSetTestComponentAutoConfiguration> instanceSupplier = getDataSetTestComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(DataSetTestComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureDataSetTestComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureDataSetTestComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(DataSetTestComponentAutoConfiguration.class, "configureDataSetTestComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(DataSetTestComponentAutoConfiguration.class).configureDataSetTestComponent());
  }

  /**
   * Get the bean definition for 'configureDataSetTestComponent'.
   */
  public static BeanDefinition getConfigureDataSetTestComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureDataSetTestComponentInstanceSupplier());
    return beanDefinition;
  }
}
