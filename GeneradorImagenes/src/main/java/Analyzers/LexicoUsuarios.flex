/*Seccion codigo de usuario*/
package Analyzers;
import java_cup.runtime.*;
import Objects.*;
import java.io.Reader;
import java.util.ArrayList;
%%

/*Seccion configuracion*/
%class LexicoUsuarios
%cup
%unicode
%line
%column
%public

//Metodos
%{
      private Symbol symbol(int type, String lexema) {
        return new Symbol(type, new Token(lexema, yyline + 1, yycolumn + 1));
      }
%}

//Palabras reservadas y tokens validos
ENTERO=([0-9]+)
ID = [:jletterdigit:]+
DOSPUNTOS=(":")
COMA=(",")
PUNTOCOMA=(";")
SEPARADOR = \r|\r\n|\n
ESPACIO = {SEPARADOR} | [ \t\f]

%%

/*Seccion Reglas Lexicas*/

<YYINITIAL>{

{SEPARADOR} {/*Ignora el separador*/}
{ESPACIO} {/*Ignora el espacio*/}
{ENTERO} { return symbol(sym3.ENTERO,yytext());}
{ID} {  return symbol(sym3.ID,yytext()); }
{DOSPUNTOS} { return symbol(sym3.DOSPUNTOS,yytext()); }
{COMA} { return symbol(sym3.COMA,yytext()); }
{PUNTOCOMA} { return symbol(sym3.PUNTOCOMA,yytext()); }
}

/*Errores y signos encontrados*/
[^] {
  return symbol(sym3.error,yytext()); }