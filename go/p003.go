// find a prime factorization, get largest such factor

package main

import "fmt"

const number int64 = 600851475143

func main() {
	var i int64 = 2
	j := number
	for ; i < j; {
		if j % i == 0 {
			j /= i
		} else {
			i++
		}
	}
	fmt.Println(j)
}
