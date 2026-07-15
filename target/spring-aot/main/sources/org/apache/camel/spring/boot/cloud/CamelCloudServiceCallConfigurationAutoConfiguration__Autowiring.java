package org.apache.camel.spring.boot.cloud;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link CamelCloudServiceCallConfigurationAutoConfiguration}.
 */
@Generated
public class CamelCloudServiceCallConfigurationAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static CamelCloudServiceCallConfigurationAutoConfiguration apply(
      RegisteredBean registeredBean, CamelCloudServiceCallConfigurationAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("camelContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configurationProperties").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
