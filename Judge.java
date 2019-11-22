
public class Judge {

    public static void main(String[] args){
        int popSize = 4;
        int[][] trust = {{1,3}, {1,4}, {2,3}, {2,4}, {4,3}};
        int result = findJudge(popSize, trust);
        System.out.println("Judge ID: " + result);
    }

    public static int findJudge (int N, int [][] trust){

        // Represents Log For Those Who Trust Others
        int[] trusting = new int[N];
        // Loop Through 'trust' Array
        for (int i = 0; i < trust.length; i++){
            // Second Value - trust[ ][*]
            for (int j = 0; j < 2; j++){
                int pos = trust[i][0];
                trusting[pos-1] = 1;
            }
        }
        // Search 'trusting' for Someone Who Is Not
        for (int k = 0; k < trusting.length; k++){
            if (trusting[k] == 0) {
                return k+1;
            }
        }
        return -1;
    }
}
