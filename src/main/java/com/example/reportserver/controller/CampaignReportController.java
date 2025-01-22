package com.example.reportserver.controller;

import com.example.reportserver.model.CampaignReport;
import com.example.reportserver.service.CampaignReportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/campaignReport")
public class CampaignReportController {
    private static final Logger logger = LoggerFactory.getLogger(CampaignController.class);

    private final CampaignReportService campaignService;

    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @GetMapping
    public List<Campaign> getAllCampaigns() {
        logger.info("Received request to fetch all campaigns.");
        List<Campaign> campaigns = campaignService.getAllCampaigns();
        logger.debug("Number of campaigns retrieved: {}", campaigns.size());
        return campaigns;
    }
}