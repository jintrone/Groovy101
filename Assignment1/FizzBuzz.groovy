/**
 * Created with IntelliJ IDEA.
 * User: josh
 * Date: 9/30/13
 * Time: 10:55 AM
 * To change this template use File | Settings | File Templates.
 */
for (i in 1..100) {
    println "${i%3?'':'Fizz'}${i%5?'':'Buzz'}"?:i
}
