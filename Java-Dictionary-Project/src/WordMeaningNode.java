public class WordMeaningNode {
WordMeaning WordDefinition;
WordMeaningNode PreviousWord = null;
WordMeaningNode NextWord = null;
int count = 1;


WordMeaningNode(String word, String meaning, WordMeaningNode PreviousWord, WordMeaningNode NextWord) {
this.WordDefinition = new WordMeaning(word, meaning);
this.count = 0;
this.PreviousWord = PreviousWord;
this.NextWord = NextWord;
}


void AddMeaningNode(String meaning) {
this.WordDefinition.AddWordMeaning(meaning);
}


void DeleteMeaningNode() {
this.count = 1;
}


String printAllWordTypes(int phase) {
if((phase == 0) && (this.count == 1)) {
return(this.WordDefinition.printWord());
}


if((phase == 1) && (this.count == 0)) {
return(this.WordDefinition.printWordMeaning());
}


return("");
}
}