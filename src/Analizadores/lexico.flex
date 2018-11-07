package Analizadores;
import java_cup.runtime.*;
import java.util.LinkedList;
import java.util.ArrayList;

%%

%{
    public ArrayList<String> Tokensrec = new ArrayList<String>();
    public void enlistar(String argumento){
        Tokensrec.add(argumento);
    }
%}
%public
%class Lexer
%cupsym Tokens
%cup
%column
%full
%ignorecase
%line
%unicode

numero=([0-9]*[.])?[0-9]+

%%

<YYINITIAL> "+" {enlistar("Value: "+yytext()+", Column: "+yycolumn+", Line: "+yyline+""); return new Symbol(Tokens.mas, yycolumn, yyline,yytext()); }
<YYINITIAL> "-" {enlistar("Value: "+yytext()+", Column: "+yycolumn+", Line: "+yyline+""); return new Symbol(Tokens.menos, yycolumn, yyline,yytext());}
<YYINITIAL> "*" {enlistar("Value: "+yytext()+", Column: "+yycolumn+", Line: "+yyline+""); return new Symbol(Tokens.por, yycolumn, yyline,yytext());}
<YYINITIAL> "/" {enlistar("Value: "+yytext()+", Column: "+yycolumn+", Line: "+yyline+""); return new Symbol(Tokens.div, yycolumn, yyline,yytext());}
<YYINITIAL> "(" {enlistar("Value: "+yytext()+", Column: "+yycolumn+", Line: "+yyline+""); return new Symbol(Tokens.pareni, yycolumn, yyline,yytext());}
<YYINITIAL> ")" {enlistar("Value: "+yytext()+", Column: "+yycolumn+", Line: "+yyline+""); return new Symbol(Tokens.parend, yycolumn, yyline,yytext());}
<YYINITIAL> ";" {enlistar("Value: "+yytext()+", Column: "+yycolumn+", Line: "+yyline+""); return new Symbol(Tokens.puntocoma, yycolumn, yyline,yytext());}

<YYINITIAL> {numero} {enlistar("Value: "+yytext()+", Column: "+yycolumn+", Line: "+yyline+""); return new Symbol(Tokens.num, yycolumn, yyline,yytext());}

[ \t\r\n\f] {/*ignoramos espacios*/}
. {enlistar("Token no reconocido: "+yytext()+"");}


