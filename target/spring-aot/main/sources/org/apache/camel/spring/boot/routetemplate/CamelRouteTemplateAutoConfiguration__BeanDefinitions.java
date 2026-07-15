package org.apache.camel.spring.boot.routetemplate;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.RouteTemplateParameterSource;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelRouteTemplateAutoConfiguration}.
 */
@Generated
public class CamelRouteTemplateAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'camelRouteTemplateAutoConfiguration'.
   */
  public static BeanDefinition getCamelRouteTemplateAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelRouteTemplateAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(CamelRouteTemplateAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'routeTemplate'.
   */
  private static BeanInstanceSupplier<RouteTemplateParameterSource> getRouteTemplateInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RouteTemplateParameterSource>forFactoryMethod(CamelRouteTemplateAutoConfiguration.class, "routeTemplate", CamelContext.class, CamelRouteTemplateConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CamelRouteTemplateAutoConfiguration.class).routeTemplate(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'routeTemplate'.
   */
  public static BeanDefinition getRouteTemplateBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RouteTemplateParameterSource.class);
    beanDefinition.setInstanceSupplier(getRouteTemplateInstanceSupplier());
    return beanDefinition;
  }
}
