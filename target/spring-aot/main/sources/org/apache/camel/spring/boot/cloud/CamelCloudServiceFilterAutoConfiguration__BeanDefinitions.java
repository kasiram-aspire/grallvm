package org.apache.camel.spring.boot.cloud;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelCloudServiceFilterAutoConfiguration}.
 */
@Generated
public class CamelCloudServiceFilterAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'camelCloudServiceFilterAutoConfiguration'.
   */
  public static BeanDefinition getCamelCloudServiceFilterAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelCloudServiceFilterAutoConfiguration.class);
    beanDefinition.setInitMethodNames("addServiceFilterConfigurations");
    InstanceSupplier<CamelCloudServiceFilterAutoConfiguration> instanceSupplier = InstanceSupplier.using(CamelCloudServiceFilterAutoConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(CamelCloudServiceFilterAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'service-filter'.
   */
  private static BeanInstanceSupplier<CamelCloudServiceFilter> getServicefilterInstanceSupplier() {
    return BeanInstanceSupplier.<CamelCloudServiceFilter>forFactoryMethod(CamelCloudServiceFilterAutoConfiguration.class, "serviceFilter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CamelCloudServiceFilterAutoConfiguration.class).serviceFilter());
  }

  /**
   * Get the bean definition for 'service-filter'.
   */
  public static BeanDefinition getServicefilterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelCloudServiceFilter.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getServicefilterInstanceSupplier());
    return beanDefinition;
  }
}
