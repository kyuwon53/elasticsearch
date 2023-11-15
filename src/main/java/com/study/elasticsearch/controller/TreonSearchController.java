package com.study.elasticsearch.controller;

import com.study.elasticsearch.domain.Treon;
import com.study.elasticsearch.dto.TreonSearchTimeRangeRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TreonSearchController {
    //    private ElasticTreonService elasticTreonService;
//
//    public TreonSearchController(ElasticTreonService elasticTreonService) {
//        this.elasticTreonService = elasticTreonService;
//    }
//
    @PostMapping("/create-treon")
    public ResponseEntity<Void> createTreon(@RequestBody Treon treon) {
//        elasticTreonService.save(treon);
        System.out.println("create-treon API call");
        return ResponseEntity.ok().build();
    }

    //
    @GetMapping("/treon")
    public ResponseEntity<Object> getTreons(@ModelAttribute TreonSearchTimeRangeRequest request) {
//        List<Treon> response = elasticTreonService.searchTreonByBetweenTimestamp(request);
        System.out.println("get treon API call");
        return ResponseEntity.ok(null);
    }
}
