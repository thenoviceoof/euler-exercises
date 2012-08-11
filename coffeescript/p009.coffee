# There exists exactly one Pythagorean triplet for which a + b + c = 1000.
# Find the product abc.

p = undefined
for i in [1..999]
        for j in [1..999-i]
                k = 1000 - i - j
                ns = ([i,j,k].map (x) -> Math.pow(x, 2))
                ns.sort (a,b) -> if a<b then 1 else -1
                if ns[0] == ns[1] + ns[2]
                        p = [i,j,k].reduce (x,y) -> x*y

console.log p
