package antlr;

/* ANTLR Translator Generator
 * Project led by Terence Parr at http://www.jGuru.com
 * Software rights: http://www.antlr.org/license.html
 *
 * $Id: TokenStream.java,v 1.2 2005/10/20 12:22:43 alexa Exp $
 */

public interface TokenStream {
    public Token nextToken() throws TokenStreamException;
}
