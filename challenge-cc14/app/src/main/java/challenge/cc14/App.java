/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge.cc14;

public class App {
      public static void main(String[] args) {

          MaxStack maxStack = new MaxStack();
          maxStack.push(2);
          maxStack.push(6);
          maxStack.push(4);

          System.out.println("Max: " + maxStack.getMax());

          maxStack.pop();
          System.out.println("Max after pop: " + maxStack.getMax());
      }


    }

