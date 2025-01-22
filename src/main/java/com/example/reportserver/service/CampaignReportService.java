package com.example.reportserver.service;

import com.example.reportserver.model.Campaign;
import com.example.reportserver.util.FileReaderUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaignReportService {
    private final FileReaderUtil fileReaderUtil;

    public CampaignReportService(FileReaderUtil fileReaderUtil) {
        this.fileReaderUtil = fileReaderUtil;
    }

    public List<Campaign> getAllCampaigns() {
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
