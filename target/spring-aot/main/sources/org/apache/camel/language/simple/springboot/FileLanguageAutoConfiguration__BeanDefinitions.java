package org.apache.camel.language.simple.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.LanguageCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link FileLanguageAutoConfiguration}.
 */
@Generated
public class FileLanguageAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.language.simple.springboot.FileLanguageAutoConfiguration'.
   */
  private static BeanInstanceSupplier<FileLanguageAutoConfiguration> getFileLanguageAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<FileLanguageAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new FileLanguageAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'fileLanguageAutoConfiguration'.
   */
  public static BeanDefinition getFileLanguageAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FileLanguageAutoConfiguration.class);
    InstanceSupplier<FileLanguageAutoConfiguration> instanceSupplier = getFileLanguageAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(FileLanguageAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureFileLanguage'.
   */
  private static BeanInstanceSupplier<LanguageCustomizer> getConfigureFileLanguageInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LanguageCustomizer>forFactoryMethod(FileLanguageAutoConfiguration.class, "configureFileLanguage")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(FileLanguageAutoConfiguration.class).configureFileLanguage());
  }

  /**
   * Get the bean definition for 'configureFileLanguage'.
   */
  public static BeanDefinition getConfigureFileLanguageBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LanguageCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureFileLanguageInstanceSupplier());
    return beanDefinition;
  }
}
