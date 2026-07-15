package org.apache.camel.component.timer.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link TimerComponentAutoConfiguration}.
 */
@Generated
public class TimerComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static TimerComponentAutoConfiguration apply(RegisteredBean registeredBean,
      TimerComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
