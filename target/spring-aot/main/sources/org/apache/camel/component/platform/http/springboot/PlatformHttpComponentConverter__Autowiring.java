package org.apache.camel.component.platform.http.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link PlatformHttpComponentConverter}.
 */
@Generated
public class PlatformHttpComponentConverter__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static PlatformHttpComponentConverter apply(RegisteredBean registeredBean,
      PlatformHttpComponentConverter instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
