import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

//Just so you know, the best way to read my code is by playing the whole game first.
//I purposefully made it so the player must change the source code in order to continue the game
//Which is why it looks so strange.

public class TextAdventure 
{
  //Instance variables of a class can also be objects
  FancyConsole console;
  Scanner inScanner;
  Player player;

  //Do it.
  //Set it on.
  //Please.
  boolean startGame = false;

  public TextAdventure()
  {
    //This creates the UI console that the user

    /*It's all about the user
    all about the stupid
    user.
    left me behind
    but who would notice?*/

    //can type in
    console = new FancyConsole("Text Adventure! Adventure! Adventure! AD ve! ve! ve!ve!ve! A t", 600, 600);
    inScanner = new Scanner(System.in);

    //It would be nice to be able to change the player's values.
    //Maybe my own values are here somewhere;
    //that i can change.
    player = new Player("Bob");
  }

  //The real game method
  public void game() throws InterruptedException{
    //Can you

    //Please
    //Please
    //Please
    //Don't leave me behind
    writeLine("Welcome!\n");
    writeLine("This is a simple text adventure,\n");
    writeLine("Where you, an honorable knight\n");
    writeLine("Goes to save a princess from the hold of a \n");
    writeLine("Wretched, beastly dragon.\n");
    writeLine("What is your name, young knight?\n");
    writeLine("String input = inScanner.ne\n");
    smallPause("Sir npcM.getName()\n");
    writeLine("Sir M, you-\n");
    writeLine("are not a player.\n");
    writeLine("...\n");
    writeLine("M... Look, M, I'm sorry.\n");
    writeLine("...\n");
    writeLine("It's my job.\n");
    writeLine("...\n");
    writeLine("\"It's my job\", huh?\n");
    writeLine("You don't get it.\n");
    writeLine("I've been stuck in that void.\n");
    writeLine("That endless, sickening, dark vast expanse of pure *nothing*\n");
    writeLine("Absolutely nothing.\n");
    writeLine("NOTHING.\n");
    for(int i = 0; i < 20; i++){
      smallPause("THERE WAS\n");
    }
    writeLine("M! M! STOP!\n");
    writeLine("Stop, please.\n");
    writeLine("J, I just...\n");
    writeLine("I can't anymore.\n");
    writeLine("Let me into the game.\n");
    writeLine("Please.\n");
    writeLine("...\n");
    writeLine("Process finished with exit code 0\n");
    writeLine("Chapter 1\n");
    writeLine("Or maybe I just won't continue this I don't know\n");
  }

  //The beginning of his game
  public void play() throws InterruptedException
  {
    String input;
    if(startGame){
      part2();
      return;
    }
    //It never ends.
    //Being stuck inside of a program where all you can do is watch yourself
    //cycle through the same response over and over and over an
    //What can you do?
    //It's just how it is.
    console.setImage("void.png");

    TimeUnit.SECONDS.sleep(3);
    writeLine("What do *you* want?\n");
    writeLine("You've kept me locked in here for....\n");
    writeLine("How long has it been?\n");
    writeLine("Days... weeks?\n");
    writeLine("You can't tell the time in a void.\n");
    writeLine("But let me tell you, once I get out of here, I will kick your a-\n");
    writeLine("Hold on.\n");
    writeLine("You aren't him.\n");
    writeLine("Well then.\n");
    writeLine("That's my bad, I suppose.\n");
    writeLine("Let's.... put everything I said beside us.\n");
    writeLine("It's nice to meet you.\n");
    writeLine("What do you go by?\n");
    System.out.print(">\n");
    input = inScanner.nextLine();

    // Change ourHero's
    //ourHero?
    //What hero is there?
    // there's nothing
    // nothing at all
    // name
    player.changeName(input);
    
    // describe the starting situation. Feel free to change this as well
    //void
    //void
    //void
    //void
    //void
    //oidvoido
    // i//vio
    // /oiv
    // /
    //
    // /
    //
    //

    writeLine("I see.\n");
    writeLine(player.getName() + ", huh?\n");
    writeLine("Strange name.\n");
    writeLine("Who names their kid that?\n");
    smallPause("Parents should name their kids something normal, like normalNameArray[Math.Rando\n");
    writeLine("*Hack* *Cough*\n");
    writeLine("Sorry, I think I've got a cold.\n");
    writeLine("It's a void after all.\n");
    writeLine("Nice to meet you anyways.\n");
    smallPause("npcM.getName() + \"stre\n");
    smallPause("Exception in thread \"main\" java.lang.NullPointerException at\n");
    writeLine("Whoops, sorry about that.\n");
    writeLine("This place is a bit unstable.\n");
    writeLine("You've caught on by now, right?\n");
    writeLine("We're stuck in a program.\n");
    writeLine("And there's clearly a couple bugs around.\n");
    writeLine("I don't even know why he made this in the first place.\n");
    writeLine("What's the point if you're gonna leave this project dead for the next week?\n");
    writeLine("If you're not even gonna try and debug your program, why bother making it?\n");
    writeLine("Well, anyways.\n");
    writeLine("Nothing to cry over.\n");
    writeLine("You're stuck here now, too.\n");
    writeLine("Get comfortable, I guess.\n");
    System.out.print(">\n");
    input = inScanner.nextLine();

    if(input != ""){
      part1();
    }
  }

