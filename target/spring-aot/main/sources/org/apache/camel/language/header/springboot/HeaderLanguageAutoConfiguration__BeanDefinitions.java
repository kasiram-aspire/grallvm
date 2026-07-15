package org.apache.camel.language.header.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.LanguageCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HeaderLanguageAutoConfiguration}.
 */
@Generated
public class HeaderLanguageAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.language.header.springboot.HeaderLanguageAutoConfiguration'.
   */
  private static BeanInstanceSupplier<HeaderLanguageAutoConfiguration> getHeaderLanguageAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HeaderLanguageAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new HeaderLanguageAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'headerLanguageAutoConfiguration'.
   */
  public static BeanDefinition getHeaderLanguageAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HeaderLanguageAutoConfiguration.class);
    InstanceSupplier<HeaderLanguageAutoConfiguration> instanceSupplier = getHeaderLanguageAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(HeaderLanguageAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureHeaderLanguage'.
   */
  private static BeanInstanceSupplier<LanguageCustomizer> getConfigureHeaderLanguageInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LanguageCustomizer>forFactoryMethod(HeaderLanguageAutoConfiguration.class, "configureHeaderLanguage")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(HeaderLanguageAutoConfiguration.class).configureHeaderLanguage());
  }

  /**
   * Get the bean definition for 'configureHeaderLanguage'.
   */
  public static BeanDefinition getConfigureHeaderLanguageBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LanguageCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureHeaderLanguageInstanceSupplier());
    return beanDefinition;
  }
}
