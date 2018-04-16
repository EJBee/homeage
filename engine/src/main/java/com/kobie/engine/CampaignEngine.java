package com.kobie.engine;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.kobie.engine.domain.value.AccountDTO;
import com.kobie.engine.domain.value.TransactionDTO;

public class CampaignEngine {
	private AccountDTO account;
	private TransactionDTO transaction;
	private final KieSession kSession;

	{
		final KieServices ks = KieServices.Factory.get();
		final KieContainer kContainer = ks.getKieClasspathContainer();
		kSession = kContainer.newKieSession("ksession-rules");
	}

	public void setAccount(final AccountDTO account) {
		this.account = account;
	}

	public void setTransaction(final TransactionDTO transaction) {
		this.transaction = transaction;
	}

	public void execute() {
		kSession.insert(account);
		kSession.insert(transaction);
		kSession.fireAllRules();
	}
}