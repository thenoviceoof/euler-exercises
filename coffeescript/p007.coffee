# find the 10001st prime

primes = [2]
i = 3
while primes.length < 10001
        trip = false
        for p in primes
                if i % p == 0
                        trip = true
                        break
        if not trip
                primes.push i
        i += 1

console.log primes[primes.length - 1]