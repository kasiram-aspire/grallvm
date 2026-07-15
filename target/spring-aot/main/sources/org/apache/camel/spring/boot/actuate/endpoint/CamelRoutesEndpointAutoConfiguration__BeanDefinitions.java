package org.apache.camel.spring.boot.actuate.endpoint;

import org.apache.camel.CamelContext;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelRoutesEndpointAutoConfiguration}.
 */
@Generated
public class CamelRoutesEndpointAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'camelRoutesEndpointAutoConfiguration'.
   */
  public static BeanDefinition getCamelRoutesEndpointAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelRoutesEndpointAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(CamelRoutesEndpointAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'camelEndpoint'.
   */
  private static BeanInstanceSupplier<CamelRoutesEndpoint> getCamelEndpointInstanceSupplier() {
    return BeanInstanceSupplier.<CamelRoutesEndpoint>forFactoryMethod(CamelRoutesEndpointAutoConfiguration.class, "camelEndpoint", CamelContext.class, CamelRoutesEndpointProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CamelRoutesEndpointAutoConfiguration.class).camelEndpoint(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'camelEndpoint'.
   */
  public static BeanDefinition getCamelEndpointBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelRoutesEndpoint.class);
    beanDefinition.setInstanceSupplier(getCamelEndpointInstanceSupplier());
    return beanDefinition;
  }
}
