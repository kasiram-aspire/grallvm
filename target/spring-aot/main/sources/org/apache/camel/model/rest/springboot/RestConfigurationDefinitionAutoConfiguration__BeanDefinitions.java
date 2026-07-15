package org.apache.camel.model.rest.springboot;

import org.apache.camel.spi.RestConfiguration;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RestConfigurationDefinitionAutoConfiguration}.
 */
@Generated
public class RestConfigurationDefinitionAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'restConfigurationDefinitionAutoConfiguration'.
   */
  public static BeanDefinition getRestConfigurationDefinitionAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestConfigurationDefinitionAutoConfiguration.class);
    InstanceSupplier<RestConfigurationDefinitionAutoConfiguration> instanceSupplier = InstanceSupplier.using(RestConfigurationDefinitionAutoConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(RestConfigurationDefinitionAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'rest-configuration'.
   */
  private static BeanInstanceSupplier<RestConfiguration> getRestconfigurationInstanceSupplier() {
    return BeanInstanceSupplier.<RestConfiguration>forFactoryMethod(RestConfigurationDefinitionAutoConfiguration.class, "configureRestConfigurationDefinition")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RestConfigurationDefinitionAutoConfiguration.class).configureRestConfigurationDefinition());
  }

  /**
   * Get the bean definition for 'rest-configuration'.
   */
  public static BeanDefinition getRestconfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestConfiguration.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getRestconfigurationInstanceSupplier());
    return beanDefinition;
  }
}
