package UngersCYKParsar;

import java.util.LinkedList;

import grammar.Grammar;
import grammar.GrammarException;
import grammar.Phrase;

public interface ParsingMethod {
	public LinkedList<Phrase> parse(Phrase phrase, Grammar grammar) throws GrammarException;
}
