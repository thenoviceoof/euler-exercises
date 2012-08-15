# largest palindrome from product of two 3-digit numbers

max = 999
largest = 0
# generate each pair
for i in [1..max]
        for j in [i..max]
                n = i * j
                sn = (String) n
                if sn == sn.split('').reverse().join('') and largest < n
                        largest = n

console.log(largest)