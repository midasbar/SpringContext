package midasbar.study.springcontext.beans

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component
class Bean1(
    private var bean2: Bean2?,
    private var bean3: Bean3?
) {

    constructor() : this(null,null) {
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

    @Autowired
    fun setSpringBean2(bean2: Bean2) {
        println ("${javaClass.simpleName}::setSpringBean2" )
        this.bean2 = bean2
    }

    @Autowired
    fun setSpringBean3(bean3: Bean3) {
        println("${javaClass.simpleName}::setSpringBean3")
        this.bean3 = bean3
    }
}