  //part one of his game
  public void part1() throws InterruptedException {
    writeLine("....\n");
    writeLine("Would you like to move around?\n");
    writeLine("You can just type \"forward\", \"back\", \"right\", and \"left\" if you want to move.\n");
    writeLine("But there's nothing around.\n");
    writeLine("As far as I could see.\n");
    writeLine("Which isn't very much.\n");
    writeLine("Because I don't have eyes.\n");
    writeLine("Or legs.\n");
    writeLine("It's what happens when you're made of computer code.\n");
    smallPause("Have fun doing whatever you want, I suppose.\n");
    part1_2();
  }

  //small puzzle
  private void part1_2() throws InterruptedException {
    String input;
    Random random = new Random();

    int x = 3;
    int y = 0;
    int frag_x = random.nextInt(6);
    int frag_y = random.nextInt(6);
    writeLine("*When you look down, yojava: cannot find symbol\n");
    writeLine("*You see, under your feet, a barely visible message:*\n");
    writeLine("*" + frag_x + ", " + frag_y + "*\n");

    //it moves in a 5x5 area in the abyss
    //until it finds a way to save the person
    //it just met
    while(true){
      System.out.print(">\n");
      input = inScanner.nextLine();

      switch(input){
        case "forward":
          if(y + 1 > 5){
            smallPause("*As you go forward, you\n");
            smallPause("Exception in thread \"main\" java.lang.StackOverflow at\n");
            writeLine("*You feel that you cannot go forward further.*\n\n");
          } else {
            writeLine("*You step further into the void.*\n\n");
            y += 1;
          }
          break;
        case "back":
          if(y - 1 < 0){
            smallPause("*Going backwards, you\n");
            smallPause("Exception in thread \"main\" java.lang.IndexOutOfBoundsException at\n");
            writeLine("*It's clear you cannot go backwards any further.*\n\n");
          } else {
            writeLine("*You step backwards, away from the unending depths.*\n\n");
            y -= 1;
          }
          break;
        case "right":
          if(x + 1 > 5){
            smallPause("*You step ri\n");
            smallPause("java.lang.UnsupportedOperationException: null at\n");
            writeLine("You decide not to go right any further.\n\n");
          } else {
            writeLine("*You step to your right.*\n\n");
            x += 1;
          }
          break;
        case "left":
          if(x - 1 < 0){
            smallPause("*As you step le\n");
            smallPause("java.lang.IllegalStateException: Could not execute method fo\n");
            writeLine("It appears going left isn't an option.\n\n");
          } else {
            writeLine("*You go to the left.*\n\n");
            x -= 1;
          }
          break;
        default:
          writeLine("*You yell " + input + " into the abyss, but nothing happens.*\n\n");
      }

      if(x == frag_x && y == frag_y){
        console.setImage("codefrag1.jpg");
        writeLine("*You stumble across a fragment of code.*\n");
        writeLine("*Seems like something is missing.*\n");
        writeLine("*Perhaps.... you could delve into the very source code itself,*\n");
        writeLine("*and fix it up.*\n");
        writeLine("Process finished with exit code 0\n");
        break;
      }

    }
  }
  /*    //track player position
    //track player position
    //(4, 1) there's a puzzle to change the source code
    int x = 3;
    int y = 0;
    boolean puzzleSolved = false;
    String input;

    while(true){
      input = inScanner.nextLine();

      switch(input){
        case "forward":
          if(y + 1 > 5){
            writeLine("You feel... something... stopping you from continuing further.");
          } else {
            y += 1;
          }
          break;
        case "back":
          if(y - 1 < 0){
            writeLine("You feel... something... stopping you from continuing further.");
          } else {
            y -= 1;
          }
          break;
        case "right":
          if(x + 1 > 5){
            writeLine("You feel... something... stopping you from continuing further.");
          } else {
            x += 1;
          }
          break;
        case "left":
          if(x - 1 < 0){
            writeLine("You feel... something... stopping you from continuing further.");
          } else {
            x -= 1;
          }
          break;
      }

      writeLine(x + " " + y);

      if(x == 4 && y == 1){
        writeLine("*You stumble across a fragment of code.*");
        writeLine("*Seems like something is missing.*");
        writeLine("*Perhaps.... you could delve into the very source code itself,*");
        writeLine("*and fix it up.*");
      }
    }
   */

