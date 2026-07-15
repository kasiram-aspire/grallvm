package org.apache.camel.spring.boot.actuate.endpoint;

import org.apache.camel.CamelContext;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelRouteControllerEndpointAutoConfiguration}.
 */
@Generated
public class CamelRouteControllerEndpointAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'camelRouteControllerEndpointAutoConfiguration'.
   */
  public static BeanDefinition getCamelRouteControllerEndpointAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelRouteControllerEndpointAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(CamelRouteControllerEndpointAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'routeControllerEndpoint'.
   */
  private static BeanInstanceSupplier<CamelRouteControllerEndpoint> getRouteControllerEndpointInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CamelRouteControllerEndpoint>forFactoryMethod(CamelRouteControllerEndpointAutoConfiguration.class, "routeControllerEndpoint", CamelContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CamelRouteControllerEndpointAutoConfiguration.class).routeControllerEndpoint(args.get(0)));
  }

  /**
   * Get the bean definition for 'routeControllerEndpoint'.
   */
  public static BeanDefinition getRouteControllerEndpointBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelRouteControllerEndpoint.class);
    beanDefinition.setInstanceSupplier(getRouteControllerEndpointInstanceSupplier());
    return beanDefinition;
  }
}
