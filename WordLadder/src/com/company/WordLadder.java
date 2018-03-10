package com.company;
import java.util.*;
import java.io.*;

public class WordLadder {

    //Stack<String>a1;
    //Queue<Stack<String>>a2;
    static int Ladder(Queue<Stack<String>>a1,Set<String>a2,String w2,Vector<String>alpha,int mark) {
        String w1=a1.peek().peek();
        //a2.remove(a1.peek().peek());
        while (a1.size() > 0 && mark != 1)//控制queue中元素的添加与pop
        {

            String s1 = a1.peek().peek();
            //String temp = new String();
            for (int j = 0; j < s1.length(); j++)//根据一个单词的每个字母来循环
            {
                String temp = s1;
                for (int k = 0; k < 26; k++)//把第j个字母分别换成26个字母
                {
                    StringBuilder ttemp=new StringBuilder(temp);
                    ttemp.replace(j, j + 1, alpha.elementAt(k));
                    temp=ttemp.toString();
                    //System.out.println(temp.toUpperCase());
                    //Iterator<String> iter=a2.iterator();
                    //iter = a2.find(temp);
                    if (a2.contains(temp)) {
                        if (temp.equals(w2)) {//当下一个就是要找的word2的时候，复制并创建一个stack，把temp放入stack，再把stack放入queue，这个stack就是要找的，打印并退出循环
                            a2.remove(temp);
                            Stack<String> wola=a1.peek();
                            //wola = a1.peek();
                            Stack<String>tewola=(Stack<String>)wola.clone();
                            tewola.push(temp);
                            a1.offer(tewola);
                            System.out.println("ladder from "+ w2 +" back to "+w1+":");
                            while (!tewola.empty()) {
                                System.out.println(tewola.peek() + " ");
                                tewola.pop();
                            }
                            mark = 1;
                            return mark;
                        } else {//当下一个不是要找的word2，复制并创建stack，把temp放入stack，再把stack放入queue，所有neighbour找到并放入queue后pop出第一个
                            a2.remove(temp);
                            Stack<String> wola=a1.peek();
                            //wola = a1.peek();
                            Stack<String>tewola=(Stack<String>)wola.clone();
                            tewola.push(temp);

                            a1.offer(tewola);
                        }

                    }

                }


            }
            a1.poll();

        }
        return mark;
    }

    public static void main(String[] args)throws IOException {
        Set<String>dictionary=new HashSet<String>();
        String tename=new String();

        String w1=new String();
        String w2=new String();

        String dict=new String();
        Vector<String>wordlist=new Vector<String>();

        String name=new String();
        while (true) {//判断文件是否能被打开
            //Scanner sc = new Scanner(System.in);
            System.out.println("Dictionary file name?");
            Scanner sc = new Scanner(System.in);
            tename = sc.nextLine();
            File dic = new File(tename);
            //dic.open(tename, ios::in);
            if (dic.exists()) {
                break;
            }
            //dic.clear();
            System.out.println("Unable to open that file.Try again.");



        }
        name = tename;

        File fr = new File(name);
        BufferedReader diction = new BufferedReader(new FileReader(fr));
        //if (true) {
            dict=diction.readLine();
            while (dict!=null)
            {
                wordlist.add(dict);
                dict=diction.readLine();
            }
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
            while (true) {
                //Scanner sc1 = new Scanner(System.in);
                System.out.println("Word #1 (or Enter to quit):");
                Scanner sc1 = new Scanner(System.in);
                w1 = sc1.nextLine();
                w1=w1.toLowerCase();

                if (!w1.equals("")) {
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Word #2 (or Enter to quit):");
                    w2 = sc2.nextLine();
                    w2=w2.toLowerCase();
                    if (w2.equals("")) {
                        System.out.println("have a nice day.");
                        break;
                    }
                }
                else {
                    System.out.println("have a nice day.");
                    break;

                }
                if(!w1.equals(w2)&&w1.length()==w2.length()) {
                    int length = w1.length();
                    for (int cont = 0; cont < wordlist.size(); cont++)
                    {
                        if (wordlist.elementAt(cont).length() == length) {
                            dictionary.add(wordlist.elementAt(cont));
                        }
                    }


                    if (dictionary.contains(w1) && dictionary.contains(w2))
                    {
                        int mark = 0;
                        Stack<String>word=new Stack<String>();
                        word.push(w1);
                        Queue<Stack<String>>woladder=new LinkedList<Stack<String>>();
                        woladder.offer(word);
                        int size = woladder.size();
                        mark=Ladder(woladder, dictionary,  w2, alpha, mark);
                        if (mark == 0) { System.out.println("No word ladder found from" + " "+w2 + " "+"back to"+" "+ w1+"."); }
                    }
                    else {
                        System.out.println("The two words must be found in the dictionary.");

                    }
                    //cout<<endl;

                }
                else if(w1.equals(w2)) {
                    System.out.println("The two words must be different.");

                }
                else if (w1.length() != w2.length()) {
                    System.out.println("The two words must be the same length.");
                }


            }

        //}

        //return 0;
    }
}
