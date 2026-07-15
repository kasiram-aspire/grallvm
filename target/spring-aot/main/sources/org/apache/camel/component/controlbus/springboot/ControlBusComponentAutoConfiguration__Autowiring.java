package org.apache.camel.component.controlbus.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ControlBusComponentAutoConfiguration}.
 */
@Generated
public class ControlBusComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ControlBusComponentAutoConfiguration apply(RegisteredBean registeredBean,
      ControlBusComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
