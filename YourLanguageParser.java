public class YourLanguageParser extends LR0Parser {

    public YourLanguageParser() {
        super(); // calls the constructor for LR0Parser

        // TODO: Encode the grammar assigned to you (based on your student id number)
        // here, making use of the style of encoding shown in Language1Parser.java
        //3 grammar rules
        addRule("R1","Z","S#");
        addRule("R2","S","aSb");
        addRule("R3","S","ab");
        //parse table
        // Each action is three parts:
        //  - a state number
        //  - an input symbol
        //  - the action to perform when in that state and see that input symbol
        //state 1:
        addAction("1","a","S3");
        addAction("1","S","G2");
        //state 2:
        addAction("2","#","Accept");
        //state 3:
        addAction("3","a","S3");
        addAction("3","b","S6");
        addAction("3","S","G4");
        //state 4:
        addAction("4","b","S5");
        //state 5:
        addAction("5","a","R2");
        addAction("5","b","R2");
        addAction("5","#","R2");
        //state 6:
        addAction("6","a","R3");
        addAction("6","b","R3");
        addAction("6","#","R3");
    }
}