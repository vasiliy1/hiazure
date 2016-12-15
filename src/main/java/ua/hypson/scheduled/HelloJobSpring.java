package ua.hypson.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author vasiliy
 */
@Component
public class HelloJobSpring {

    private static final Logger logger = LoggerFactory.getLogger(HelloJobSpring.class);

    private static final SimpleDateFormat dateFormat =
            new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron = "0 20 * * * *")
    public void reportCurrentTime() {
        logger.info("The time is now {}", dateFormat.format(new Date()));


    }
}
