private static void solution(int qtty) {
    int current = 2;
    int counter = 0;
    while (counter < qtty) {

        boolean isPrime = true;
        for (int factor = 2; factor <= current / 2; factor++) {
            if (current % factor == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(current);
            counter++;
        }
        current++;
    }
}

void main() {
    System.out.println("Please input a prime number to list: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    solution(n);
}