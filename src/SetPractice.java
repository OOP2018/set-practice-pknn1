import java.util.*;

/**
 * Practice using a Set.
 */
public class SetPractice {
    /**
     * Add zero or more items to the set, and print what is being added.
     *
     * @param set    is the Set to add items to
     * @param values zero or more Strings to add to set
     */
    public static void addAll(Set<String> set, String... values) {
        for (String value : values) {
            System.out.print(value + " ");
            set.add(value);
        }
        System.out.println();
    }

    /**
     * Print all the elements in a set, using an Iterator.
     */
    public static void print(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    /**
     * Explore behavior of a Set.
     */
    public static void setExplorer() {

        HashSet<String> hashSet = new HashSet<>();
        setTest(hashSet);
        // 2. Print elements in the set using an Iterator over the Set.
        // You're going to need to do this again, so write a method print(Set set) to do it.

        // 3. are the elements printed in same order than you added them?
        // What does this tell you about Sets?


        // 4. Remove all the elements from the set, using a method that
        // defined in Set (and Collection). What is the method to use?

        // 5. Add same elements as exercise 1, but in a different order,
        // such as: "cat", "elephant", "bird", "ant", "dog"

        // 6. Print the elements in the set.  Is the order same as before?

        // 7. Add duplicate elements to the set.  Add another "cat" and "dog".
        // To ensure that these are *distinct* objects use 'set.add(new String("cat"))'
        // and new String("dog").

        // 8. Print the elements in set.  Are there any duplicates?
        // What property of Set does this demonstrate?

        // 9. Repeat the exercises using a TreeSet instead of HashSet.
        //  What is different when you use TreeSet?
        TreeSet<String> treeSet = new TreeSet<>();
        setTest(treeSet);
        // Hint: Use Polymorphism.  Make the Set object be a *parameter* to the
        // method so you can easily use a different set just by changing the parameter!

        // 10. Repeat again using TreeSet with a Comparator.
        Comparator<String> comparator = new StringComparator();
        TreeSet<String> treeSetWithComparator = new TreeSet<>(comparator);
        setTest(treeSetWithComparator);
    }

    /**
     * Test the set for property.
     * @param testSet set to test.
     */
    public static void setTest(Set<String> testSet) {
        System.out.println("Add test:");
        System.out.println("Order [dog, ant, bird, elephant, cat]");
        testSet.add("dog");
        testSet.add("ant");
        testSet.add("bird");
        testSet.add("elephant");
        testSet.add("cat");

        System.out.println("Set contains: ");
        print(testSet);

        System.out.println("Clear and add");
        System.out.println("Order [cat, dog, elephant, bird, ant]");
        testSet.clear();
        testSet.add("cat");
        testSet.add("dog");
        testSet.add("elephant");
        testSet.add("bird");
        testSet.add("ant");

        System.out.println("Set contains: ");
        print(testSet);

        System.out.println("Add duplicate: cat and dog");
        testSet.add("cat");
        testSet.add("dog");
        System.out.println("Set contains: ");
        print(testSet);

        System.out.println();

    }

    public static void main(String[] args) {
        setExplorer();
    }
}
