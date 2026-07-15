package org.apache.camel.component.log.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link LogComponentConverter}.
 */
@Generated
public class LogComponentConverter__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static LogComponentConverter apply(RegisteredBean registeredBean,
      LogComponentConverter instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
