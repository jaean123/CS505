import java.math.BigInteger;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tempa"};
        java.util.Arrays.sort(cities);
        for (String city: cities) {
            System.out.print(city + " ");
        }
        System.out.println();

        BigInteger[] hugeNumbers = {
                new BigInteger("829345928342384234"),
                new BigInteger("8240957385834543234534523452"),
                new BigInteger("43896598458934858934895638945892389589245")
        };
        java.util.Arrays.sort(hugeNumbers);
        for (BigInteger number: hugeNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
