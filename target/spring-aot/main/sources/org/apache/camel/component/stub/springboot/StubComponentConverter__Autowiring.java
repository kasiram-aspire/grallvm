package org.apache.camel.component.stub.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link StubComponentConverter}.
 */
@Generated
public class StubComponentConverter__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static StubComponentConverter apply(RegisteredBean registeredBean,
      StubComponentConverter instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
