package org.apache.camel.language.simple.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.LanguageCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SimpleLanguageAutoConfiguration}.
 */
@Generated
public class SimpleLanguageAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.language.simple.springboot.SimpleLanguageAutoConfiguration'.
   */
  private static BeanInstanceSupplier<SimpleLanguageAutoConfiguration> getSimpleLanguageAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SimpleLanguageAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new SimpleLanguageAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'simpleLanguageAutoConfiguration'.
   */
  public static BeanDefinition getSimpleLanguageAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SimpleLanguageAutoConfiguration.class);
    InstanceSupplier<SimpleLanguageAutoConfiguration> instanceSupplier = getSimpleLanguageAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(SimpleLanguageAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureSimpleLanguage'.
   */
  private static BeanInstanceSupplier<LanguageCustomizer> getConfigureSimpleLanguageInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LanguageCustomizer>forFactoryMethod(SimpleLanguageAutoConfiguration.class, "configureSimpleLanguage")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(SimpleLanguageAutoConfiguration.class).configureSimpleLanguage());
  }

  /**
   * Get the bean definition for 'configureSimpleLanguage'.
   */
  public static BeanDefinition getConfigureSimpleLanguageBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LanguageCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureSimpleLanguageInstanceSupplier());
    return beanDefinition;
  }
}
