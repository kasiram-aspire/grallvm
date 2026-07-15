package org.apache.camel.component.mock.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link MockComponentConverter}.
 */
@Generated
public class MockComponentConverter__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static MockComponentConverter apply(RegisteredBean registeredBean,
      MockComponentConverter instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
