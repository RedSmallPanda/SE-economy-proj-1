package com.company;
import java.util.*;

public class WordLadder {

    Stack<String>a1;
    Queue<Stack<String>>a2;
    static int Ladder(Queue<Stack<String>>a1,Set<String>a2,int size,String w2,Vector<String>alpha,int mark) {


        while (a1.size()>0&&mark!=1)//控制queue中元素的添加与pop
        {

            StringBuilder s1 = new StringBuilder(a1.peek().peek());
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < s1.length(); j++)//根据一个单词的每个字母来循环
            {
                temp = s1;
                for (int k = 0; k < 26; k++)//把第j个字母分别换成26个字母
                {
                    temp.replace(j, j+1, alpha[k]);
                    set<string>::iterator iter;
                    iter = a2.find(temp);
                    if (iter != a2.end())
                    {
                        if (temp == w2) {//当下一个就是要找的word2的时候，复制并创建一个stack，把temp放入stack，再把stack放入queue，这个stack就是要找的，打印并退出循环
                            a2.erase(temp);
                            stack<string>wola;
                            wola = a1.front();
                            wola.push(temp);
                            a1.push(wola);
                            cout << "ladder from data back to code:" << endl;
                            while (!wola.empty())
                            {
                                cout << wola.top() << " ";
                                wola.pop();
                            }
                            mark = 1;
                            break;
                        }

                        else {//当下一个不是要找的word2，复制并创建stack，把temp放入stack，再把stack放入queue，所有neighbour找到并放入queue后pop出第一个
                            a2.erase(temp);
                            stack<string>wola;
                            wola = a1.front();
                            wola.push(temp);
                            a1.push(wola);
                        }

                    }

                }


            }
            a1.pop();

        }



    }
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
