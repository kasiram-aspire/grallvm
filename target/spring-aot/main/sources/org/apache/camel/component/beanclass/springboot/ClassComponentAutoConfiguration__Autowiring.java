package org.apache.camel.component.beanclass.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ClassComponentAutoConfiguration}.
 */
@Generated
public class ClassComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ClassComponentAutoConfiguration apply(RegisteredBean registeredBean,
      ClassComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
