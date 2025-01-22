package com.example.reportserver.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reportserver.model.CampaignReport;
import com.example.reportserver.service.CampaignReportService;

@RestController
@RequestMapping("/campaignReport")
public class CampaignReportController {
	private static final Logger logger = LoggerFactory.getLogger(CampaignReportController.class);

	private final CampaignReportService campaignService;

	public CampaignReportController(CampaignReportService campaignService) {
		this.campaignService = campaignService;
	}

	@GetMapping("/report")
	public List<CampaignReport> getAllCampaigns() {
		logger.info("Received request to fetch all campaigns.");
		List<CampaignReport> campaigns = campaignService.getAllCampaigns();
		logger.debug("Number of campaigns retrieved: {}", campaigns.size());
		return campaigns;
	}
}