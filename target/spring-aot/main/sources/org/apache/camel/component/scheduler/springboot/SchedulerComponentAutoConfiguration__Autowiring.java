package org.apache.camel.component.scheduler.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link SchedulerComponentAutoConfiguration}.
 */
@Generated
public class SchedulerComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static SchedulerComponentAutoConfiguration apply(RegisteredBean registeredBean,
      SchedulerComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
