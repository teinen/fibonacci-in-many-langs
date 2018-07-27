// memoize value
var fibs = {}
var count = 0

function fib(n) {
  count += 1

  if (fibs[n]) {
    return fibs[n]
  } else if (n <= 1) {
    return 1
  } else {
    return fibs[n] = fib(n - 1) + fib(n - 2)
  }
}

for (let i = 0; i < 30; i++) {
  console.log(fib(i))
}

console.log(count + " called.")