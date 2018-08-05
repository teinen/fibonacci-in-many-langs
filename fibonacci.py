# fibonacci function
def fib(n):
  a, b = 0, 1
  for _ in range(n):
    yield a
    a, b = b, a + b

# print
[ print(i) for i in fib(50) ]