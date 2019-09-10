import support.cse131.ArgsProcessor;

public class Nim {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);

        System.out.println("Computer starts");
        int round = 0;
        int sticks = ap.nextInt("How many number of sticks to begin with? ");
        int currentSticks = 0;

        while (sticks > 0) {
            int sticksCompChose = 0;
            if ((Math.random() < 0.5) || (sticksCompChose > sticks)){
                currentSticks = sticks - 1;
                sticksCompChose = 1;
            }
            else{
                currentSticks = sticks - 2;
                sticksCompChose = 2;
            }
            round = round + 1;
            System.out.println("Round " + round + ", " + sticks + " sticks at start, computer took " + sticksCompChose + " so " + currentSticks + " sticks remain." );
            sticks = currentSticks;
            if (sticks == 0){
                System.out.println("Computer won");
                break;
            }
            int sticksHumChose = ap.nextInt("1 or 2 sticks?");

                while ((sticksHumChose != 2) && (sticksHumChose != 1))  {
                    sticksHumChose = ap.nextInt("1 or 2 sticks?");
                }
            if (sticks==1)    {
                while (sticksHumChose != 1){
                    sticksHumChose = ap.nextInt("Choose 1 or 2 sticks");

                }
            }

            sticks = sticks - sticksHumChose;
            round = round + 1;
            System.out.println("Round " + round + ", " + currentSticks + " sticks at start, human took " + sticksHumChose + " so " + sticks + " sticks remain.");

            if (sticks == 0){
                System.out.println("You won");
            }
        }











    }
}
