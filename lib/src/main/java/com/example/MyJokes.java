package com.example;

public class MyJokes {

    private int jokeIndex = 0;

    public static String[] jokesArray = new String[] {
            "The four most beautiful words in our common language: I told you so.",
            "I bought one of those tapes to teach you Spanish in your sleep. During the night, the tape skipped. Now I can only stutter in Spanish.",
            "The closest a person ever comes to perfection is when he fills out a job application form.",
            "Here’s some advice: At a job interview, tell them you’re willing to give 110 percent. Unless the job is a statistician.",
            "My kitchen floor is sticky, and I had to do something about it. So finally I went out and bought some slippers."
    };

    public String getJoke() {

        String joke;

        if (jokeIndex < jokesArray.length) {
            joke = jokesArray[jokeIndex];
            jokeIndex++;
        } else {
            joke = jokesArray[0];
        }
        return joke;
    }

    public String[] getJokesArray() {
        return jokesArray;
    }
}
