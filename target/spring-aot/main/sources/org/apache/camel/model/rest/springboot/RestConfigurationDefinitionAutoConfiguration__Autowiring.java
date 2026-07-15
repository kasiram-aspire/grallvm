package org.apache.camel.model.rest.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link RestConfigurationDefinitionAutoConfiguration}.
 */
@Generated
public class RestConfigurationDefinitionAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static RestConfigurationDefinitionAutoConfiguration apply(RegisteredBean registeredBean,
      RestConfigurationDefinitionAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("camelContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("config").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
