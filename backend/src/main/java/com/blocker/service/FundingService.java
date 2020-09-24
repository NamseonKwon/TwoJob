package com.blocker.service;

public interface FundingService {
	public void Deploy();
	public String createCampaign(String accessToken, String id) throws Exception;
	public String fundingCampaign(String accessToken, String campaignid, String value) throws Exception;
	public String receiveFund(String accessToken, String campaignid) throws Exception;
	public void reFund(String campaignId) throws Exception;
	public void getCam(String campaignId) throws Exception;
}