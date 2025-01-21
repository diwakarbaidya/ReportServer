package com.example.reportserver.service;

import com.example.campaign.model.Campaign;
import com.example.campaign.util.FileReaderUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaignReportService {
    private final FileReaderUtil fileReaderUtil;

    public CampaignService(FileReaderUtil fileReaderUtil) {
        this.fileReaderUtil = fileReaderUtil;
    }

    public List<Campaign> getAllCampaigns() {
        return fileReaderUtil.readCampaignData();
    }
}
