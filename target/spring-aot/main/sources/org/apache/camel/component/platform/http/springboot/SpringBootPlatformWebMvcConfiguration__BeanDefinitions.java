package org.apache.camel.component.platform.http.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link SpringBootPlatformWebMvcConfiguration}.
 */
@Generated
public class SpringBootPlatformWebMvcConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.platform.http.springboot.SpringBootPlatformWebMvcConfiguration'.
   */
  private static BeanInstanceSupplier<SpringBootPlatformWebMvcConfiguration> getSpringBootPlatformWebMvcConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SpringBootPlatformWebMvcConfiguration>forConstructor(PlatformHttpComponentConfiguration.class, WebMvcProperties.class)
            .withGenerator((registeredBean, args) -> new SpringBootPlatformWebMvcConfiguration$$SpringCGLIB$$0(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'springBootPlatformWebMvcConfiguration'.
   */
  public static BeanDefinition getSpringBootPlatformWebMvcConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringBootPlatformWebMvcConfiguration.class);
    beanDefinition.setTargetType(SpringBootPlatformWebMvcConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(SpringBootPlatformWebMvcConfiguration.class);
    beanDefinition.setInstanceSupplier(getSpringBootPlatformWebMvcConfigurationInstanceSupplier());
    return beanDefinition;
  }
}
