package com.example.stem211.emanuele.rubrica;

public class Main {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		agenda.add("Giovanni", "3256984");
		agenda.add("Luigi", "654674684");
		agenda.save();
	}
}
