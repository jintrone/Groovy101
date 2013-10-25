/**
 * Created with IntelliJ IDEA.
 * User: howardakumiah
 * Date: 10/16/13
 * Time: 11:08 AM
 * To change this template use File | Settings | File Templates.
 */
class FizzBuzzClass {
    static main void 
    def factor_map = ([2:”alpha”,3:”beta”,5:”gamma”])
    static FizzBuzz (factor_map){
        for (i in 1..100){
            printl n "${i%2?'':factor_map['2']}$${i%3?'':factor_map['3']}${i%5?'':factor_map[5]}"?:i
        }
    }

}
