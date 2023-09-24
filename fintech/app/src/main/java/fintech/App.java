/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fintech;

public class App {
    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        test1AverageTemperature();
        test2SearchRegionsWithTemperatureHigherTemperature();
        test3MapIdToList();
        test4TemperatureIdToList();
    }

    public static void test1AverageTemperature() {
        System.out.println(StreamAPI.averateTemperatureInRegions());
    }

    public static void test2SearchRegionsWithTemperatureHigherTemperature(){
        System.out.println(StreamAPI.regionsWithTemperatureHigherTemperature(10.1));
        System.out.println(StreamAPI.regionsWithTemperatureHigherTemperature(-1.0));
    }

    public static void test3MapIdToList() {
        System.out.println(StreamAPI.allObservationsForAllRegions());
    }

    public static void test4TemperatureIdToList() {
        System.out.println(StreamAPI.allRegionsForAllTemperature());
    }
}
