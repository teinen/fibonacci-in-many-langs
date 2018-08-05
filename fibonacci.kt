val fibs = mutableMapOf(0 to 0L, 1 to 1L)

fun main(args: Array<String>) {
  for (i in 0..50) {
    println(fib(i))
  }
}

// fibonacci function
fun fib(n: Int): Long? {
  return if (fibs.containsKey(n)) fibs[n]
        else {
          fibs.put(n, fib(n-1)!!+fib(n-2)!!)
          fibs[n]
        }
}