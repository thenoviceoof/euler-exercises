// find the 10001st prime
// using a sieve stolen from http://golang.org/doc/play/sieve.go

package main

import (
	"fmt"
)

func main() {
	primes := make([]int, 10001)
	length := 1
	primes[0] = 2
	i := 3
	for ;length < 10001; {
		prime := true
		for j := 0; j < length; j++ {
			if i % primes[j] == 0 {
				prime = false
				break
			}
		}
		if prime {
			primes[length] = i
			length++
		}
		i++
	}
	fmt.Println(primes[length-1])
}