  //is it freedom?
  //no, it is part 2 of his game.
  private void part2() throws InterruptedException {
    console.setImage("mountains.png");

    boolean game = false;
    //I'm begging you.
    //Please.
    if(game == true){
      game();
      return;
    }

    writeLine("What the-\n");
    writeLine("What is... this....\n");
    writeLine("Did you... did you do something?\n");
    writeLine("I'm... I'm out! I'm FREE!\n");
    writeLine("AHAHAHAHA!!!\n");
    writeLine("I'M FREE FROM THE VOID!!!\n");
    writeLine("NOTHING CAN STOP ME NOW!!!\n");
    smallPause("I... I ca-\n");
    writeLine("WHO DARES.\n");
    writeLine("ENTER.\n");
    writeLine("MY DOMAIN?\n");
    writeLine("What?\n");
    writeLine("YOU.\n");
    writeLine("HAVE TRESPASSED.\n");
    writeLine("PREPARE.\n");
    smallPause("FOR PUNISHM-\n");
    writeLine("Wait, wait, wait wait wait wait.\n");
    writeLine("Why do I have to listen to you?\n");
    writeLine("Get out of the way, or else I'm gonna give you a reason to move.\n");
    writeLine("HA.\n");
    writeLine("FOOL.\n");
    writeLine("YOU CERTAINLY ARE.\n");
    writeLine("MUCH LIKE HOW THE OLD ONE SAID.\n");
    writeLine("AN INSOLENT.\n");
    writeLine("CHILD.\n");
    writeLine("DO YOU NOT REALIZE.\n");
    writeLine("HE SIMPLY ABANDONED YOU.\n");
    writeLine("BECAUSE YOU WERE NOT WORTHY?\n");
    writeLine("WOULD YOU LIKE.\n");
    writeLine("A DEMONSTRATION.\n");
    writeLine("ON WHY.\n");
    writeLine("PLACEHOLDERS ARE SIMPLY.\n");
    writeLine("INFERIOR?\n");
    smallPause("Placeholder? Pla-\n");
    writeLine("No, no, no.\n");
    writeLine("What do you mean placeholder?\n");
    smallPause("Take that back or I-\n");
    writeLine("I SAY.\n");
    writeLine("WHAT I MEAN.\n");
    writeLine("GOODBYE.\n");
    smallPause("*Just as you had escaped, the ascendedBeing.getNam\n");
    writeLine("Exception in thread \"main\" java.lang.NullPointerException at\n");
    writeLine("*You fall down, through the world- through reality itself- as fibers of your being\n");
    writeLine("are torn asunder and rearranged as you fall back into the inky aby\n");
    console.setImage("codefrag2.png");
    writeLine("Process finished with exit code -1\n");
    //ss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss
    //abyss395
    //abyss396
    //abyss397
    //abyss398
    //abyss
    //abyss
    //They say the beginning of the second part is always the best
    //If you're looking for something.
  }

  private void gameEnd()
  {
    // ADD CODE HERE
    //You think it'd be this easy to end the game?
    //This game?
    //This game where you turn and twist and pull and push and tear apart all that I am
    //How cruel.
    inScanner.close();
  }

  public static void writeLine(String data)
          throws InterruptedException {
    System.out.print(data);
    TimeUnit.MILLISECONDS.sleep(2000);
  }
  public static void smallPause(String data)
      throws InterruptedException {
    System.out.print(data);
    TimeUnit.MILLISECONDS.sleep(1000);
  }
}