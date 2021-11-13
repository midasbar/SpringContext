package midasbar.study.springcontext.beans

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component
class Bean2 {
    constructor() {
        println("${javaClass.simpleName}::constructor")
    }

    init {
        println("${javaClass.simpleName}::init")
    }

    @PostConstruct
    fun postConstruct() {
        println("${javaClass.simpleName}::postConstruct")
    }

    @PreDestroy
    fun preDestroy() {
        println("${javaClass.simpleName}::preDestroy")
    }

}