# find difference between the sum of squares and square of sums for [1..100]

ns = [1..100]
sumsqr = (ns.map (x) -> Math.pow(x, 2)).reduce (x,y) -> x + y
sqrsum = Math.pow((ns.reduce (x,y) -> x + y), 2)
console.log sqrsum - sumsqr
