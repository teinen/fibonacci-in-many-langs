// memoize
var fibs = {}

// fibonacci function
function fib(n) {
  if (n === 0) return 0
  if (n === 1) return 1
  if (fibs[n]) return fibs[n]
  return fibs[n] = fib(n-1) + fib(n-2)
}

for (let i = 0; i < 50; i++) {
  console.log(fib(i))
}