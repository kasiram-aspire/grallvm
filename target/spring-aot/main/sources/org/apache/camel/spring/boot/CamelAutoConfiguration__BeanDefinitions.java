package org.apache.camel.spring.boot;

import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.FluentProducerTemplate;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.properties.PropertiesComponent;
import org.apache.camel.component.properties.PropertiesParser;
import org.apache.camel.main.RoutesCollector;
import org.apache.camel.spi.StartupConditionStrategy;
import org.apache.camel.spring.spi.CamelBeanPostProcessor;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

/**
 * Bean definitions for {@link CamelAutoConfiguration}.
 */
@Generated
public class CamelAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'camelAutoConfiguration'.
   */
  public static BeanDefinition getCamelAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelAutoConfiguration.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(CamelAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'camelContext'.
   */
  private static BeanInstanceSupplier<CamelContext> getCamelContextInstanceSupplier() {
    return BeanInstanceSupplier.<CamelContext>forFactoryMethod(CamelAutoConfiguration.class, "camelContext", ApplicationContext.class, CamelConfigurationProperties.class, CamelBeanPostProcessor.class, StartupConditionStrategy.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CamelAutoConfiguration.class).camelContext(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'camelContext'.
   */
  public static BeanDefinition getCamelContextBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelContext.class);
    beanDefinition.setInstanceSupplier(getCamelContextInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'routesCollector'.
   */
  private static BeanInstanceSupplier<RoutesCollector> getRoutesCollectorInstanceSupplier() {
    return BeanInstanceSupplier.<RoutesCollector>forFactoryMethod(CamelAutoConfiguration.class, "routesCollector", ApplicationContext.class, CamelConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CamelAutoConfiguration.class).routesCollector(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'routesCollector'.
   */
  public static BeanDefinition getRoutesCollectorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RoutesCollector.class);
    beanDefinition.setInstanceSupplier(getRoutesCollectorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'routesCollectorListener'.
   */
  private static BeanInstanceSupplier<CamelSpringBootApplicationListener> getRoutesCollectorListenerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CamelSpringBootApplicationListener>forFactoryMethod(CamelAutoConfiguration.class, "routesCollectorListener", ApplicationContext.class, CamelConfigurationProperties.class, RoutesCollector.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CamelAutoConfiguration.class).routesCollectorListener(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'routesCollectorListener'.
   */
  public static BeanDefinition getRoutesCollectorListenerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelSpringBootApplicationListener.class);
    beanDefinition.setInstanceSupplier(getRoutesCollectorListenerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'fluentProducerTemplate'.
   */
  private static BeanInstanceSupplier<FluentProducerTemplate> getFluentProducerTemplateInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<FluentProducerTemplate>forFactoryMethod(CamelAutoConfiguration.class, "fluentProducerTemplate", CamelContext.class, CamelConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CamelAutoConfiguration.class).fluentProducerTemplate(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'fluentProducerTemplate'.
   */
  public static BeanDefinition getFluentProducerTemplateBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FluentProducerTemplate.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getFluentProducerTemplateInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'producerTemplate'.
   */
  private static BeanInstanceSupplier<ProducerTemplate> getProducerTemplateInstanceSupplier() {
    return BeanInstanceSupplier.<ProducerTemplate>forFactoryMethod(CamelAutoConfiguration.class, "producerTemplate", CamelContext.class, CamelConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CamelAutoConfiguration.class).producerTemplate(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'producerTemplate'.
   */
  public static BeanDefinition getProducerTemplateBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ProducerTemplate.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getProducerTemplateInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'consumerTemplate'.
   */
  private static BeanInstanceSupplier<ConsumerTemplate> getConsumerTemplateInstanceSupplier() {
    return BeanInstanceSupplier.<ConsumerTemplate>forFactoryMethod(CamelAutoConfiguration.class, "consumerTemplate", CamelContext.class, CamelConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CamelAutoConfiguration.class).consumerTemplate(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'consumerTemplate'.
   */
  public static BeanDefinition getConsumerTemplateBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ConsumerTemplate.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConsumerTemplateInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'propertiesParser'.
   */
  private static BeanInstanceSupplier<PropertiesParser> getPropertiesParserInstanceSupplier() {
    return BeanInstanceSupplier.<PropertiesParser>forFactoryMethod(CamelAutoConfiguration.class, "propertiesParser", Environment.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CamelAutoConfiguration.class).propertiesParser(args.get(0)));
  }

  /**
   * Get the bean definition for 'propertiesParser'.
   */
  public static BeanDefinition getPropertiesParserBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PropertiesParser.class);
    beanDefinition.setInstanceSupplier(getPropertiesParserInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'properties'.
   */
  private static BeanInstanceSupplier<PropertiesComponent> getPropertiesInstanceSupplier() {
    return BeanInstanceSupplier.<PropertiesComponent>forFactoryMethod(CamelAutoConfiguration.class, "properties", ApplicationContext.class, PropertiesParser.class, PropertiesComponentConfiguration.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CamelAutoConfiguration.class).properties(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'properties'.
   */
  public static BeanDefinition getPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PropertiesComponent.class);
    beanDefinition.setInstanceSupplier(getPropertiesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'camelBeanPostProcessor'.
   */
  private static BeanInstanceSupplier<CamelBeanPostProcessor> getCamelBeanPostProcessorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CamelBeanPostProcessor>forFactoryMethod(CamelAutoConfiguration.class, "camelBeanPostProcessor", ApplicationContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CamelAutoConfiguration.class).camelBeanPostProcessor(args.get(0)));
  }

  /**
   * Get the bean definition for 'camelBeanPostProcessor'.
   */
  public static BeanDefinition getCamelBeanPostProcessorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelBeanPostProcessor.class);
    beanDefinition.setInstanceSupplier(getCamelBeanPostProcessorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'startupConditionStrategy'.
   */
  private static BeanInstanceSupplier<StartupConditionStrategy> getStartupConditionStrategyInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<StartupConditionStrategy>forFactoryMethod(CamelAutoConfiguration.class, "startupConditionStrategy", CamelStartupConditionConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CamelAutoConfiguration.class).startupConditionStrategy(args.get(0)));
  }

  /**
   * Get the bean definition for 'startupConditionStrategy'.
   */
  public static BeanDefinition getStartupConditionStrategyBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(StartupConditionStrategy.class);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.setInstanceSupplier(getStartupConditionStrategyInstanceSupplier());
    return beanDefinition;
  }
}
