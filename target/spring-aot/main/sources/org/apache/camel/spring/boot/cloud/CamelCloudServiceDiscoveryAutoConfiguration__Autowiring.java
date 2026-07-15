package org.apache.camel.spring.boot.cloud;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link CamelCloudServiceDiscoveryAutoConfiguration}.
 */
@Generated
public class CamelCloudServiceDiscoveryAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static CamelCloudServiceDiscoveryAutoConfiguration apply(RegisteredBean registeredBean,
      CamelCloudServiceDiscoveryAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("camelContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configurationProperties").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
