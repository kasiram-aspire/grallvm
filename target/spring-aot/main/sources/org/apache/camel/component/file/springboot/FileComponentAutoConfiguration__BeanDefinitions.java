package org.apache.camel.component.file.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link FileComponentAutoConfiguration}.
 */
@Generated
public class FileComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.file.springboot.FileComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<FileComponentAutoConfiguration> getFileComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<FileComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new FileComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'fileComponentAutoConfiguration'.
   */
  public static BeanDefinition getFileComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FileComponentAutoConfiguration.class);
    InstanceSupplier<FileComponentAutoConfiguration> instanceSupplier = getFileComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(FileComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureFileComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureFileComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(FileComponentAutoConfiguration.class, "configureFileComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(FileComponentAutoConfiguration.class).configureFileComponent());
  }

  /**
   * Get the bean definition for 'configureFileComponent'.
   */
  public static BeanDefinition getConfigureFileComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureFileComponentInstanceSupplier());
    return beanDefinition;
  }
}
