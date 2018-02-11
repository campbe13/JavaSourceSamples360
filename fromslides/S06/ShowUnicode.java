/**
 * This class shows unicode characters from 0 - 999
 *
 * NOTE:  there are some more advanced concepts in here
 *    such as using args & for loops that we have not yet covered
 *
 * @author P.Campbell
 * @version today
 **/

public class ShowUnicode {
    public static void main(String[] args)
        {
        int stopAt;
        //System.out.println(args.length);  // used for debugging
        //System.out.println(args[0]);      // used for debugging

        /*
        command line -all then show 0-65536
        otherwise show 0-99
        */

        if (args.length >0 && args[0].equals("-all") )
             stopAt = 65536;
        else
            stopAt = 999;
        //    System.out.println(stopAt);  // used for debuggin

        for (int i = 0; i < stopAt; i++) {
            System.out.printf("num %03d char %c\t", i, i);
                if (i % 3 == 0) {
                    System.out.printf("\n");
                }
        }

    }  // main()
} // ShowUnicode
