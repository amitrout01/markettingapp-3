package com.marketingapp3.service;

import java.util.List;

import com.marketingapp3.entity.Lead;

public interface LeadService {

	void saveLead(Lead lead);

	List<Lead> listLeads();

	void deleteLead(long id);

	Lead findLead(long id);

}
