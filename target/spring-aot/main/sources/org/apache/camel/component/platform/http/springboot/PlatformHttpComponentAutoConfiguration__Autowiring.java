package org.apache.camel.component.platform.http.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link PlatformHttpComponentAutoConfiguration}.
 */
@Generated
public class PlatformHttpComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static PlatformHttpComponentAutoConfiguration apply(RegisteredBean registeredBean,
      PlatformHttpComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
