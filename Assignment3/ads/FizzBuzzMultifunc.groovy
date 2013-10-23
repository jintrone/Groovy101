/**
 * Created with IntelliJ IDEA.
 * User: howardakumiah
 * Date: 10/23/13
 * Time: 12:21 AM
 * To change this template use File | Settings | File Templates.
 */
class FizzBuzzMultifunc {
    def final_list =[]
    def factor_map = [:]
    def inpect_list = []
    static FizzBuzz (x,y){
        for (i in x..y){
            final_list.plus  ("${i%2?'':factor_map['2']}$${i%3?'':factor_map['3']}${i%5?'':factor_map[5]}"?:i)
        }
    static add (map){
        factor_map += [map]
    }
    static remove (){
        factor_map -= [map]
    }
    static inspect(){
        for element in factor_map
        inspect_list.plus (element)
        return inspect_list
    }

}
