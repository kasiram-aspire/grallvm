package org.apache.camel.component.rest.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link RestApiComponentAutoConfiguration}.
 */
@Generated
public class RestApiComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static RestApiComponentAutoConfiguration apply(RegisteredBean registeredBean,
      RestApiComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
