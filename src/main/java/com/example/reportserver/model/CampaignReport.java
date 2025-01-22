package com.example.reportserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CampaignReport {

    private String campaignId;
    private int numberOfClicks;
    private String campaignName;
    private String date;
}
