public class CommonElements {
    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c", "d", "er", "fg"};
        String[] array2 = {"jb", "d", "er", "h", "g", "c"};
        HashSet<String> set = new HashSet<>();
        HashSet<String> commonElements = new HashSet<>();
        for (String element : array1) {
            set.add(element);
        }
        for (String element : array2) {
            if (set.contains(element)) {
                commonElements.add(element);
            }
        }
        System.out.println("Common elements between the two arrays: " + commonElements);
    }
}