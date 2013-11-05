/**
 * Created with IntelliJ IDEA.
 * User: howardakumiah
 * Date: 10/16/13
 * Time: 11:08 AM
 * To change this template use File | Settings | File Templates.
 */
class FizzBuzzClass {

    FizzBuzzClass(Map<Integer, String> x) {
        (1..100).each {
            String output = ""
            x.each { Integer key, String value ->
                if (it % key == 0) {
                    output+=value
                }

            }

            println(output?:it)
        }
    }

    static void main(String[] args) {
        new FizzBuzzClass([2: "alpha", 3: "beta", 5: "gamma"])
    }

}
