package org.apache.camel.component.xslt.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link XsltComponentAutoConfiguration}.
 */
@Generated
public class XsltComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static XsltComponentAutoConfiguration apply(RegisteredBean registeredBean,
      XsltComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
