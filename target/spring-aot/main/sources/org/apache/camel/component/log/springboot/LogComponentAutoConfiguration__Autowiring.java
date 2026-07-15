package org.apache.camel.component.log.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link LogComponentAutoConfiguration}.
 */
@Generated
public class LogComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static LogComponentAutoConfiguration apply(RegisteredBean registeredBean,
      LogComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
