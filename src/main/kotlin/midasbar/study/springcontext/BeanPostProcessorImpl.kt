package midasbar.study.springcontext

import org.springframework.beans.BeansException
import org.springframework.beans.factory.config.BeanPostProcessor
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

class BeanPostProcessorImpl : BeanPostProcessor {
    @Throws(BeansException::class)
    override fun postProcessBeforeInitialization(bean: Any, beanName: String): Any {
        println ("${javaClass.simpleName}::postProcessBeforeInitialization ${bean.javaClass.simpleName} $beanName")
        return bean
    }

    @Throws(BeansException::class)
    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any {
        println ("${javaClass.simpleName}::postProcessAfterInitialization ${bean.javaClass.simpleName} $beanName")
        return bean
    }

    constructor()  {
        println("${javaClass.simpleName}::constructor")
    }

    init {
        println ("${javaClass.simpleName}::init")
    }

    @PostConstruct
    fun postConstruct() {
        println ("${javaClass.simpleName}::postConstruct")
    }

    @PreDestroy
    fun preDestroy() {
        println ("${javaClass.simpleName}::preDestroy")
    }
}