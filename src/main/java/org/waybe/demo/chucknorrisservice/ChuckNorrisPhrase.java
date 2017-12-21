package org.waybe.demo.chucknorrisservice;

public class ChuckNorrisPhrase {
    private  int id;
    private  String phrase;

    public ChuckNorrisPhrase(int id, String phrase) {
        this.id = id;
        this.phrase = phrase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
}
