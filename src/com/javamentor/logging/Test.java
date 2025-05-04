package com.javamentor.logging;

import java.util.logging.Logger;

public class Test {

    static public void logging() {
        final Logger LOG = Logger.getLogger(Test.class.getName());
        LOG.info("Все хорошо");
        LOG.warning("Произошла ошибка");
    }
}
