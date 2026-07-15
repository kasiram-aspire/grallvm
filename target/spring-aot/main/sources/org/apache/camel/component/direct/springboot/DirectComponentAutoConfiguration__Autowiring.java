package org.apache.camel.component.direct.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link DirectComponentAutoConfiguration}.
 */
@Generated
public class DirectComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static DirectComponentAutoConfiguration apply(RegisteredBean registeredBean,
      DirectComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
