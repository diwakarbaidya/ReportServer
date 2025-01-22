package com.example.reportserver.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.reportserver.model.CampaignReport;
import com.example.reportserver.util.FileReaderUtil;

@Service
public class CampaignReportService {
	private final FileReaderUtil fileReaderUtil;

	private static final Logger logger = LoggerFactory.getLogger(CampaignReportService.class);

	public CampaignReportService(FileReaderUtil fileReaderUtil) {
		this.fileReaderUtil = fileReaderUtil;
	}

	public List<CampaignReport> getAllCampaigns() {
		logger.info("Fetching all campaign data from file.");
		List<CampaignReport> campaignReport = fileReaderUtil.readCampaignData();
		if (campaignReport.isEmpty()) {
			logger.warn("No campaigns found in the data file.");
		} else {
			logger.info("Successfully retrieved {} campaigns.", campaignReport.size());
		}
		return campaignReport;
	}
}
