# find sum of primes below 2 million

primes = [2]
i = 3

LIMIT = 2000000

ps = [2..LIMIT].map (x) -> [x, true]
accprime = 0
for x in ps
        i = x[0]
        p = x[1]
        if p
                j = 2 * i
                while j <= ps[ps.length-1][0]
                        ps[j-2] = [j, false]
                        j += i
                accprime += i
console.log accprime
