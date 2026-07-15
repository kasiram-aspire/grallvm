package org.apache.camel.language.csimple.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.LanguageCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CSimpleLanguageAutoConfiguration}.
 */
@Generated
public class CSimpleLanguageAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.language.csimple.springboot.CSimpleLanguageAutoConfiguration'.
   */
  private static BeanInstanceSupplier<CSimpleLanguageAutoConfiguration> getCSimpleLanguageAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CSimpleLanguageAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new CSimpleLanguageAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'cSimpleLanguageAutoConfiguration'.
   */
  public static BeanDefinition getCSimpleLanguageAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CSimpleLanguageAutoConfiguration.class);
    InstanceSupplier<CSimpleLanguageAutoConfiguration> instanceSupplier = getCSimpleLanguageAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(CSimpleLanguageAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureCSimpleLanguage'.
   */
  private static BeanInstanceSupplier<LanguageCustomizer> getConfigureCSimpleLanguageInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LanguageCustomizer>forFactoryMethod(CSimpleLanguageAutoConfiguration.class, "configureCSimpleLanguage")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CSimpleLanguageAutoConfiguration.class).configureCSimpleLanguage());
  }

  /**
   * Get the bean definition for 'configureCSimpleLanguage'.
   */
  public static BeanDefinition getConfigureCSimpleLanguageBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LanguageCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureCSimpleLanguageInstanceSupplier());
    return beanDefinition;
  }
}
