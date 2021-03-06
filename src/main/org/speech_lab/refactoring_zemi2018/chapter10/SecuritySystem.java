package org.speech_lab.refactoring_zemi2018.chapter10;

import java.util.ArrayList;

class SecuritySystem {

    public void sendAlert() {
	System.out.println("侵入者発見!");
    }
	
    public String foundMiscreant(ArrayList<String> people) {
	for (int i = 0; i < people.size(); i++){
	    if (people.get(i) == "Don") {
		sendAlert();
		return "Don";
	    }
	    if (people.get(i) == "John") {
		sendAlert();
		return "John";
	    }
	}
	return "";
    }

    public void checkSecurity(ArrayList<String> people) {
	String found = foundMiscreant(people);
	sendMessage(found);
    }

    public void sendMessage(String name) {
	System.out.println(name +"が侵入しました");
    }
}
