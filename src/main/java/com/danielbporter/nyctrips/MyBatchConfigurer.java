package com.danielbporter.nyctrips;


import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.MapJobRepositoryFactoryBean;
import org.springframework.batch.support.transaction.ResourcelessTransactionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
// TODO: BatchConfigurer? BatchConfig? there's something specific to do here, I think.
public class MyBatchConfigurer /*implements BatchConfigurer*/ {

//    @Override
//    public JobRepository getJobRepository() throws Exception {
//        return null;
//    }

    @Bean
    public MapJobRepositoryFactoryBean jobRepositoryFactoryBean() throws Exception {
        MapJobRepositoryFactoryBean factory = new MapJobRepositoryFactoryBean();
        factory.afterPropertiesSet();
        return factory;
    }

    @Bean
    public JobRepository

//    @Override
//    protected JobRepository getJobRepository() throws Exception {
//        JobRepositoryFactoryBean factory = new JobRepositoryFactoryBean();
////        factory.setDataSource(dataSource);
//        factory.setTransactionManager(transactionManager);
//        factory.setIsolationLevelForCreate("ISOLATION_REPEATABLE_READ");
//        return factory.getObject();
//    }

    @Override
    public PlatformTransactionManager getTransactionManager() {
        return new ResourcelessTransactionManager();
    }

    @Override
    public JobLauncher getJobLauncher() throws Exception {
        return null;
    }

    @Override
    public JobExplorer getJobExplorer() throws Exception {
        return null;
    }
}
