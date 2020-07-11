package com.company;

//BST Node
public class englishWord {

    //BST Properties
    private String word;
    private englishWord left;
    private englishWord right;

    //Constructor with all parameter
    public englishWord(String word) {
        this.word = word;
        left = null;
        right = null;
    }

    //Constructor with all parameter
    public englishWord(String word, englishWord left, englishWord right) {
        this.word = word;
        this.left = left;
        this.right = right;
    }

    //Recursive function to add word in BST
    public void addWord(String word) {
        if(this.word.equals(word)) {
            return;
        }
        else if(word.compareTo(this.word)<=0) { //compare word
            if(this.left == null) {
                this.left = new englishWord(word);
                return;
            }
            else {
                this.left.addWord(word);
            }
        }
        else if(word.compareTo(this.word)>0) {
            if(this.right == null) {
                this.right = new englishWord(word);
            }
            else {
                this.right.addWord(word);
            }
        }
    }

    //If data is already contain
    public boolean isContain(String word) {
        if(this.word.equals(word)) {
            return true;
        }
        else if(word.compareTo(this.word)<0) {
            if(this.left == null) {
                return false;
            }
            else {
                return this.left.isContain(word);
            }
        }
        else {
            if(this.right == null) {
                return false;
            }
            else {
                return this.right.isContain(word);
            }
        }
    }

}
