package External.util;

import java.time.LocalDateTime;

public class Logger {

    // CharSequence is either a String or StringBuilder
    public static void logToConsole (CharSequence message){
        // Like LD except retains time info too
        LocalDateTime dt = LocalDateTime.now();

        System.out.printf("%1$tD %1$tT : %2$s%n", dt, message);

        if (message instanceof  StringBuilder sb){
            // truncates the length of the SB
            // Hopefully it never will
            sb.setLength(0);
        }
    }

}
