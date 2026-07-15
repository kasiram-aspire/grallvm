package org.apache.camel.component.dataformat.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataFormatComponentAutoConfiguration}.
 */
@Generated
public class DataFormatComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.dataformat.springboot.DataFormatComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<DataFormatComponentAutoConfiguration> getDataFormatComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DataFormatComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new DataFormatComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'dataFormatComponentAutoConfiguration'.
   */
  public static BeanDefinition getDataFormatComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataFormatComponentAutoConfiguration.class);
    InstanceSupplier<DataFormatComponentAutoConfiguration> instanceSupplier = getDataFormatComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(DataFormatComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureDataFormatComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureDataFormatComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(DataFormatComponentAutoConfiguration.class, "configureDataFormatComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(DataFormatComponentAutoConfiguration.class).configureDataFormatComponent());
  }

  /**
   * Get the bean definition for 'configureDataFormatComponent'.
   */
  public static BeanDefinition getConfigureDataFormatComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureDataFormatComponentInstanceSupplier());
    return beanDefinition;
  }
}
