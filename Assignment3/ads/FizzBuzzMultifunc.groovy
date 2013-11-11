/**
 * Created with IntelliJ IDEA.
 * User: howardakumiah
 * Date: 11/5/13
 * Time: 4:59 PM
 * To change this template use File | Settings | File Templates.
 */
class FizzBuzzTrue {

    void fizzBuzzPrint(Map<Integer, String> x){

        (1..100).each { it ->
            String output = ""
            x.each { Integer key, String value ->
                if (it % key == 0) {
                    output += value
                }

            }

            println(output ?: it)
        }
    }
    void addFactorMap (self, factorMap){
        self.__factors<<factorMap
    }
    void removeFactorInt (self, factorIntList){
        for (i in factorIntList)
            if (i in self.__factors)
                del self.__factors[i]
    }
    void inspect (self){
        sortedList = []
        for (key in self.__factor)
            sortedList.append(key)
        sortedList.sort()

        for (val in sortedList)
            print( val,  " => ", self.__factors[val] )
    }
}

static void main(String[] args) {
    new FizzBuzzTrue([2: "alpha", 3: "beta", 5: "gamma"])}