package org.apache.camel.component.file.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link FileComponentAutoConfiguration}.
 */
@Generated
public class FileComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static FileComponentAutoConfiguration apply(RegisteredBean registeredBean,
      FileComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
