package com.danielbporter.nyctrips;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

@Configuration
public class MyConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job readerJob(Step yellowTripStep) {
        return jobBuilderFactory.get("yellowTripFeeder")
                .start(yellowTripStep)
                .build();
    }

    @Bean
    public Step yellowTripStep(ItemReader<YellowTrip> yellowFeedReader) {
        return stepBuilderFactory.get("yellowTripStep")
                .chunk(1_000)
                .reader(yellowFeedReader)
                .build();
    }

    @Bean @StepScope
    public ItemReader<YellowTrip> yellowFeedReader(@Value("#{jobParameters['fileName']}") String fileName) {
        FlatFileItemReaderBuilder<YellowTrip> rb = new FlatFileItemReaderBuilder<>();
        return rb.linesToSkip(2)
                .fieldSetMapper(new YellowTripFieldSetMapper())
                .resource(new FileSystemResource(fileName))
                .maxItemCount(10_000)
                .build();
    }

}
