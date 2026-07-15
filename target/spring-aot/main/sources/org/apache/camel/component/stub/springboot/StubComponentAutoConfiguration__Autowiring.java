package org.apache.camel.component.stub.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link StubComponentAutoConfiguration}.
 */
@Generated
public class StubComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static StubComponentAutoConfiguration apply(RegisteredBean registeredBean,
      StubComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
