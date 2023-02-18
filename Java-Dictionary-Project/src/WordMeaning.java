public class WordMeaning {
String word = null;
String meaning = null;


WordMeaning(String WORD, String MEANING) {
this.word = WORD;
this.meaning = MEANING;
}


void AddWordMeaning(String MEANING) {
this.meaning = this.meaning + "\n \t-" + MEANING;
}


String printWordMeaning() {
String TemporaryWord = "";
TemporaryWord = this.word + " - " + this.meaning + "\n";
return TemporaryWord;
}


String printWord() {
return(this.word);
}


int CompareWords(String WORD)  {
if(this.word.equalsIgnoreCase(WORD)) {
return 0;
}


else if((this.word.compareTo(WORD))<0) {
return -1;
}


else
return 1;
}
}