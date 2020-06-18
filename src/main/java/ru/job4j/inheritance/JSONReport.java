package ru.job4j.inheritance;

class JSONReport extends TextReport {
    public String generate(String name, String body) {
        return "name : " + name + System.lineSeparator() + "body : " + body;
    }
}
