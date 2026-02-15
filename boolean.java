
public class Goldbach {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int evenNumber = 28;

        System.out.print(evenNumber + " = ");
        boolean found = false;

        for (int i = 2; i <= evenNumber/2; i++) {
            if (isPrime(i) && isPrime(evenNumber - i)) {
                System.out.println(i + " + " + (evenNumber - i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No prime pair found");
        }
    }
}