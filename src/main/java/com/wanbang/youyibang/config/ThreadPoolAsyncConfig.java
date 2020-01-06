package com.wanbang.youyibang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author: wcy
 * @Date: 2019/8/28 11:08
 * @Description:
 */
@Configuration
@EnableAsync
public class ThreadPoolAsyncConfig {

    private static final int corePoolSize = 10;
    private static final int maxPoolSize = 100;
    private static final int keepAliveTime = 60;
    private static final int queueCapacity = 200;
//    private static final String threadNamePrefix = "Async-Mail-";


//    @Bean("taskExecutor") // bean的名称，默认为首字母小写的方法名
//    public ThreadPoolTaskExecutor taskExecutor(){
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setCorePoolSize(corePoolSize);
//        executor.setMaxPoolSize(maxPoolSize);
//        executor.setQueueCapacity(queueCapacity);
//        executor.setKeepAliveSeconds(keepAliveTime);
//        executor.setThreadNamePrefix(threadNamePrefix);
//
//        // 线程池对拒绝任务的处理策略
//        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
//        // 初始化
//        executor.initialize();
//        return executor;
//    }

}
