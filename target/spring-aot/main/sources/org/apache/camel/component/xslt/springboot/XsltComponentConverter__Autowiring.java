package org.apache.camel.component.xslt.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link XsltComponentConverter}.
 */
@Generated
public class XsltComponentConverter__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static XsltComponentConverter apply(RegisteredBean registeredBean,
      XsltComponentConverter instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
