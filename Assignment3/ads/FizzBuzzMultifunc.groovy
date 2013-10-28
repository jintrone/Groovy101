/**
 * Created with IntelliJ IDEA.
 * User: howardakumiah
 * Date: 10/23/13
 * Time: 12:21 AM
 * To change this template use File | Settings | File Templates.
 */
class FizzBuzzMultifunc {
    def final_list = []
    def factor_map = [:]
    def inpect_list = []


    FizzBuzzMultifunc(Map m) {

    }


    void print(int x, int y) {

        //map 1->bar;2->foo;...10;->baz
//        x..y.each { i ->
//            def final_list = []
//            factor_map.each {k,v ->
//                if (i % k == 0) final_list<<v
//
//            }
//            if (final_list.isEmpty()) println i
//            else //println final_list  [foo,bar,baz]
//
//            //final_list.plus("${i % 2 ? '' : factor_map['2']}${ i % 3 ? '' : factor_map['3'] } ${ i % 5 ? '' : factor_map[5] } " ?: i)
//        }

    }

    void add(Map map) {
        map.keys.each {

        }
        factor_map += [map]
    }

    void remove() {
        factor_map -= [map]
    }

    def inspect() {

        element in factor_map
        inspect_list.plus(element)
        return inspect_list
    }

    static void main(String[] args) {
    }
}


