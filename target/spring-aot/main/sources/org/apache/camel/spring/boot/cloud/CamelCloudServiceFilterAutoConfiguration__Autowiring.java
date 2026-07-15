package org.apache.camel.spring.boot.cloud;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link CamelCloudServiceFilterAutoConfiguration}.
 */
@Generated
public class CamelCloudServiceFilterAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static CamelCloudServiceFilterAutoConfiguration apply(RegisteredBean registeredBean,
      CamelCloudServiceFilterAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("camelContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configurationProperties").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
