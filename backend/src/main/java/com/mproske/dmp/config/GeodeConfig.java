package com.mproske.dmp.config;

import org.apache.geode.cache.ExpirationAction;
import org.apache.geode.cache.ExpirationAttributes;
import org.apache.geode.cache.GemFireCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.PartitionedRegionFactoryBean;
import org.springframework.data.gemfire.config.annotation.CacheServerApplication;
import org.springframework.data.gemfire.config.annotation.EnableLocator;
import org.springframework.data.gemfire.config.annotation.EnableManager;
import org.springframework.data.gemfire.function.config.EnableGemfireFunctions;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@CacheServerApplication(name = "DMP")
@EnableLocator
@EnableManager
@EnableGemfireFunctions
@EnableGemfireRepositories(basePackages = "com.mproske.dmp.repository")
@Configuration
public class GeodeConfig {

    @Bean(name = "Locations")
    public PartitionedRegionFactoryBean<Object, Object> locationsRegion(GemFireCache gemFireCache) {
        PartitionedRegionFactoryBean<Object, Object> regionFactoryBean = new PartitionedRegionFactoryBean<>();
        regionFactoryBean.setCache(gemFireCache);
        regionFactoryBean.setName("Locations");
        return regionFactoryBean;
    }
}
