package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Collision {
/*
consider movie number as rows in matrix and day number as column, and elements in the matrix are 1 and 0, 1 indicates
movie no x is screening on day no y of matrix M[x][y], 0 indicates no movie screening on that day, the problem is only
one movie should screen in one day and if there are more movies screening in one day we have to count the number of
collisions of movies in each day and calculate total number of collision of movies of all the days.

Explanation:
We have 4 movies (N=4) and 3 days (M=3).

   D1  D2  D3
M1  1   1   1
M2  1   0   0
M3  1   1   0
M4  0   0   0

Day 1: Movies {M1, M2, M3} → Collisions: (M1, M2), (M1, M3), (M2, M3) → 3 Collisions
Day 2: Movies {M1, M3} → Collisions: (M1, M3) → 1 Collision
Day 3: Only M1 → No Collisions

Total Collisions: 3 + 1 = 4
Output:
4

*/

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of movies");
        int N=sc.nextInt();
        System.out.println("Enter no of days");
        int M=sc.nextInt();
        int[][] E=new int[N][M];
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter matrix elements");
        //taking input from the user
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                E[i][j]=sc.nextInt();
            }
        }
        sc.close();

        System.out.println("Matrix E is: " + Arrays.deepToString(E));

        List<Integer> movies=new ArrayList<>();
        int k=0;
        int collisions;
        while (k<M){
            int count=0;
            for (int i=0;i<N;i++){
                int j=k;
                if(E[i][j]==1)
                    count++;
            }
            collisions=(count*(count-1))/2;
            movies.add(collisions);
            k++;
        }
        int sum = 0;
        for (int i:movies){
            sum+=i;
        }

        System.out.println("Number of collisions: " + sum);

    }

}
