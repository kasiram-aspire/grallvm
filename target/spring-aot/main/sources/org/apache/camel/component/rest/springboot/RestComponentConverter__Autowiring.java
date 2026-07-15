package org.apache.camel.component.rest.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link RestComponentConverter}.
 */
@Generated
public class RestComponentConverter__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static RestComponentConverter apply(RegisteredBean registeredBean,
      RestComponentConverter instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
