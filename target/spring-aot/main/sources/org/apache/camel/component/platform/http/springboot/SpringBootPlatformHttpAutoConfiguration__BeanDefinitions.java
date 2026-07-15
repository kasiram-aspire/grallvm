package org.apache.camel.component.platform.http.springboot;

import java.util.List;
import org.apache.camel.CamelContext;
import org.apache.camel.component.platform.http.spi.PlatformHttpEngine;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.env.Environment;

/**
 * Bean definitions for {@link SpringBootPlatformHttpAutoConfiguration}.
 */
@Generated
public class SpringBootPlatformHttpAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'springBootPlatformHttpAutoConfiguration'.
   */
  public static BeanDefinition getSpringBootPlatformHttpAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringBootPlatformHttpAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(SpringBootPlatformHttpAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'platform-http-engine'.
   */
  private static BeanInstanceSupplier<PlatformHttpEngine> getPlatformhttpengineInstanceSupplier() {
    return BeanInstanceSupplier.<PlatformHttpEngine>forFactoryMethod(SpringBootPlatformHttpAutoConfiguration.class, "springBootPlatformHttpEngine", Environment.class, List.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpringBootPlatformHttpAutoConfiguration.class).springBootPlatformHttpEngine(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'platform-http-engine'.
   */
  public static BeanDefinition getPlatformhttpengineBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PlatformHttpEngine.class);
    beanDefinition.setInstanceSupplier(getPlatformhttpengineInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'platformHttpEngineRequestMapping'.
   */
  private static BeanInstanceSupplier<CamelRequestHandlerMapping> getPlatformHttpEngineRequestMappingInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CamelRequestHandlerMapping>forFactoryMethod(SpringBootPlatformHttpAutoConfiguration.class, "platformHttpEngineRequestMapping", PlatformHttpEngine.class, CamelContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpringBootPlatformHttpAutoConfiguration.class).platformHttpEngineRequestMapping(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'platformHttpEngineRequestMapping'.
   */
  public static BeanDefinition getPlatformHttpEngineRequestMappingBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelRequestHandlerMapping.class);
    beanDefinition.setDependsOn("configurePlatformHttpComponent");
    beanDefinition.setInstanceSupplier(getPlatformHttpEngineRequestMappingInstanceSupplier());
    return beanDefinition;
  }
}
