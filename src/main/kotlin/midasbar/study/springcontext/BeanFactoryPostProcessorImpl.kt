package midasbar.study.springcontext

import org.springframework.beans.factory.config.BeanFactoryPostProcessor
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

class BeanFactoryPostProcessorImpl : BeanFactoryPostProcessor {

    override fun postProcessBeanFactory(beanFactory: ConfigurableListableBeanFactory) {
        println("${javaClass.simpleName}::postProcessBeanFactory Listing Beans Start")
        beanFactory.beanDefinitionNames.forEach { println(it) }
        println("${javaClass.simpleName}::postProcessBeanFactory Listing Beans End")
    }

    constructor() {
        println("${javaClass.simpleName}::constructor")
    }

    init {
        println("${javaClass.simpleName}::init")
    }

    //Not called
    @PostConstruct
    fun postConstruct() {
        println("${javaClass.simpleName}::postConstruct")
    }

    //Not called
    @PreDestroy
    fun preDestroy() {
        println("${javaClass.simpleName}::preDestroy")
    }
}