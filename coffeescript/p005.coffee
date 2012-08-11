# What is the smallest positive number that is evenly divisible by all
# of the numbers from 1 to 20?

# find the prime factors of all the numbers, take the union

prime_fac = (n) ->
        facs = []
        for i in [2..Math.sqrt(n)]
                while n % i == 0
                        n /= i
                        facs.push i
        facs = if facs.length then facs else [n]
        facs

facs = [2..20].map (x) -> prime_fac x
facs = facs.map (xs) ->
        d = {}
        for i in xs
                d[i] = if d[i] then d[i]+1 else 1
        return d

all_facs = facs.reduce (c,p) ->
        for k,v of c
                if not p[k] or p[k] < v
                        p[k] = v
        p

f = 1
for k,v of all_facs
        n = (Number) k
        f *= Math.pow(n, v)
console.log f
