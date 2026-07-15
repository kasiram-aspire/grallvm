package org.apache.camel.spring.boot.threadpool;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ThreadPoolProfile;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelThreadPoolAutoConfiguration}.
 */
@Generated
public class CamelThreadPoolAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'camelThreadPoolAutoConfiguration'.
   */
  public static BeanDefinition getCamelThreadPoolAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelThreadPoolAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(CamelThreadPoolAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'threadPool'.
   */
  private static BeanInstanceSupplier<ThreadPoolProfile> getThreadPoolInstanceSupplier() {
    return BeanInstanceSupplier.<ThreadPoolProfile>forFactoryMethod(CamelThreadPoolAutoConfiguration.class, "threadPool", CamelContext.class, CamelThreadPoolConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CamelThreadPoolAutoConfiguration.class).threadPool(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'threadPool'.
   */
  public static BeanDefinition getThreadPoolBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ThreadPoolProfile.class);
    beanDefinition.setInstanceSupplier(getThreadPoolInstanceSupplier());
    return beanDefinition;
  }
}
