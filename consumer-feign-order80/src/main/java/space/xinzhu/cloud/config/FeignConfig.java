package space.xinzhu.cloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: ???
 * Created by 馨竹 on 2022/12/28
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
@Configuration
public class FeignConfig
{
    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }
}