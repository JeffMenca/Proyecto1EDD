/*Seccion codigo de usuario*/
package Analyzers;
import java_cup.runtime.*;
import Objects.*;
import java.io.Reader;
import java.util.ArrayList;
%%

/*Seccion configuracion*/
%class LexicoCapas
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
HEXADECIMAL= [#][[A-F]|[0-9]][[A-F]|[0-9]][[A-F]|[0-9]][[A-F]|[0-9]][[A-F]|[0-9]][[A-F]|[0-9]]
LLAVEA=("{")
LLAVEB=("}")
COMA=(",")
PUNTOCOMA=(";")
SEPARADOR = \r|\r\n|\n
ESPACIO = {SEPARADOR} | [ \t\f]

%%

/*Seccion Reglas Lexicas*/

<YYINITIAL>{

{SEPARADOR} {/*Ignora el separador*/}
{ESPACIO} {/*Ignora el espacio*/}
{ENTERO} { return symbol(sym.ENTERO,yytext()); System.out.println("Funciono"); }
{ID} { return symbol(sym.ID,yytext()); }
{HEXADECIMAL} {return symbol(sym.HEXADECIMAL,yytext()); }
{LLAVEA} {return symbol(sym.LLAVEA,yytext()); }
{LLAVEB} {return symbol(sym.LLAVEB,yytext()); }
{COMA} {return symbol(sym.COMA,yytext()); }
{PUNTOCOMA} {return symbol(sym.PUNTOCOMA,yytext()); }
}

/*Errores y signos encontrados*/
[^] {
  return symbol(sym.error,yytext()); }