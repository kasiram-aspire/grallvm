package org.apache.camel.component.dataset.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataSetComponentAutoConfiguration}.
 */
@Generated
public class DataSetComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.dataset.springboot.DataSetComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<DataSetComponentAutoConfiguration> getDataSetComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DataSetComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new DataSetComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'dataSetComponentAutoConfiguration'.
   */
  public static BeanDefinition getDataSetComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSetComponentAutoConfiguration.class);
    InstanceSupplier<DataSetComponentAutoConfiguration> instanceSupplier = getDataSetComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(DataSetComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureDataSetComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureDataSetComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(DataSetComponentAutoConfiguration.class, "configureDataSetComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(DataSetComponentAutoConfiguration.class).configureDataSetComponent());
  }

  /**
   * Get the bean definition for 'configureDataSetComponent'.
   */
  public static BeanDefinition getConfigureDataSetComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureDataSetComponentInstanceSupplier());
    return beanDefinition;
  }
}
