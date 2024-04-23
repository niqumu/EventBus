package dev.niqumu.eventbus.test;

import dev.niqumu.eventbus.api.EventHandler;

public class DummyEventListener {

	@EventHandler
	public void onDummyEvent(DummyEvent event) {
		System.out.println("Received event!");
	}

}
