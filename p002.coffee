# generate fib sequence until 4 million, add up even values

even = (n) -> if n % 2 == 0 then true else false

p = 1
c = 2
count = 0
while c < 4000000
        count = count + if even c then c else 0
        t = c
        c = p + c
        p = t

console.log count
