# What is the value of the first triangle number to have over five
# hundred divisors?

fac = (n) ->
        o_n = n
        i = 2
        primes = []
        while n > 1 and i <= o_n/2
                count = 0
                while n % i == 0
                        n = n / i
                        count += 1
                if count > 0
                        primes.push count
                i += 1
        if primes.length == 0
                primes = [1]
        return primes

div_count = (n) ->
        return (v+1 for v in (fac n)).reduce (x,a) -> x * a
        
i = 1
trig = i
big = 0
d = div_count trig
while 500 > d
        if big < d
                big = d
                console.log trig, big
        i += 1
        trig += i
        d = div_count trig
console.log trig