package org.apache.camel.component.beanclass.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ClassComponentAutoConfiguration}.
 */
@Generated
public class ClassComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.beanclass.springboot.ClassComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<ClassComponentAutoConfiguration> getClassComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ClassComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new ClassComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'classComponentAutoConfiguration'.
   */
  public static BeanDefinition getClassComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ClassComponentAutoConfiguration.class);
    InstanceSupplier<ClassComponentAutoConfiguration> instanceSupplier = getClassComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(ClassComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureClassComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureClassComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(ClassComponentAutoConfiguration.class, "configureClassComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ClassComponentAutoConfiguration.class).configureClassComponent());
  }

  /**
   * Get the bean definition for 'configureClassComponent'.
   */
  public static BeanDefinition getConfigureClassComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureClassComponentInstanceSupplier());
    return beanDefinition;
  }
}
