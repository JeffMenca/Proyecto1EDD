/*Seccion codigo de usuario*/
package Analyzers;
import java_cup.runtime.*;
import Objects.*;
import java.io.Reader;
import java.util.ArrayList;
%%

/*Seccion configuracion*/
%class LexicoImagenes
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
LLAVEA=("{")
LLAVEB=("}")
COMA=(",")
SEPARADOR = \r|\r\n|\n
ESPACIO = {SEPARADOR} | [ \t\f]

%%

/*Seccion Reglas Lexicas*/

<YYINITIAL>{

{SEPARADOR} {/*Ignora el separador*/}
{ESPACIO} {/*Ignora el espacio*/}
{ENTERO} { return symbol(sym2.ENTERO,yytext());}
{ID} { return symbol(sym2.ID,yytext()); }
{LLAVEA} {return symbol(sym2.LLAVEA,yytext()); }
{LLAVEB} {return symbol(sym2.LLAVEB,yytext()); }
{COMA} {return symbol(sym2.COMA,yytext()); }
}

/*Errores y signos encontrados*/
[^] {
  return symbol(sym2.error,yytext()); }