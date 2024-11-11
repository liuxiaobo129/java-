package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LogExample {
    private static final Logger logger = LoggerFactory.getLogger(LogExample.class);
    public static void main(String[] args) {
        logger.info("This is an info message");
    }
}