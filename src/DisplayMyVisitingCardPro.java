// КНД-12. Євгеній Коваль

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DisplayMyVisitingCardPro {
    public static final String BLUE = "\u001B[34m";
    public static final String BLACK = "\u001B[30m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) throws Exception {
        int speed = 1;


        {try {
                if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }
                else {
                    System.out.print("\033\143");
                }
            } catch (IOException | InterruptedException ex) {}
        }
        while (true) {
            System.out.println(BLUE+"o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o"+BLACK);
            System.out.println("o  /\\       /\\  /\\       /\\  /\\       /\\  /\\       /\\  /\\       /\\  o "+RESET);
            System.out.println("o {o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o} o  "+BLUE);
            System.out.println("o  \\/       \\/  \\/       \\/  \\/       \\/  \\/       \\/  \\/       \\/  o  "+BLACK);
            System.out.println("o  /\\    o o o o o o o o o o o o o o o o o o o o o o o o o o    /\\  o  "+RESET);
            System.out.println("o {o ><{ o                                                 o }>< o} o  "+BLUE);
            System.out.println("o  \\/    o            Yurievich  Yevgeny                   o    \\/  o  "+BLACK);
            System.out.println("o  /\\    o                      Student                    o    /\\  o  "+RESET);
            System.out.println("o {o ><{ o              mob: +380 ХХ ХХХХХХХ               o }>< o} o  "+BLUE);
            System.out.println("o  \\/    o            email: jekakovaj@ukr.net             o    \\/  o  "+BLACK);
            System.out.println("o  /\\    o               Golovkovskaya str. 2              o    /\\  o  "+RESET);
            System.out.println("o {o ><{ o                 Ukraine, Odessa, 65005          o }>< o} o  "+BLUE);
            System.out.println("o  \\/    o                                                 o    \\/  o  "+BLACK);
            System.out.println("o  /\\    o                                                 o    /\\  o  "+RESET);
            System.out.println("o {o ><{ o                                                 o }>< o} o  "+BLUE);
            System.out.println("o  \\/    o                                                 o    \\/  o  "+BLACK);
            System.out.println("o  /\\    o                                                 o    /\\  o  "+RESET);
            System.out.println("o {o ><{ o                                                 o }>< o} o  "+BLUE);
            System.out.println("o  \\/    o                                                 o    \\/  o  "+BLACK);
            System.out.println("o  /\\    o                                                 o    /\\  o  "+RESET);
            System.out.println("o {o ><{ o                                                 o }>< o} o  "+BLUE);
            System.out.println("o {o ><{ o                                                 o }>< o} o  "+BLACK);
            System.out.println("o  \\/    o o o o o o o o o o o o o o o o o o o o o o o o o o    \\/  o  "+RESET);
            System.out.println("o  /\\       /\\  /\\       /\\  /\\       /\\  /\\       /\\  /\\       /\\  o  "+BLUE);
            System.out.println("o {o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o} o  "+BLACK);
            System.out.println("o  \\/       \\/  \\/       \\/  \\/       \\/  \\/       \\/  \\/       \\/  o  "+RESET);
            System.out.println("o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o "+BLUE);
            System.out.println(" |\\__/,|     /\')\r\n" + //
                " |o o  |.--.( (\r\n" + //
                " ( T   )      \\\r\n" + //
                "(((v_(((/(((_/");
            TimeUnit.SECONDS.sleep(speed);
            {try {
                if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }
                else {
                    System.out.print("\033\143");
                }
            } catch (IOException | InterruptedException ex) {}
        }
            System.out.println("o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o");
            System.out.println("o  /\\       /\\  /\\       /\\  /\\       /\\  /\\       /\\  /\\       /\\  o ");
            System.out.println("o {o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o} o  ");
            System.out.println("o  \\/       \\/  \\/       \\/  \\/       \\/  \\/       \\/  \\/       \\/  o  ");
            System.out.println("o  /\\    o o o o o o o o o o o o o o o o o o o o o o o o o o    /\\  o  ");
            System.out.println("o {o ><{ o                                                 o }>< o} o  ");
            System.out.println("o  \\/    o            Yurievich  Yevgeny                   o    \\/  o  ");
            System.out.println("o  /\\    o                      Student                    o    /\\  o  ");
            System.out.println("o {o ><{ o              mob: +380 ХХ ХХХХХХХ               o }>< o} o  "+BLACK);
            System.out.println("o  \\/    o            email: jekakovaj@ukr.net             o    \\/  o  ");
            System.out.println("o  /\\    o               Golovkovskaya str. 2              o    /\\  o  ");
            System.out.println("o {o ><{ o                 Ukraine, Odessa, 65005          o }>< o} o  ");
            System.out.println("o  \\/    o                                                 o    \\/  o  ");
            System.out.println("o  /\\    o                                                 o    /\\  o  ");
            System.out.println("o {o ><{ o                                                 o }>< o} o  ");
            System.out.println("o  \\/    o                                                 o    \\/  o  ");
            System.out.println("o  /\\    o                                                 o    /\\  o  ");
            System.out.println("o {o ><{ o                                                 o }>< o} o  "+RESET);
            System.out.println("o  \\/    o                                                 o    \\/  o  ");
            System.out.println("o  /\\    o                                                 o    /\\  o  ");
            System.out.println("o {o ><{ o                                                 o }>< o} o  ");
            System.out.println("o {o ><{ o                                                 o }>< o} o  ");
            System.out.println("o  \\/    o o o o o o o o o o o o o o o o o o o o o o o o o o    \\/  o  ");
            System.out.println("o  /\\       /\\  /\\       /\\  /\\       /\\  /\\       /\\  /\\       /\\  o  ");
            System.out.println("o {o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o} o  ");
            System.out.println("o  \\/       \\/  \\/       \\/  \\/       \\/  \\/       \\/  \\/       \\/  o  ");
            System.out.println("o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o ");
            System.out.println(" |\\__/,|   (`\\\r\n" + //
                " |o o  |.--.) )\r\n" + //
                " ( T   )     /\r\n" + //
                "(((v_(((/(((_/");
            TimeUnit.SECONDS.sleep(speed);    
            {try {
                if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }
                else {
                    System.out.print("\033\143");
                }
            } catch (IOException | InterruptedException ex) {}
        }
            System.out.println(BLUE+"o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o"+BLACK);
            System.out.println("o  /\\       /\\  /\\       /\\  /\\       /\\  /\\       /\\  /\\       /\\  o "+RESET);
            System.out.println("o {o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o} o  "+BLUE);
            System.out.println("o  \\/       \\/  \\/       \\/  \\/       \\/  \\/       \\/  \\/       \\/  o  "+BLACK);
            System.out.println("o  /\\    o o o o o o o o o o o o o o o o o o o o o o o o o o    /\\  o  "+RESET);
            System.out.println("o {o ><{ o                                                 o }>< o} o  "+BLUE);
            System.out.println("o  \\/    o            Yurievich  Yevgeny                   o    \\/  o  "+BLACK);
            System.out.println("o  /\\    o                      Student                    o    /\\  o  "+RESET);
            System.out.println("o {o ><{ o              mob: +380 ХХ ХХХХХХХ               o }>< o} o  "+BLUE);
            System.out.println("o  \\/    o            email: jekakovaj@ukr.net             o    \\/  o  "+BLACK);
            System.out.println("o  /\\    o               Golovkovskaya str. 2              o    /\\  o  "+RESET);
            System.out.println("o {o ><{ o                 Ukraine, Odessa, 65005          o }>< o} o  "+BLUE);
            System.out.println("o  \\/    o                                                 o    \\/  o  "+BLACK);
            System.out.println("o  /\\    o                                                 o    /\\  o  "+RESET);
            System.out.println("o {o ><{ o                                                 o }>< o} o  "+BLUE);
            System.out.println("o  \\/    o                                                 o    \\/  o  "+BLACK);
            System.out.println("o  /\\    o                                                 o    /\\  o  "+RESET);
            System.out.println("o {o ><{ o                                                 o }>< o} o  "+BLUE);
            System.out.println("o  \\/    o                                                 o    \\/  o  "+BLACK);
            System.out.println("o  /\\    o                                                 o    /\\  o  "+RESET);
            System.out.println("o {o ><{ o                                                 o }>< o} o  "+BLUE);
            System.out.println("o {o ><{ o                                                 o }>< o} o  "+BLACK);
            System.out.println("o  \\/    o o o o o o o o o o o o o o o o o o o o o o o o o o    \\/  o  "+RESET);
            System.out.println("o  /\\       /\\  /\\       /\\  /\\       /\\  /\\       /\\  /\\       /\\  o  "+BLUE);
            System.out.println("o {o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o} o  "+BLACK);
            System.out.println("o  \\/       \\/  \\/       \\/  \\/       \\/  \\/       \\/  \\/       \\/  o  "+RESET);
            System.out.println("o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o "+BLUE);
            System.out.println(" |\\__/,|     /\')\r\n" + //
                " |- -  |.--.( (\r\n" + //
                " ( T   )      \\\r\n" + //
                "(((^_(((/(((_/");
            TimeUnit.SECONDS.sleep(speed);
            {try {
                if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }
                else {
                    System.out.print("\033\143");
                }
            } catch (IOException | InterruptedException ex) {}
        }
           System.out.println("o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o");
            System.out.println("o  /\\       /\\  /\\       /\\  /\\       /\\  /\\       /\\  /\\       /\\  o ");
            System.out.println("o {o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o} o  ");
            System.out.println("o  \\/       \\/  \\/       \\/  \\/       \\/  \\/       \\/  \\/       \\/  o  ");
            System.out.println("o  /\\    o o o o o o o o o o o o o o o o o o o o o o o o o o    /\\  o  ");
            System.out.println("o {o ><{ o                                                 o }>< o} o  ");
            System.out.println("o  \\/    o            Yurievich  Yevgeny                   o    \\/  o  ");
            System.out.println("o  /\\    o                      Student                    o    /\\  o  ");
            System.out.println("o {o ><{ o              mob: +380 ХХ ХХХХХХХ               o }>< o} o  "+BLACK);
            System.out.println("o  \\/    o            email: jekakovaj@ukr.net             o    \\/  o  ");
            System.out.println("o  /\\    o               Golovkovskaya str. 2              o    /\\  o  ");
            System.out.println("o {o ><{ o                 Ukraine, Odessa, 65005          o }>< o} o  ");
            System.out.println("o  \\/    o                                                 o    \\/  o  ");
            System.out.println("o  /\\    o                                                 o    /\\  o  ");
            System.out.println("o {o ><{ o                                                 o }>< o} o  ");
            System.out.println("o  \\/    o                                                 o    \\/  o  ");
            System.out.println("o  /\\    o                                                 o    /\\  o  ");
            System.out.println("o {o ><{ o                                                 o }>< o} o  "+RESET);
            System.out.println("o  \\/    o                                                 o    \\/  o  ");
            System.out.println("o  /\\    o                                                 o    /\\  o  ");
            System.out.println("o {o ><{ o                                                 o }>< o} o  ");
            System.out.println("o {o ><{ o                                                 o }>< o} o  ");
            System.out.println("o  \\/    o o o o o o o o o o o o o o o o o o o o o o o o o o    \\/  o  ");
            System.out.println("o  /\\       /\\  /\\       /\\  /\\       /\\  /\\       /\\  /\\       /\\  o  ");
            System.out.println("o {o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o}{o ><{ }>< o} o  ");
            System.out.println("o  \\/       \\/  \\/       \\/  \\/       \\/  \\/       \\/  \\/       \\/  o  ");
            System.out.println("o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o o ");
            System.out.println(" |\\__/,|   (`\\\r\n" + //
                " |- -  |.--.) )\r\n" + //
                " ( T   )     /\r\n" + //
                "(((^_(((/(((_/");
            TimeUnit.SECONDS.sleep(speed);
            {try {
                if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }
                else {
                    System.out.print("\033\143");
                }
            } catch (IOException | InterruptedException ex) {}
        }
      }
    }
}
