package com.study.elasticsearch.dto;

import lombok.Getter;

@Getter
public class TreonSearchTimeRangeRequest {
    private String startAt;
    private String finishedAt;
}
