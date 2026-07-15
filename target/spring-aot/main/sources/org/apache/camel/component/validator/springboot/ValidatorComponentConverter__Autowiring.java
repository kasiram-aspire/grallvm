package org.apache.camel.component.validator.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ValidatorComponentConverter}.
 */
@Generated
public class ValidatorComponentConverter__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ValidatorComponentConverter apply(RegisteredBean registeredBean,
      ValidatorComponentConverter instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
