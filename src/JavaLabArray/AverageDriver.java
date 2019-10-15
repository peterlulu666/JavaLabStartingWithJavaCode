package JavaLabArray;

//I will create my AverageDriver file. It only contains the main method.
//The main method should declare and instantiate an Average object.
// The Average object information should then be printed to the console.
public class AverageDriver {
    public static void main(String[] args) {
        var average = new Average();
        average.calculateMean();
        average.selectionSort();
        System.out.println(average.toStrong());



    }
}
