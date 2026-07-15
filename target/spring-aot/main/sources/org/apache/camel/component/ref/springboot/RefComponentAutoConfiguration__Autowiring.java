package org.apache.camel.component.ref.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link RefComponentAutoConfiguration}.
 */
@Generated
public class RefComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static RefComponentAutoConfiguration apply(RegisteredBean registeredBean,
      RefComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
