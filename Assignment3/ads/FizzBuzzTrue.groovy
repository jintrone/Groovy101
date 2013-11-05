/**
 * Created with IntelliJ IDEA.
 * User: howardakumiah
 * Date: 11/5/13
 * Time: 4:59 PM
 * To change this template use File | Settings | File Templates.
 */
class FizzBuzzTrue {
    void __init__ (self):
        self.__factors = {}

    void printMap (self, Integer<startInt, endInt):
    (startInt..endInt).each:
            flag = (True)
    for key in self.__factors:
    if i % key == 0:
    flag = False
    println(self.__factors[key], end='')
    if(flag){
        println(i)

    }
    else:
    print()


    void addFactorMap (self, factorMap):
    self.__factors<<factorMap

    void removeFactorInt (self, factorIntList):
    for i in factorIntList:
    if i in self.__factors:
    del self.__factors[i]

    void inspect (self):
    sortedList = []
    for key in self.__factors:
    sortedList.append(key)
    sortedList.sort()

    for val in sortedList:
    print( val,  " => ", self.__factors[val] )
}
