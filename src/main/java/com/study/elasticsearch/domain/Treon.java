package com.study.elasticsearch.domain;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.ZonedDateTime;

@Setter
@Getter
@Document(indexName = "treon")
public class Treon {
    @Id
    private Long id;

    @Field(type = FieldType.Text, name = "serial_no")
    private String serialNo;

    @Field(type = FieldType.Date, name = "reg_dtime")
    private ZonedDateTime regDtime;

    @Field(type = FieldType.Date, name = "timestamp")
    private ZonedDateTime timestamp;
    @Field(type = FieldType.Double, name = "temperature")
    private Double temperature;
    @Field(type = FieldType.Integer, name = "measid")
    private Integer measid;
    @Field(type = FieldType.Double, name = "rms_x")
    private Double rmsX;
    @Field(type = FieldType.Double, name = "rms_y")
    private Double rmsY;
    @Field(type = FieldType.Double, name = "rms_z")
    private Double rmsZ;
    @Field(type = FieldType.Double, name = "p2p_x")
    private Double p2pX;
    @Field(type = FieldType.Double, name = "p2p_y")
    private Double p2pY;
    @Field(type = FieldType.Double, name = "p2p_z")
    private Double p2pZ;
    @Field(type = FieldType.Double, name = "z2p_x")
    private Double z2pX;
    @Field(type = FieldType.Double, name = "z2p_y")
    private Double z2pY;
    @Field(type = FieldType.Double, name = "z2p_z")
    private Double z2pZ;
    @Field(type = FieldType.Double, name = "a_rms_x")
    private Double aRmsX;
    @Field(type = FieldType.Double, name = "a_rms_y")
    private Double aRmsY;
    @Field(type = FieldType.Double, name = "a_rms_z")
    private Double aRmsZ;
    @Field(type = FieldType.Double, name = "a_p2p_x")
    private Double aP2pX;
    @Field(type = FieldType.Double, name = "a_p2p_y")
    private Double aP2pY;
    @Field(type = FieldType.Double, name = "a_p2p_z")
    private Double aP2pZ;
    @Field(type = FieldType.Double, name = "a_z2p_x")
    private Double aZ2pX;
    @Field(type = FieldType.Double, name = "a_z2p_y")
    private Double aZ2pY;
    @Field(type = FieldType.Double, name = "a_z2p_z")
    private Double aZ2pZ;
    @Field(type = FieldType.Double, name = "kurtosis_x")
    private Double kurtosisX;
    @Field(type = FieldType.Double, name = "kurtosis_y")
    private Double kurtosisY;
    @Field(type = FieldType.Double, name = "kurtosis_z")
    private Double kurtosisZ;
    @Field(type = FieldType.Double, name = "crest_x")
    private Double crestX;
    @Field(type = FieldType.Double, name = "crest_y")
    private Double crestY;
    @Field(type = FieldType.Double, name = "crest_z")
    private Double crestZ;
    @Field(type = FieldType.Double, name = "usedrange_x")
    private Double usedrangeX;
    @Field(type = FieldType.Double, name = "usedrange_y")
    private Double usedrangeY;
    @Field(type = FieldType.Double, name = "usedrange_z")
    private Double usedrangeZ;
    @Field(type = FieldType.Double, name = "anomaly_score")
    private Double anomalyScore;
    @Field(type = FieldType.Double, name = "anomaly_label")
    private Double anomalyLabel;
    @Field(type = FieldType.Double, name = "anomaly_flag")
    private Double anomalyFlag;
    @Field(type = FieldType.Text, name = "measure_type")
    private String measureType;
    @Field(type = FieldType.Text, name = "status")
    private String status;
    @Field(type = FieldType.Double, name = "rms")
    private Double rms;
}
