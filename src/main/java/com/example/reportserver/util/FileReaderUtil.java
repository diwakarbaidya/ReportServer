package com.example.reportserver.util;

import com.example.reportserver.model.CampaignReport;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileReaderUtil {
    private static final Logger logger = LoggerFactory.getLogger(FileReaderUtil.class);
    private static final String FILE_PATH = "/campaignReport.txt";

    public List<CampaignReport> readCampaignData() {
        List<CampaignReport> campaignReport = new ArrayList<>();
        logger.info("Reading campaign data from file: {}", FILE_PATH);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                getClass().getResourceAsStream(FILE_PATH)))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                campaignReport.add(new campaignReportns(parts[0], Integer.parseInt(parts[1]), parts[2], parts[3]));
            }
            logger.info("Successfully read {} campaignReportns records from the file.", campaignReport.size());
        } catch (Exception e) {
            logger.error("Error reading campaignReport data from file: {}", e.getMessage());
        }
        return campaigns;
    }
}
