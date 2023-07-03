package org.zerock.j1test.repository;

import java.util.Optional;
import java.util.stream.LongStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.j1test.domain.Sample;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class SampleRepositoryTests  {

    @Autowired
    public SampleRepository sampleRepository;

    @Test
    public void testInsert() {
        LongStream.rangeClosed(0, 100).forEach(i -> {
            Sample obj = Sample.builder()
            .tno(i)
            .title("탁: " + i)
            .contents("탁탁: " + i)
            .build();

            sampleRepository.save(obj);
        });
    }

    @Test
    public void testRead() {
        Optional<Sample> obj = sampleRepository.findById(1L);
        Sample result = obj.orElseThrow();
        log.info(result);
    }

    @Test
    public void testDelete() {
        sampleRepository.deleteById(0L);
    }

    
    
}
