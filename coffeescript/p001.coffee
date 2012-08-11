check = (num) -> if (num % 3 == 0 or num % 5 == 0) then num else 0

count = (check n for n in [1..999]).reduce (t,s) -> t + s

console.log count
