package org.apache.camel.spring.boot.cloud;

import java.lang.SuppressWarnings;
import org.apache.camel.model.cloud.ServiceCallConfigurationDefinition;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelCloudServiceCallConfigurationAutoConfiguration}.
 */
@Generated
public class CamelCloudServiceCallConfigurationAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'camelCloudServiceCallConfigurationAutoConfiguration'.
   */
  public static BeanDefinition getCamelCloudServiceCallConfigurationAutoConfigurationBeanDefinition(
      ) {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelCloudServiceCallConfigurationAutoConfiguration.class);
    InstanceSupplier<CamelCloudServiceCallConfigurationAutoConfiguration> instanceSupplier = InstanceSupplier.using(CamelCloudServiceCallConfigurationAutoConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(CamelCloudServiceCallConfigurationAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'service-call-configuration'.
   */
  @SuppressWarnings("deprecation")
  private static BeanInstanceSupplier<ServiceCallConfigurationDefinition> getServicecallconfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ServiceCallConfigurationDefinition>forFactoryMethod(CamelCloudServiceCallConfigurationAutoConfiguration.class, "serviceCallConfiguration")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CamelCloudServiceCallConfigurationAutoConfiguration.class).serviceCallConfiguration());
  }

  /**
   * Get the bean definition for 'service-call-configuration'.
   */
  @SuppressWarnings("deprecation")
  public static BeanDefinition getServicecallconfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServiceCallConfigurationDefinition.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getServicecallconfigurationInstanceSupplier());
    return beanDefinition;
  }
}
