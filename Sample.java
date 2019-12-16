public class Sample {
  public static void main(String[] args) {
    String bear = "🐻";

    // If the previous line doesn't show up in your editor,
    // you can comment it out and use this declaration instead: 
    // String bear = "\ud83d\udc3b";

    int bearCodepoint = bear.codePointAt(bear.offsetByCodePoints(0, 0));
    int mysteryAnimalCodepoint = bearCodepoint + 1;

    char mysteryAnimal[] = {Character.highSurrogate(mysteryAnimalCodepoint),
                            Character.lowSurrogate(mysteryAnimalCodepoint)};
    // System.out.print(🍙(1,2));
    System.out.println("The Coderland Zoo's latest attraction: " + String.valueOf(mysteryAnimal));
  }

//   private String 🍙(int a, int b){

//       return "aiu";
//   }
}