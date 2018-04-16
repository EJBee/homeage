package com.kobie.engine.processing;

import org.kie.api.KieServices;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;

import com.kobie.engine.dto.ProcessRequest;

public class Executor {
	public void execute(final ProcessRequest request) {
		final KieServices ks = KieServices.Factory.get();
		final KieContainer kContainer = ks.getKieClasspathContainer();
		final KieSession kSession = kContainer.newKieSession("ksession-rules");
		final Message message = new Message();
		message.setMessage("Hello, World");
		message.setStatus(0);
		kSession.insert(message);
		kSession.insert(request);
		kSession.fireAllRules();
	}
}