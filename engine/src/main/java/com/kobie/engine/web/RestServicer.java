package com.kobie.engine.web;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kobie.engine.CampaignEngine;
import com.kobie.engine.domain.value.AccountDTO;
import com.kobie.engine.dto.ProcessRequest;
import com.kobie.engine.processing.Executor;

@RestController
public class RestServicer {
	@RequestMapping("/campaign")
	public void process(@RequestBody final ProcessRequest request) {
		final CampaignEngine engine = new CampaignEngine();
		engine.setAccount(request.getAccount());
		engine.setTransaction(request.getTransaction());
		engine.execute();
	}
}