import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Dictionary{
public static void main(String[] args) {

JFrame mainFrame = new JFrame("Dictionary");
WordList wordlist = new WordList();
mainFrame.setSize(300, 300);
mainFrame.setLayout(new GridLayout(4, 1));
JOptionPane.showMessageDialog(mainFrame, "Dictionary");
mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JButton AddWord = new JButton("Add a word");
JPanel First_Panel = new JPanel();


AddWord.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String word, WordMeaning;
word = JOptionPane.showInputDialog(mainFrame, "Enter word");
WordMeaning = JOptionPane.showInputDialog(mainFrame, "Enter word meaning");
if((word != null) && (WordMeaning != null))
wordlist.Add(word, WordMeaning);
else
JOptionPane.showMessageDialog(mainFrame, "Missing Word or missing meaning to word");
}
});


JButton Delete = new JButton("Delete a word");
Delete.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String word;
word = JOptionPane.showInputDialog(mainFrame, "Enter a word"); 
wordlist.Delete(word);
throw new UnsupportedOperationException("Error"); 
}
});


JButton AddToList = new JButton("List");
AddToList.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(mainFrame, wordlist.PrintListOfWords());
throw new UnsupportedOperationException("Error"); 
}
});


JButton DeleteList=new JButton("List of Deleted Words");
DeleteList.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(mainFrame, wordlist.PrintDeleteList());
throw new UnsupportedOperationException("Error"); 
}
});


First_Panel.add(AddWord);
First_Panel.add(Delete);
First_Panel.add(AddToList);
First_Panel.add(DeleteList);
mainFrame.getContentPane().add(First_Panel);
mainFrame.setVisible(true);
}
}