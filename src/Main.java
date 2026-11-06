public class Main {

    public void iteration(int N) {
        for(int i = N; i > 0; i--) {
            System.out.println(i);
        }
    }

    public void recurssion(int N) {
        System.out.println(N);
        if (N == 1) return;
        recurssion(N - 1);
    }

    public static void main(String[] args) {
        Main r = new Main();

        // 1. Print 1->10 using Iteration
        r.iteration(10);

        // 2. Print 1 -> 10 using recurssion
        r.recurssion(10);
    }
}