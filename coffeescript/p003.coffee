# find a prime factorization, get largest such factor

n = number = 600851475143

# find factors
largest = 1
i = 2
while i < Math.sqrt number
        if n % i == 0
                n /= i
                largest = i
        else
                i += 1

console.log largest
