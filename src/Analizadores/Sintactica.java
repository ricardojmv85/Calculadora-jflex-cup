
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.Symbol;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintactica extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Tokens.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintactica() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintactica(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactica(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\010\000\002\002\004\000\002\002\004\000\002\003" +
    "\005\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\005\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\021\000\006\011\005\013\004\001\002\000\016\004" +
    "\ufffa\005\ufffa\006\ufffa\007\ufffa\010\ufffa\012\ufffa\001\002" +
    "\000\006\011\005\013\004\001\002\000\014\004\013\005" +
    "\014\006\012\007\015\012\011\001\002\000\004\002\010" +
    "\001\002\000\004\002\001\001\002\000\004\002\000\001" +
    "\002\000\006\011\005\013\004\001\002\000\006\011\005" +
    "\013\004\001\002\000\006\011\005\013\004\001\002\000" +
    "\006\011\005\013\004\001\002\000\016\004\ufffd\005\ufffd" +
    "\006\ufffd\007\ufffd\010\ufffd\012\ufffd\001\002\000\016\004" +
    "\ufffe\005\ufffe\006\012\007\015\010\ufffe\012\ufffe\001\002" +
    "\000\016\004\uffff\005\uffff\006\012\007\015\010\uffff\012" +
    "\uffff\001\002\000\016\004\ufffc\005\ufffc\006\ufffc\007\ufffc" +
    "\010\ufffc\012\ufffc\001\002\000\014\004\013\005\014\006" +
    "\012\007\015\010\023\001\002\000\016\004\ufffb\005\ufffb" +
    "\006\ufffb\007\ufffb\010\ufffb\012\ufffb\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\021\000\006\002\006\003\005\001\001\000\002\001" +
    "\001\000\004\003\021\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\003" +
    "\020\001\001\000\004\003\017\001\001\000\004\003\016" +
    "\001\001\000\004\003\015\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactica$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactica$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactica$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



public String resultado="";
   public Object[][] arbol = new Object[20][];
    public ArrayList<String> Gramaticas = new ArrayList<String>();
    public void enlistar(String argumento){
        Gramaticas.add(argumento);
    }
public void agregar(Object objeto,Integer indice){
    arbol[indice]=new Object[]{objeto};
    }
    public List objetar(String texto,Object hijos){
        List lista = new ArrayList();
        lista.add(texto);
        lista.add(hijos.toString());
        return lista;
    }

    //Metodo al que se llama automaticamente ante algun error sintactico
    public void syntax_error(Symbol s)
    {        
        enlistar("Error Sintactico");

       
       
        
    }

    //Metodo al que se llama en el momento en que ya no es posible una recuperacion de errores
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {        
        enlistar("Error Sintactico");

        
     
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintactica$actions {




  private final Sintactica parser;

  /** Constructor */
  CUP$Sintactica$actions(Sintactica parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintactica$do_action_part00000000(
    int                        CUP$Sintactica$act_num,
    java_cup.runtime.lr_parser CUP$Sintactica$parser,
    java.util.Stack            CUP$Sintactica$stack,
    int                        CUP$Sintactica$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactica$result;

      /* select the action based on the action number */
      switch (CUP$Sintactica$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-1)).value;
		RESULT = start_val;
              CUP$Sintactica$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactica$parser.done_parsing();
          return CUP$Sintactica$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= E puntocoma 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-1)).value;
		 resultado=a; enlistar("Se compilo completamente");
              CUP$Sintactica$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()), RESULT);
            }
          return CUP$Sintactica$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // E ::= E mas E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactica$stack.peek()).value;
		 float val1= Float.parseFloat(a);
                    float val2= Float.parseFloat(b);
                    float r = val1+val2;
                    RESULT = String.valueOf(r); 
                    enlistar("SUMA");
              CUP$Sintactica$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()), RESULT);
            }
          return CUP$Sintactica$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // E ::= E menos E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactica$stack.peek()).value;
		 float val1= Float.parseFloat(a);
                    float val2= Float.parseFloat(b);
                    float r = val1-val2;
                    RESULT = String.valueOf(r);
                    enlistar("RESTA"); 
              CUP$Sintactica$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()), RESULT);
            }
          return CUP$Sintactica$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // E ::= E div E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactica$stack.peek()).value;
		 float val1= Float.parseFloat(a);
                    float val2= Float.parseFloat(b);
                    float r = val1/val2;
                    RESULT = String.valueOf(r); 
                    enlistar("DIV"); 
              CUP$Sintactica$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()), RESULT);
            }
          return CUP$Sintactica$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // E ::= E por E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactica$stack.peek()).value;
		 float val1= Float.parseFloat(a);
                    float val2= Float.parseFloat(b);
                    float r = val1*val2;
                    RESULT = String.valueOf(r); 
                    enlistar("MULTI");
              CUP$Sintactica$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()), RESULT);
            }
          return CUP$Sintactica$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // E ::= pareni E parend 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-1)).value;
		 RESULT = a; enlistar("E");
              CUP$Sintactica$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$Sintactica$stack.elementAt(CUP$Sintactica$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()), RESULT);
            }
          return CUP$Sintactica$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // E ::= num 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactica$stack.peek()).value;
		  enlistar(a); RESULT= objetar("numero "+a.toString(),"").toString(); 
              CUP$Sintactica$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactica$stack.peek()), RESULT);
            }
          return CUP$Sintactica$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintactica$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintactica$do_action(
    int                        CUP$Sintactica$act_num,
    java_cup.runtime.lr_parser CUP$Sintactica$parser,
    java.util.Stack            CUP$Sintactica$stack,
    int                        CUP$Sintactica$top)
    throws java.lang.Exception
    {
              return CUP$Sintactica$do_action_part00000000(
                               CUP$Sintactica$act_num,
                               CUP$Sintactica$parser,
                               CUP$Sintactica$stack,
                               CUP$Sintactica$top);
    }
}

}
