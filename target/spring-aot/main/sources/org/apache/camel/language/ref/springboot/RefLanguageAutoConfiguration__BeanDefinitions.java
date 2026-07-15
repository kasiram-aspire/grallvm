package org.apache.camel.language.ref.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.LanguageCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RefLanguageAutoConfiguration}.
 */
@Generated
public class RefLanguageAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.language.ref.springboot.RefLanguageAutoConfiguration'.
   */
  private static BeanInstanceSupplier<RefLanguageAutoConfiguration> getRefLanguageAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RefLanguageAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new RefLanguageAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'refLanguageAutoConfiguration'.
   */
  public static BeanDefinition getRefLanguageAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RefLanguageAutoConfiguration.class);
    InstanceSupplier<RefLanguageAutoConfiguration> instanceSupplier = getRefLanguageAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(RefLanguageAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureRefLanguage'.
   */
  private static BeanInstanceSupplier<LanguageCustomizer> getConfigureRefLanguageInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LanguageCustomizer>forFactoryMethod(RefLanguageAutoConfiguration.class, "configureRefLanguage")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RefLanguageAutoConfiguration.class).configureRefLanguage());
  }

  /**
   * Get the bean definition for 'configureRefLanguage'.
   */
  public static BeanDefinition getConfigureRefLanguageBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LanguageCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureRefLanguageInstanceSupplier());
    return beanDefinition;
  }
}
