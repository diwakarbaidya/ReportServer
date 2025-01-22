package com.example.reportserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.reportserver.service.CampaignReportService;

@SpringBootApplication
public class ReportserverApplicationTests {
	public static void main(String[] args) {
		SpringApplication.run(CampaignReportService.class, args);
	}
}

