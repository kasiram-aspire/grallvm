package org.apache.camel.component.saga.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link SagaComponentAutoConfiguration}.
 */
@Generated
public class SagaComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static SagaComponentAutoConfiguration apply(RegisteredBean registeredBean,
      SagaComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
