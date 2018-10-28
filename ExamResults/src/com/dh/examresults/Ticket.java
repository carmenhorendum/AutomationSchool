package com.dh.examresults;

class Ticket {
	private String id, question;

	public Ticket (String id, String question) {
		this.id = id;
		this.question = question;
	}

	public String getId(){
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
}
