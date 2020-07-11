package com.company;

public class englishWords {

    //BST Root
    private englishWord root;

    //set root with constructor
    public englishWords(englishWord root) {
        this.root = root;
    }

    //add word
    public void addWord(String word){
        root.addWord(word);
    }

    //is the word contain
    public boolean isContain(String word){
        return root.isContain(word);
    }
}
