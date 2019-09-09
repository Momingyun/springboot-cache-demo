package com.cache.config;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ramostear
 * @create-time 2019/4/7 0007-0:48
 * @modify by :
 * @since:
 */
public class PersonCacheEventLogger implements CacheEventListener<Object, Object> {

    private static final Logger logger = LoggerFactory.getLogger(PersonCacheEventLogger.class);

    @Override
    public void onEvent(CacheEvent cacheEvent) {
        logger.info("person caching event {} {} {} {}",
                cacheEvent.getType(),
                cacheEvent.getKey(),
                cacheEvent.getOldValue(),
                cacheEvent.getNewValue());
    }
}