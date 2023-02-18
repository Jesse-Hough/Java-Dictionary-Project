public class WordList {
WordMeaningNode begin;
int count = 0;


WordList() {
begin = null;
}


void Add(String word, String meaning) {
	
	
if(begin == null) {
begin = new WordMeaningNode(word, meaning, null, null);
count = count + 1;
}


else {
WordMeaningNode TemporaryWord = null;
WordMeaningNode NewNode = null;
WordMeaningNode PrevTemporaryWord = null;
TemporaryWord = begin;
while(TemporaryWord != null) {
if(TemporaryWord.WordDefinition.CompareWords(word) == 0) {
TemporaryWord.AddMeaningNode(meaning);
break;
}


else if(TemporaryWord.WordDefinition.CompareWords(word) < 0) {
PrevTemporaryWord = TemporaryWord;
TemporaryWord = TemporaryWord.NextWord;
}
	

else {
NewNode = new WordMeaningNode(word, meaning, null, null);
NewNode.PreviousWord = PrevTemporaryWord;
NewNode.NextWord = TemporaryWord;
TemporaryWord.PreviousWord = NewNode;


if(PrevTemporaryWord == null) {
begin = NewNode;
}


else {
PrevTemporaryWord.NextWord = NewNode;
}
count = count + 1;
break;
}
}


if(TemporaryWord == null) {
NewNode = new WordMeaningNode(word, meaning, null, null);
NewNode.PreviousWord = PrevTemporaryWord;
if(PrevTemporaryWord != null) {
PrevTemporaryWord.NextWord = NewNode;
}
count = count + 1;
}
}
}





void Delete(String word) {
WordMeaningNode TemporaryWord = begin;
while(TemporaryWord != null) {
if(TemporaryWord.WordDefinition.CompareWords(word) == 0) {
TemporaryWord.DeleteMeaningNode();
break;
}
TemporaryWord = TemporaryWord.NextWord;
}
}





String PrintListOfWords() {
WordMeaningNode TemporaryWord = begin;
String list = "";
while(TemporaryWord != null) {
list = list+TemporaryWord.printAllWordTypes(1);
TemporaryWord = TemporaryWord.NextWord;
}
return list;
}





String PrintDeleteList() {
WordMeaningNode TemporaryWord = begin;
String list = "";
while(TemporaryWord != null) {
list = list + TemporaryWord.printAllWordTypes(0);
TemporaryWord = TemporaryWord.NextWord;
}
return list;
}
}