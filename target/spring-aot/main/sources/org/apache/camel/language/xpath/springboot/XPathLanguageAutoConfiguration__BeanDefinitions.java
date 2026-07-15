package org.apache.camel.language.xpath.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.LanguageCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link XPathLanguageAutoConfiguration}.
 */
@Generated
public class XPathLanguageAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.language.xpath.springboot.XPathLanguageAutoConfiguration'.
   */
  private static BeanInstanceSupplier<XPathLanguageAutoConfiguration> getXPathLanguageAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<XPathLanguageAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new XPathLanguageAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'xPathLanguageAutoConfiguration'.
   */
  public static BeanDefinition getXPathLanguageAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(XPathLanguageAutoConfiguration.class);
    InstanceSupplier<XPathLanguageAutoConfiguration> instanceSupplier = getXPathLanguageAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(XPathLanguageAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureXPathLanguage'.
   */
  private static BeanInstanceSupplier<LanguageCustomizer> getConfigureXPathLanguageInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LanguageCustomizer>forFactoryMethod(XPathLanguageAutoConfiguration.class, "configureXPathLanguage")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(XPathLanguageAutoConfiguration.class).configureXPathLanguage());
  }

  /**
   * Get the bean definition for 'configureXPathLanguage'.
   */
  public static BeanDefinition getConfigureXPathLanguageBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LanguageCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureXPathLanguageInstanceSupplier());
    return beanDefinition;
  }
}
