package de.ra

import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.apache.logging.log4j.core.config.Configurator

class MyLogger {
    companion object {
        init {
            Configurator.setLevel("", Level.INFO)
        }
    }

    private val logger: Logger = LogManager.getLogger(Hello::javaClass)

    fun logoutLogging(userName: String): Unit {
        if (validLoggedInUserName(userName)) {
            logger.info("User $userName is logged out successfully")
        } else {
            logger.info("$userName is invalid username.")
        }
    }
}

fun validLoggedInUserName(userName: String): Boolean {
    return false;
}

fun main() {
    print("Enter user name = ")

    MyLogger().logoutLogging(readLine() ?: "null")
}