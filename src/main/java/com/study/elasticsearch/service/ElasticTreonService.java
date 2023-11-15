package com.study.elasticsearch.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ElasticTreonService {
//    private final ElasticTreonRepository elasticTreonRepository;
//
//    @Transactional(readOnly = true)
//    public List<Treon> searchTreonByBetweenTimestamp(TreonSearchTimeRangeRequest request) {
//        String startAt = request.getStartAt();
//        String finishedAt = request.getFinishedAt();
//
//        return elasticTreonRepository.findByTimestampBetween(startAt, finishedAt);
//    }
//
//    @Transactional
//    public void save(Treon treon) {
//        elasticTreonRepository.save(treon);
//    }
}
