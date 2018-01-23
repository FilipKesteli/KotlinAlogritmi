fun main(args: Array<String>) {
    val x = start()
    println(x)
}

/**
 * Take a look at function syntax and make the function start return the string "OK".
 * In the tasks the function TODO() is used that throws an exception.
 * Your job during the koans will be to replace this function invocation
 * with a meaningful code according to the problem.
 */
fun start(): String = "OK"

/**
 * We have a handy tool for Java developers: Java to Kotlin converter.
 * It works better in IntelliJ IDEA, but you can try it online as well.
 * To become familiar with it, please convert the code below.
 * Copy Java code, choose 'Convert from Java' above and copy the result function back.
 */
class KotlinCode {
    fun toJSON(collection: Collection<Int>): String {
        val sb = StringBuilder()
        sb.append("[")
        val iterator = collection.iterator()
        while (iterator.hasNext()) {
            val element = iterator.next()
            sb.append(element)
            if (iterator.hasNext()) {
                sb.append(", ")
            }
        }
        sb.append("]")
        return sb.toString()
    }
}

/*
public class JavaCode {
    public String toJSON(Collection<Integer> collection) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            sb.append(element);
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}*/

