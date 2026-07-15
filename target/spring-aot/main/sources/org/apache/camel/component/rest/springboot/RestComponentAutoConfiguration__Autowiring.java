package org.apache.camel.component.rest.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link RestComponentAutoConfiguration}.
 */
@Generated
public class RestComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static RestComponentAutoConfiguration apply(RegisteredBean registeredBean,
      RestComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
