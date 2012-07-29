# largest palindrome from product of two 3-digit numbers

largest = 0
# generate each pair
for i in [1..999]
        for j in [i..999]
                n = i * j
                sn = (String) n
                if sn == sn.split('').reverse().join('') and largest < n
                        largest = n

console.log(largest)