# use memoization
@values = Hash.new

def fib(n)
  return @values[n] if @values[n]
  return n if n <= 1
  return @values[n] = fib(n - 1) + fib(n - 2)
end

100.times do |i|
  puts fib(i)
end

# not use memoization
a, b = 0, 1
100.times do
  puts a
  a, b = b, a + b
end