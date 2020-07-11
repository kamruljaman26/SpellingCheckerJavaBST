package com.company;

import java.io.*;

public class SpellChecker {

    // words BST Root Node
    private englishWords words;

    //Read file & store data to englishWords
    public void readFileAndStoreWords() throws IOException {
        System.out.println("Reading data ...");

        BufferedReader sc = new BufferedReader(new FileReader("words_list.txt")); // Read File
        String line;
        boolean setRoot = false;
        while ((line = sc.readLine()) != null) { // read all data
            if(!setRoot){
                words = new englishWords(new englishWord(line)); // set Root from file first input
                setRoot = true;
            }else {
                words.addWord(line); // set words to sub node
            }
        }
    }

    public void readSentenceFileAndCheckSpelling() throws IOException {
        System.out.println("Check Spelling ...");

        FileWriter outputFile = new FileWriter("SpellChecker.out.txt");
        //outputFile.write("Files in Java might be tricky, but it is fun enough!");

        BufferedReader sc = new BufferedReader(new FileReader("SpellChecker.txt")); // Read File

        String line; //Read & Check Spell & save to output file
        while ((line = sc.readLine()) != null) { // read all data
            String outputString = ""; // Make a output string for single line
            String[] arr = line.split(" "); // Spelt all string to single word
            for (String word:arr){

                //Find on word list
                if (words.isContain(word)){
                    outputString += word+" ";
                }else{ // if not found add """" in the word and create a sentence
                    outputString += "\""+word+"\""+" ";
                }
            }
            //Save on output File
            outputFile.write(outputString);
        }

        // close output file
        outputFile.close();
        System.out.println("Making output file ...");
        System.out.println("Process complete, Please check output file. Thanks");
    }

    //Main method
    public static void main(String[] args) {

        SpellChecker spellChecker = new SpellChecker();
        try { // Handle I/O Error
            spellChecker.readFileAndStoreWords(); //read file
            spellChecker.readSentenceFileAndCheckSpelling(); // check each word & save to output file

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("I/O Error!");
        }
    }
}
