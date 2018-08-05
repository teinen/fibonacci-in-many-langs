// memoize
var fibs = {}

// fibonacci function
function fib(n) {
  if (n <= 1) return n
  if (fibs[n]) return fibs[n]
  return fibs[n] = fib(n-1) + fib(n-2)
}

for (let i = 0; i < 50; i++) {
  console.log(fib(i))
}