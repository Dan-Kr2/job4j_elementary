package ru.job4j.array;

import com.sun.source.tree.BreakTree;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
      for (int i = 1; i <= postfix.length; i++) {
          if (postfix[postfix.length - i] != word[word.length - i]) {
              return false;
          }
      } return true;
    }
}