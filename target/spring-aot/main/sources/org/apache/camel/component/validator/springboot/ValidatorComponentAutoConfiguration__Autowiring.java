package org.apache.camel.component.validator.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ValidatorComponentAutoConfiguration}.
 */
@Generated
public class ValidatorComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ValidatorComponentAutoConfiguration apply(RegisteredBean registeredBean,
      ValidatorComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
