interface mediaPlayer{
    void play();
    void pause();
    void Continue();
    void rePlay();
//    Calling this method directly will be causing an error.
    private void pr(){
        System.out.println("Private Method.");
    }
    default void prMethod(){
        pr();
    }
    default void script(){
        System.out.println("This is a script");
    }
}

interface game{
    void openingGame();
    void closingGame();
}

class phone{
    public void Dailing(){
        System.out.println("Dailing a number from Phone.");
    }
    public void Calling(){
        System.out.println("Calling to a number from Phone.");
    }
    public void Declined(){
        System.out.println("Call declined from Phone.");
    }
}

// While implementing interface's methods, that should be called as public, if not, it won't work.
// To implement & Extends work on both, use (Inheritance class name) extends (main class) implements (interfaces(1),(2),(3)) like this.

class latestPhone extends phone implements mediaPlayer, game{
    public void play(){
        System.out.println("Playing Music into Latest Phone.");
    }
    public void pause(){
        System.out.println("Pause Music into Latest Phone.");
    }
    public void Continue(){
        System.out.println("Continue Music into Latest Phone.");
    }
    public void rePlay(){
        System.out.println("Re-Playing Music into Latest Phone.");
    }
    public void Dailing(){
        System.out.println("Dialing a number from Latest Phone.");
    }
    public void Calling(){
        System.out.println("Calling a number from Latest Phone.");
    }
    public void Declined(){
        System.out.println("Declined a call from Latest Phone.");
    }
    public void openingGame(){
        System.out.println("Opening a game from Latest Phone.");
    }
    @Override
    public void closingGame() {
        System.out.println("Opening a game from Latest Phone.");
    }
}

public class defaultMethods_57 {
    public static void main(String[] args) {
        latestPhone lp1 = new latestPhone();
        lp1.Dailing();
        lp1.Calling();
        lp1.Declined();
        lp1.openingGame();
        lp1.closingGame();
        lp1.play();
        lp1.pause();
        lp1.Continue();
        lp1.rePlay();
        lp1.prMethod();
    }
}