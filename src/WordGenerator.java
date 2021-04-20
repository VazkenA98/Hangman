import words.Animal;
import words.Car;
import words.Level;
import words.Word;

import java.util.ArrayList;
import java.util.List;

public class WordGenerator {

    public static List<Word> filteredWordList;
    private List<Word> wordList;

    public WordGenerator() {
        filteredWordList =  new ArrayList<>();
        wordList  =  new ArrayList<>();
        storeWords();
    }

    public void Generate(Word word, Level level) {
        for(int i = 0; i< wordList.size();i++){
            if(wordList.get(i).getLevel() == level){
                System.out.println(wordList.get(i));
                filteredWordList.add(wordList.get(i));
            }
        }
    }
    private void storeWords() {
       wordList.addAll(getListOfCars());
        wordList.addAll(getListOfAnimals());
    }
    public List<Word> getListOfCars(){
        List<Word> list = new ArrayList<>();
        list.add(new Car("Toyota", Level.EASY));
        list.add(new Car("KIA", Level.EASY));
        list.add(new Car("Opel", Level.EASY));

        list.add(new Car("Toyota", Level.MEDIUM));
        list.add(new Car("Toyota", Level.MEDIUM));
        list.add(new Car("Toyota", Level.MEDIUM));

        list.add(new Car("Toyota", Level.HARD));
        list.add(new Car("Toyota", Level.HARD));
        list.add(new Car("Toyota", Level.HARD));

        return list;
    }

    public List<Word> getListOfAnimals(){
        List<Word> list = new ArrayList<>();
        list.add(new Animal("Cat", Level.EASY));
        list.add(new Animal("Dog", Level.EASY));
        list.add(new Animal("Opel", Level.EASY));

        list.add(new Animal("Toyota", Level.MEDIUM));
        list.add(new Animal("Toyota", Level.MEDIUM));
        list.add(new Animal("Snake", Level.MEDIUM));

        list.add(new Animal("Toyota", Level.HARD));
        list.add(new Animal("Toyota", Level.HARD));
        list.add(new Animal("Toyota", Level.HARD));

        return list;
    }

}
