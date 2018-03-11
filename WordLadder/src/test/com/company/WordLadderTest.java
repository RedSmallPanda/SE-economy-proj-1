package test.com.company; 

import com.company.WordLadder;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import java.util.*;

import static junit.framework.TestCase.assertEquals;


/** 
* WordLadder Tester. 
* 
* @author <Authors name> 
* @since <pre>ÈýÔÂ 11, 2018</pre> 
* @version 1.0 
*/ 
public class WordLadderTest {
    private static WordLadder wdld = new WordLadder();
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: QueueStackOp(Queue<Stack<String>>q1,String ss)
* 
*/ 
@Test
public void testQueueStackOp() throws Exception {
    Stack<String> s1=new Stack<String>();
    s1.push("a");
    Stack<String> s2=new Stack<String>();
    s2.push("b");
    s2.push("c");
    Stack<String> temps2=new Stack<String>();
    temps2.push("a");
    Queue<Stack<String>>q1=new LinkedList<Stack<String>>();
    q1.offer(s1);
    q1.offer(s2);
    Queue<Stack<String>>tempq1=new LinkedList<Stack<String>>();
    tempq1.offer(s1);
    String temp="asdasd";
    temps2.push(temp);
    tempq1.offer(s2);
    tempq1.offer(temps2);
    assertEquals(tempq1,WordLadder.QueueStackOp(q1,temp));
}

/**
 *
 * Method: Ladder(Queue<Stack<String>>a1, Set<String>a2, String w2, Vector<String>alpha, int mark)
 *
 */
@Test
public void testLadder() throws Exception {
    Set<String>dict= new HashSet<String>();
    dict.add("code");
    dict.add("cade");
    dict.add("cate");
    dict.add("date");
    dict.add("data");
    dict.add("cote");
    dict.add("apple");
    dict.add("pencil");
    dict.add("pen");
    dict.add("pineapple");
    Queue<Stack<String>>q1=new LinkedList<Stack<String>>();
    Stack<String>s1=new Stack<String>();
    String w1="code";
    s1.push(w1);
    q1.offer(s1);
    Vector<String>alpha=new Vector<String>();
    String a = "a";
    String b = "b";
    String c = "c";
    String d = "d";
    String e = "e";
    String f = "f";
    String g = "g";
    String h = "h";
    String i = "i";
    String j = "j";
    String k = "k";
    String l = "l";
    String m = "m";
    String n = "n";
    String o = "o";
    String p = "p";
    String q = "q";
    String r = "r";
    String s = "s";
    String t = "t";
    String u = "u";
    String v = "v";
    String w = "w";
    String x = "x";
    String y = "y";
    String z = "z";
    alpha.add(a); alpha.add(b); alpha.add(c); alpha.add(d); alpha.add(e);
    alpha.add(f); alpha.add(g); alpha.add(h); alpha.add(i); alpha.add(j);
    alpha.add(k); alpha.add(l); alpha.add(m); alpha.add(n); alpha.add(o);
    alpha.add(p); alpha.add(q); alpha.add(r); alpha.add(s); alpha.add(t);
    alpha.add(u); alpha.add(v); alpha.add(w); alpha.add(x); alpha.add(y);
    alpha.add(z);
    assertEquals(1,WordLadder.Ladder(q1,dict,"data",alpha,0));
    }

/**
*
*
*
* Method: Ladder(Queue<Stack<String>>a1, Set<String>a2, String w2, Vector<String>alpha, int mark)
*
*/
@Test
public void testLadder2() throws Exception {
    Set<String>dict= new HashSet<String>();
    dict.add("code");
    dict.add("cade");
    dict.add("cate");
    dict.add("date");
    dict.add("data");
    dict.add("cote");
    dict.add("apple");
    dict.add("mouse");
    dict.add("pencil");
    dict.add("pen");
    dict.add("pineapple");
    Queue<Stack<String>>q1=new LinkedList<Stack<String>>();
    Stack<String>s1=new Stack<String>();
    String w1="apple";
    s1.push(w1);
    q1.offer(s1);
    Vector<String>alpha=new Vector<String>();
    String a = "a";
    String b = "b";
    String c = "c";
    String d = "d";
    String e = "e";
    String f = "f";
    String g = "g";
    String h = "h";
    String i = "i";
    String j = "j";
    String k = "k";
    String l = "l";
    String m = "m";
    String n = "n";
    String o = "o";
    String p = "p";
    String q = "q";
    String r = "r";
    String s = "s";
    String t = "t";
    String u = "u";
    String v = "v";
    String w = "w";
    String x = "x";
    String y = "y";
    String z = "z";
    alpha.add(a); alpha.add(b); alpha.add(c); alpha.add(d); alpha.add(e);
    alpha.add(f); alpha.add(g); alpha.add(h); alpha.add(i); alpha.add(j);
    alpha.add(k); alpha.add(l); alpha.add(m); alpha.add(n); alpha.add(o);
    alpha.add(p); alpha.add(q); alpha.add(r); alpha.add(s); alpha.add(t);
    alpha.add(u); alpha.add(v); alpha.add(w); alpha.add(x); alpha.add(y);
    alpha.add(z);
    assertEquals(0,WordLadder.Ladder(q1,dict,"mouse",alpha,0));
    }

 /**
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception {

}


}
