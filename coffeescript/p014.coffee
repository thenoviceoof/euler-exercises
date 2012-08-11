# Which starting number, under one million, produces the longest chain?

a = [0, 1]
iter = (n) -> if n%2==0 then n/2 else 3*n+1

MAX = 1000000

li = 0
largest = 0
for i in [2..MAX-1]
        if a[i] != undefined
                continue
        j = i
        path = []
        x = 1
        while j != 1
                path.push j
                j = iter j
                if a[j] != undefined
                        x = a[j]
                        break
        if path.length + x > largest
                largest = path.length + x
                li = i
        for k in [0..path.length-1]
                p = path[k]
                l = path.length - k + x
                if p <= MAX
                        a[p] = l

console.log li