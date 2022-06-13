public class GenericMethodTest {
    public static <T> void printArray(T[] array){
        for (T element: array){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
    public static void main(String[] args){
        Integer[] iArray = {10,20,30,40,50};
        Double[] dArray = {1.1,1.4};
        Character[] cArray = {'k','p','n'};

        printArray(iArray);
        printArray(dArray);
        printArray(cArray);
    }
}
