package org.apache.camel.language.property.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.LanguageCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ExchangePropertyLanguageAutoConfiguration}.
 */
@Generated
public class ExchangePropertyLanguageAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.language.property.springboot.ExchangePropertyLanguageAutoConfiguration'.
   */
  private static BeanInstanceSupplier<ExchangePropertyLanguageAutoConfiguration> getExchangePropertyLanguageAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ExchangePropertyLanguageAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new ExchangePropertyLanguageAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'exchangePropertyLanguageAutoConfiguration'.
   */
  public static BeanDefinition getExchangePropertyLanguageAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ExchangePropertyLanguageAutoConfiguration.class);
    InstanceSupplier<ExchangePropertyLanguageAutoConfiguration> instanceSupplier = getExchangePropertyLanguageAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(ExchangePropertyLanguageAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureExchangePropertyLanguage'.
   */
  private static BeanInstanceSupplier<LanguageCustomizer> getConfigureExchangePropertyLanguageInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LanguageCustomizer>forFactoryMethod(ExchangePropertyLanguageAutoConfiguration.class, "configureExchangePropertyLanguage")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ExchangePropertyLanguageAutoConfiguration.class).configureExchangePropertyLanguage());
  }

  /**
   * Get the bean definition for 'configureExchangePropertyLanguage'.
   */
  public static BeanDefinition getConfigureExchangePropertyLanguageBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LanguageCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureExchangePropertyLanguageInstanceSupplier());
    return beanDefinition;
  }
}
