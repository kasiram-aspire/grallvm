package org.apache.camel.component.xslt.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link XsltComponentConverter}.
 */
@Generated
public class XsltComponentConverter__BeanDefinitions {
  /**
   * Get the bean definition for 'xsltComponentConverter'.
   */
  public static BeanDefinition getXsltComponentConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(XsltComponentConverter.class);
    InstanceSupplier<XsltComponentConverter> instanceSupplier = InstanceSupplier.using(XsltComponentConverter::new);
    instanceSupplier = instanceSupplier.andThen(XsltComponentConverter__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
