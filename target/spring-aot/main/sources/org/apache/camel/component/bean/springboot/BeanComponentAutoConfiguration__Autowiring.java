package org.apache.camel.component.bean.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link BeanComponentAutoConfiguration}.
 */
@Generated
public class BeanComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static BeanComponentAutoConfiguration apply(RegisteredBean registeredBean,
      BeanComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
