package org.apache.camel.language.xpath.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link XPathLanguageConfiguration}.
 */
@Generated
public class XPathLanguageConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'xPathLanguageConfiguration'.
   */
  public static BeanDefinition getXPathLanguageConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(XPathLanguageConfiguration.class);
    beanDefinition.setInstanceSupplier(XPathLanguageConfiguration::new);
    return beanDefinition;
  }
}
