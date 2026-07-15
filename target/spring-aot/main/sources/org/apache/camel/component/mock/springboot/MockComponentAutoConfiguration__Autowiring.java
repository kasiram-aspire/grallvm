package org.apache.camel.component.mock.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link MockComponentAutoConfiguration}.
 */
@Generated
public class MockComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static MockComponentAutoConfiguration apply(RegisteredBean registeredBean,
      MockComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
