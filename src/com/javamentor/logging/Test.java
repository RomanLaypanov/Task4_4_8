package com.javamentor.logging;

import java.util.logging.Logger;

public class Test {
    static public final Logger LOGGER = Logger.getLogger(Test.class.getName());

    static public void logging(){

        LOGGER.info("Все хорошо");
        LOGGER.warning("Произошла ошибка");
    }
}
