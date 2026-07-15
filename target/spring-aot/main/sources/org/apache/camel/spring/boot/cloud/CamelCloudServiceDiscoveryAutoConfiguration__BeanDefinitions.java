package org.apache.camel.spring.boot.cloud;

import java.lang.SuppressWarnings;
import java.util.List;
import org.apache.camel.cloud.ServiceDiscovery;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelCloudServiceDiscoveryAutoConfiguration}.
 */
@Generated
public class CamelCloudServiceDiscoveryAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'camelCloudServiceDiscoveryAutoConfiguration'.
   */
  public static BeanDefinition getCamelCloudServiceDiscoveryAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelCloudServiceDiscoveryAutoConfiguration.class);
    beanDefinition.setInitMethodNames("addServiceDiscoveryConfigurations");
    InstanceSupplier<CamelCloudServiceDiscoveryAutoConfiguration> instanceSupplier = InstanceSupplier.using(CamelCloudServiceDiscoveryAutoConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(CamelCloudServiceDiscoveryAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'static-service-discovery'.
   */
  @SuppressWarnings("deprecation")
  private static BeanInstanceSupplier<ServiceDiscovery> getStaticservicediscoveryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ServiceDiscovery>forFactoryMethod(CamelCloudServiceDiscoveryAutoConfiguration.class, "staticServiceDiscovery")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CamelCloudServiceDiscoveryAutoConfiguration.class).staticServiceDiscovery());
  }

  /**
   * Get the bean definition for 'static-service-discovery'.
   */
  @SuppressWarnings("deprecation")
  public static BeanDefinition getStaticservicediscoveryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServiceDiscovery.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getStaticservicediscoveryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'service-discovery'.
   */
  private static BeanInstanceSupplier<CamelCloudServiceDiscovery> getServicediscoveryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CamelCloudServiceDiscovery>forFactoryMethod(CamelCloudServiceDiscoveryAutoConfiguration.class, "serviceDiscovery", List.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CamelCloudServiceDiscoveryAutoConfiguration.class).serviceDiscovery(args.get(0)));
  }

  /**
   * Get the bean definition for 'service-discovery'.
   */
  public static BeanDefinition getServicediscoveryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelCloudServiceDiscovery.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getServicediscoveryInstanceSupplier());
    return beanDefinition;
  }
}
